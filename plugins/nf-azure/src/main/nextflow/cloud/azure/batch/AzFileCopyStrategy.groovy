/*
 * Copyright 2021, Microsoft Corp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nextflow.cloud.azure.batch

import java.nio.file.Path

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import nextflow.cloud.azure.config.AzConfig
import nextflow.cloud.azure.file.AzBashLib
import nextflow.executor.SimpleFileCopyStrategy
import nextflow.processor.TaskBean
import nextflow.processor.TaskRun
import nextflow.util.Duration
import nextflow.util.Escape
/**
 * Implements file copy strategy for Azure Batch
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Slf4j
@CompileStatic
class AzFileCopyStrategy extends SimpleFileCopyStrategy {

    private AzConfig config
    private int maxTransferAttempts
    private int maxParallelTransfers
    private Duration delayBetweenAttempts
    private String sasToken
    private Path remoteBinDir
    private boolean useSdkFileTransfer

    protected AzFileCopyStrategy() {}

    AzFileCopyStrategy(TaskBean bean, AzBatchExecutor executor) {
        super(bean)
        this.config = executor.config
        this.remoteBinDir = executor.remoteBinDir
        this.sasToken = config.storage().sasToken
        this.maxParallelTransfers = config.batch().maxParallelTransfers
        this.maxTransferAttempts = config.batch().maxTransferAttempts
        this.delayBetweenAttempts = config.batch().delayBetweenAttempts
        // Check if the SDK file transfer is enabled
        this.useSdkFileTransfer = config.batch().useSdkFileTransfer
        
        if (useSdkFileTransfer) {
            log.debug "[AZURE BATCH] Using Azure Batch SDK for file transfers instead of azcopy"
        }
    }

    @Override
    String getEnvScript(Map environment, boolean container) {
        if( container )
            throw new IllegalArgumentException("Parameter `container` not supported by ${this.class.simpleName}")

        final result = new StringBuilder()
        final copy = environment ? new LinkedHashMap<String,String>(environment) : new LinkedHashMap<String,String>()
        copy.remove('PATH')
        copy.put('PATH', '$PWD/.nextflow-bin:$AZ_BATCH_NODE_SHARED_DIR/bin/:$PATH')
        
        // Only add AzCopy related env vars if we're not using SDK file transfer
        if (!useSdkFileTransfer) {
            copy.put('AZCOPY_LOG_LOCATION', '$PWD/.azcopy_log')
            copy.put('AZ_SAS', sasToken)
        }

        // finally render the environment
        final envSnippet = super.getEnvScript(copy,false)
        if( envSnippet )
            result << envSnippet
        return result.toString()
    }

    static String uploadCmd(String source, Path targetDir) {
        "nxf_az_upload ${Escape.path(source)} '${AzHelper.toHttpUrl(targetDir)}'"
    }

    @Override
    String getBeforeStartScript() {
        // Always include AzCopy script for bin directory handling
        return AzBashLib.script(config.azcopy(), maxParallelTransfers, maxTransferAttempts, delayBetweenAttempts)
    }

    @Override
    String getStageInputFilesScript(Map<String, Path> inputFiles) {
        // When using SDK file transfer, we don't need to stage any files
        // They will be automatically downloaded by the Azure Batch service including bin files
        if (useSdkFileTransfer) {
            // Make bin files executable if they exist
            if (remoteBinDir) {
                return """\
                chmod +x \$PWD/.nextflow-bin/* || true
                """.stripIndent(true)
            }
            return ""
        }
        
        // Otherwise, use the azcopy approach
        String result = ( remoteBinDir ? """\
            nxf_az_download '${AzHelper.toHttpUrl(remoteBinDir)}' \$PWD/.nextflow-bin
            chmod +x \$PWD/.nextflow-bin/* || true
            """.stripIndent(true) : '' )
        
        result += 'downloads=(true)\n'
        result += super.getStageInputFilesScript(inputFiles) + '\n'
        result += 'nxf_parallel "${downloads[@]}"\n'
        return result
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String stageInputFile( Path path, String targetName ) {
        // When using SDK file transfer, we don't need to stage the file
        if (useSdkFileTransfer) {
            return null
        }
        
        // third param should not be escaped, because it's used in the grep match rule
        def stage_cmd = maxTransferAttempts > 1
                ? "downloads+=(\"nxf_cp_retry nxf_az_download '${AzHelper.toHttpUrl(path)}' ${Escape.path(targetName)}\")"
                : "downloads+=(\"nxf_az_download '${AzHelper.toHttpUrl(path)}' ${Escape.path(targetName)}\")"
        return stage_cmd
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String getUnstageOutputFilesScript(List<String> outputFiles, Path targetDir) {
        // When using SDK file transfer, output files are handled by Azure Batch OutputFiles
        if (useSdkFileTransfer) {
            return null
        }
        
        final patterns = normalizeGlobStarPaths(outputFiles)
        // create a bash script that will copy the out file to the working directory
        log.trace "[AZURE BATCH] Unstaging file path: $patterns"

        if( !patterns )
            return null

        final escape = new ArrayList(outputFiles.size())
        for( String it : patterns )
            escape.add( Escape.path(it) )

        return """\
            uploads=()
            IFS=\$'\\n'
            for name in \$(eval "ls -1d ${escape.join(' ')}" | sort | uniq); do
                uploads+=("nxf_az_upload '\$name' '${AzHelper.toHttpUrl(targetDir)}'")
            done
            unset IFS
            nxf_parallel "\${uploads[@]}"
            """.stripIndent(true)
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String touchFile( Path file ) {
        "echo start > .command.begin"
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String fileStr( Path path ) {
        Escape.path(path.getFileName())
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String copyFile( String name, Path target ) {
        // When using SDK file transfer, output files are handled by Azure Batch OutputFiles
        if (useSdkFileTransfer) {
            return "true" // No-op command that succeeds
        }
        return "nxf_az_upload ${Escape.path(name)} '${AzHelper.toHttpUrl(target.parent)}'"
    }

    /**
     * {@inheritDoc}
     */
    String exitFile( Path path ) {
        " > ${TaskRun.CMD_EXIT}"
    }

    /**
     * {@inheritDoc}
     */
    @Override
    String pipeInputFile( Path path ) {
        " < ${Escape.path(path.getFileName())}"
    }
}
