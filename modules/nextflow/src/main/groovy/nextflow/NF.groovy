/*
 * Copyright 2013-2024, Seqera Labs
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

package nextflow

import groovy.runtime.metaclass.NextflowDelegatingMetaClass
import nextflow.extension.CH
import nextflow.plugin.extension.PluginExtensionProvider
import nextflow.script.ExecutionStack
import nextflow.script.WorkflowBinding
/**
 * Helper class to shortcut common api 
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class NF {

    static private Session session() {
        return (Session)Global.session
    }

    static String getSyntaxParserVersion() {
        return SysEnv.get('NXF_SYNTAX_PARSER', 'v1')
    }

    static boolean isSyntaxParserV2() {
        return getSyntaxParserVersion() == 'v2'
    }

    static void init() {
        NextflowDelegatingMetaClass.provider = PluginExtensionProvider.INSTANCE()
        CH.init()
        WorkflowBinding.init()
    }

    static boolean hasOperator(String name) {
        NextflowDelegatingMetaClass.provider.operatorNames().contains(name)
    }

    static boolean isDsl1() {
        !NextflowMeta.instance.isDsl2()
    }

    static boolean isDsl2() {
        NextflowMeta.instance.isDsl2()
    }

    static Binding getBinding() {
        isDsl2() ? ExecutionStack.binding() : session().getBinding()
    }

    static String lookupVariable(value) {
        if( isDsl2() )
            return WorkflowBinding.lookup(value)
        return session().getBinding().getVariableName(value)
    }

    static boolean isStrictMode() {
        NextflowMeta.instance.isStrictModeEnabled()
    }

    static boolean isModuleBinariesEnabled() {
        NextflowMeta.instance.isModuleBinariesEnabled()
    }

    static boolean isOutputDefinitionEnabled() {
        NextflowMeta.instance.preview.output
    }

    static boolean isRecurseEnabled() {
        NextflowMeta.instance.preview.recursion
    }
}
