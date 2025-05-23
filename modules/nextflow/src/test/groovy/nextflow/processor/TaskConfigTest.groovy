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

package nextflow.processor

import java.nio.file.Paths

import nextflow.exception.FailedGuardException
import nextflow.exception.ProcessUnrecoverableException
import nextflow.script.BaseScript
import nextflow.script.ProcessConfig
import nextflow.script.TaskClosure
import nextflow.util.Duration
import nextflow.util.MemoryUnit
import spock.lang.Specification
/**
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
class TaskConfigTest extends Specification {

    def testShell() {
        when:
        def config = new TaskConfig().setContext(my_shell: 'hello')
        config.shell = value
        then:
        config.shell == expected
        config.getShell() == expected

        where:
        expected             | value
        ['/bin/bash', '-ue'] | null
        ['/bin/bash', '-ue'] | []
        ['/bin/bash', '-ue'] | ''
        ['bash']             | 'bash'
        ['bash']             | ['bash']
        ['bash', '-e']       | ['bash', '-e']
        ['zsh', '-x']        | ['zsh', '-x']
        ['hello']            | { "$my_shell" }
    }

    def testErrorStrategy() {
        when:
        def config = new TaskConfig(map)

        then:
        config.errorStrategy == strategy
        config.getErrorStrategy() == strategy

        where:
        strategy                    | map
        ErrorStrategy.TERMINATE     | [:]
        ErrorStrategy.TERMINATE     | [errorStrategy: 'terminate']
        ErrorStrategy.TERMINATE     | [errorStrategy: 'TERMINATE']
        ErrorStrategy.IGNORE        | [errorStrategy: 'ignore']
        ErrorStrategy.IGNORE        | [errorStrategy: 'Ignore']
        ErrorStrategy.RETRY         | [errorStrategy: 'retry']
        ErrorStrategy.RETRY         | [errorStrategy: 'Retry']
    }

    def testErrorStrategy2() {
        when:
        def config = new TaskConfig()
        config.context = [x:1]
        config.errorStrategy = value
        then:
        config.errorStrategy == expect
        config.getErrorStrategy() == expect

        where:
        expect                      | value
        ErrorStrategy.TERMINATE     | null
        ErrorStrategy.TERMINATE     | 'terminate'
        ErrorStrategy.TERMINATE     | 'TERMINATE'
        ErrorStrategy.IGNORE        | 'ignore'
        ErrorStrategy.IGNORE        | 'Ignore'
        ErrorStrategy.RETRY         | 'retry'
        ErrorStrategy.RETRY         | 'Retry'
        ErrorStrategy.RETRY         | { x == 1 ? 'retry' : 'ignore' }
        ErrorStrategy.FINISH        | 'finish'
    }

    def testModules() {
        given:
        def config
        def local

        when:
        config = new ProcessConfig([:])
        config.module 't_coffee/10'
        config.module( [ 'blast/2.2.1', 'clustalw/2'] )
        local = config.createTaskConfig()
        then:
        local.module == ['t_coffee/10', 'blast/2.2.1', 'clustalw/2']
        local.getModule() == ['t_coffee/10','blast/2.2.1', 'clustalw/2']


        when:
        config = new ProcessConfig([:])
        config.module 'a/1'
        config.module 'b/2:c/3'
        local = config.createTaskConfig()
        then:
        local.module == ['a/1','b/2','c/3']


        when:
        config = new ProcessConfig([:])
        config.module { 'a/1' }
        config.module { 'b/2:c/3' }
        config.module 'd/4'
        local = config.createTaskConfig()
        local.setContext([:])
        then:
        local.module == ['a/1','b/2','c/3', 'd/4']


        when:
        config = new ProcessConfig([:])
        config.module = 'b/2:c/3'
        local = config.createTaskConfig()
        then:
        local.module == ['b/2','c/3']
        local.getModule() == ['b/2','c/3']
    }

    def testMaxRetries() {
        when:
        def config = new TaskConfig()
        config.maxRetries = value
        then:
        config.maxRetries == expected
        config.getMaxRetries() == expected

        where:
        value   | expected
        null    | 1
        0       | 1
        1       | 1
        '3'     | 3
        10      | 10
    }

    def testMaxRetriesDefault() {
        given:
        TaskConfig config

        when:
        config = new TaskConfig()
        then:
        config.maxRetries == 1
        config.getMaxRetries() == 1
        config.getErrorStrategy() == ErrorStrategy.TERMINATE

        when:
        config = new TaskConfig()
        config.errorStrategy = 'retry'
        then:
        config.maxRetries == 1
        config.getMaxRetries() == 1
        config.errorStrategy == ErrorStrategy.RETRY
        config.getErrorStrategy() == ErrorStrategy.RETRY

        when:
        config = new TaskConfig()
        config.maxRetries = 3
        config.errorStrategy = 'retry'
        then:
        config.maxRetries == 3
        config.getMaxRetries() == 3
        config.errorStrategy == ErrorStrategy.RETRY
        config.getErrorStrategy() == ErrorStrategy.RETRY
    }

    def testMaxErrors() {
        when:
        def config = new TaskConfig()
        config.maxErrors = value
        then:
        config.maxErrors == expected
        config.getMaxErrors() == expected

        where:
        value   | expected
        null    | 0
        0       | 0
        1       | 1
        '3'     | 3
        10      | 10
    }

    def testGetTime() {
        when:
        def config = new TaskConfig().setContext(ten: 10)
        config.time = value
        config.resourceLimits = [time: '24h']

        then:
        config.time == expected
        config.getTime() == expected

        where:
        expected            || value
        null                || null
        new Duration('1s')  || 1000
        new Duration('2h')  || '2h'
        new Duration('10h') || { "$ten hours" }
        new Duration('24h') || '48h'
    }

    def 'test max submit await'() {
        when:
        def config = new TaskConfig()
        config.maxSubmitAwait = value

        then:
        config.maxSubmitAwait == expected
        config.getMaxSubmitAwait() == expected

        where:
        expected            || value
        null                || null
        new Duration('1s')  || 1000
        new Duration('2h')  || '2h'
    }

    def testGetMemory() {
        when:
        def config = new TaskConfig().setContext(ten: 10)
        config.memory = value
        config.resourceLimits = [memory: '16G']

        then:
        config.memory == expected
        config.getMemory() == expected

        where:
        expected                || value
        null                    || null
        new MemoryUnit('1K')    || 1024
        new MemoryUnit('2M')    || '2M'
        new MemoryUnit('10G')   || { "$ten G" }
        new MemoryUnit('16G')   || '32G'
    }

    def testGetDisk() {
        when:
        def config = new TaskConfig().setContext(x: 20)
        config.disk = value
        config.resourceLimits = [disk: '100G']

        then:
        config.disk == expected
        config.getDisk() == expected
        config.getDiskResource()?.getRequest() == expected

        where:
        expected                || value
        null                    || null
        new MemoryUnit('1M')    || 1024 * 1024
        new MemoryUnit('5M')    || '5M'
        new MemoryUnit('20G')   || { "$x G" }
        new MemoryUnit('30G')   || MemoryUnit.of('30G')
        new MemoryUnit('100G')  || '200G'
    }

    def testGetCpus() {
        when:
        def config = new TaskConfig().setContext(ten: 10)
        config.cpus = value
        config.resourceLimits = [cpus: 24]

        then:
        config.cpus == expected
        config.getCpus() == expected
        config.hasCpus() == defined

        where:
        expected     | defined  | value
        1            | false    | null
        1            | true     | 1
        8            | true     | 8
        10           | true     | { ten ?: 0  }
        24           | true     | 32
    }

    def testGetStore() {
        when:
        def config = new TaskConfig()
        config.storeDir = value

        then:
        config.storeDir == expected
        config.getStoreDir() == expected

        where:
        expected                            || value
        null                                || null
        Paths.get('/data/path/')            || '/data/path'
        Paths.get('hello').toAbsolutePath() || 'hello'
    }

    def testClusterOptionsAsString() {
        when:
        def config = new TaskConfig()
        config.clusterOptions = VALUE

        then:
        config.getClusterOptionsAsString() == EXPECTED

        where:
        EXPECTED                            || VALUE
        null                                || null
        '-queue alpha'                      || ['-queue','alpha']
        '-queue alpha'                      || '-queue alpha'
        "-queue 'alpha and beta'"           || ['-queue', 'alpha and beta']
    }

    def testGetClusterOptionsAsList() {
        when:
        def config = new TaskConfig()
        config.clusterOptions = value

        then:
        config.getClusterOptionsAsList() == expected

        where:
        expected                            || value
        Collections.emptyList()             || null
        ['-queue','alpha']                  || ['-queue','alpha']
        ['-queue','alpha']                  || '-queue alpha'
        ['-queue','alpha and beta']         || "-queue 'alpha and beta"
    }

    def testIsDynamic() {
        given:
        def config = new TaskConfig()

        when:
        config.alpha = 1
        config.delta = 2
        then:
        !config.isDynamic()

        when:
        config.delta = { 'this' }
        then:
        config.isDynamic()

        when:
        config.foo = { 'this' }
        config.bar = { 'this' }
        then:
        config.isDynamic()

        when:
        config = new TaskConfig( alpha:1, beta: { 'hello' } )
        then:
        config.isDynamic()

        when:
        config = new TaskConfig( alpha:1, beta: "${->foo}" )
        then:
        config.isDynamic()
    }

    def 'should return a new value when changing context' () {
        given:
        def config = new TaskConfig()
        config.alpha = 'Simple string'
        config.beta = { 'Static' }
        config.delta = { foo }
        config.gamma = "${-> bar }"

        when:
        config.setContext( foo: 'Hello', bar: 'World' )
        then:
        config.alpha == 'Simple string'
        config.beta == 'Static'
        config.delta == 'Hello'
        config.gamma == 'World'

        when:
        config.setContext( foo: 'Hola', bar: 'Mundo' )
        then:
        config.alpha == 'Simple string'
        config.beta == 'Static'
        config.delta == 'Hola'
        config.gamma == 'Mundo'
    }

    def 'should return the guard condition' () {
        given:
        def config = new TaskConfig()
        def closure = new TaskClosure({ x == 'Hello' && count==1 }, '{closure source code}')
        config.put('when', closure)

        when:
        config.getWhenGuard()
        then:
        FailedGuardException ex = thrown()
        ex.source == '{closure source code}'

        when:
        config.context = [x: 'Hello', count: 1]
        then:
        config.getWhenGuard()

        when:
        config.context = [x: 'Hello', count: 3]
        then:
        !config.getWhenGuard()
    }

    def 'should create ext config properties' () {
        given:
        def config = new TaskConfig()
        config.ext.alpha = 'AAAA'
        config.ext.delta = { foo }
        config.ext.omega = "${-> bar}"

        when:
        config.setContext( foo: 'DDDD', bar: 'OOOO' )
        then:
        config.isDynamic()
        config.ext.alpha == 'AAAA'
        config.ext.delta == 'DDDD'
        config.ext.omega == 'OOOO'

        when:
        config.setContext( foo: 'dddd', bar: 'oooo' )
        then:
        config.ext.alpha == 'AAAA'
        config.ext.delta == 'dddd'
        config.ext.omega == 'oooo'
    }

    def 'should create publishDir object' () {
        setup:
        def script = Mock(BaseScript)
        ProcessConfig process
        PublishDir publish

        when:
        process = new ProcessConfig(script)
        process.publishDir '/data'
        publish = process.createTaskConfig().getPublishDir()[0]
        then:
        publish.path == Paths.get('/data').complete()
        publish.pattern == null
        publish.overwrite == null
        publish.mode == null

        when:
        process = new ProcessConfig(script)
        process.publishDir '/data', overwrite: false, mode: 'copy', pattern: '*.txt'
        publish = process.createTaskConfig().getPublishDir()[0]
        then:
        publish.path == Paths.get('/data').complete()
        publish.pattern == '*.txt'
        publish.overwrite == false
        publish.mode == PublishDir.Mode.COPY

        when:
        process = new ProcessConfig(script)
        process.publishDir '/my/data', mode: 'copyNoFollow'
        publish = process.createTaskConfig().getPublishDir()[0]
        then:
        publish.path == Paths.get('//my/data').complete()
        publish.mode == PublishDir.Mode.COPY_NO_FOLLOW

        when:
        process = new ProcessConfig(script)
        process.publishDir '/here'
        process.publishDir '/there', pattern: '*.fq'
        def dirs = process.createTaskConfig().getPublishDir()
        then:
        dirs.size() == 2 
        dirs[0].path == Paths.get('/here')
        dirs[0].pattern == null
        dirs[1].path == Paths.get('/there')
        dirs[1].pattern == '*.fq'
    }

    def 'should create publishDir with local variables' () {
        given:
        TaskConfig config

        when:
        config = new TaskConfig()
        config.publishDir = [ [path: "${-> foo }/${-> bar }", mode: "${-> x }"] ] as ConfigList
        config.setContext( foo: 'world', bar: 'hello', x: 'copy' )
        then:
        config.getPublishDir() == [ PublishDir.create(path: 'world/hello', mode: 'copy') ]
    }

    def 'should invoke dynamic cpus property only when cloning the config object' () {
        given:
        def config = new TaskConfig()

        when:
        int count = 0
        config.cpus = { ++count }
        then:
        config.getCpus() == 1
        config.getCpus() == 1

        when:
        config = config.clone()
        then:
        config.getCpus() == 2
        config.getCpus() == 2

        when:
        config = config.clone()
        then:
        config.getCpus() == 3
        config.getCpus() == 3
    }

    def 'should configure pod options'()  {
        given:
        def script = Mock(BaseScript)

        when:
        def process = new ProcessConfig(script)
        process.pod secret: 'foo', mountPath: '/this'
        process.pod secret: 'bar', env: 'BAR_XXX'
        
        then:
        process.get('pod') == [
                    [secret: 'foo', mountPath: '/this'],
                    [secret: 'bar', env: 'BAR_XXX'] ]

        process.createTaskConfig().get('pod') == [
            [secret: 'foo', mountPath: '/this'],
            [secret: 'bar', env: 'BAR_XXX'] ]
    }

    def 'should get gpu resources' () {
        given:
        def script = Mock(BaseScript)

        when:
        def process = new ProcessConfig(script)
        process.accelerator 5
        def res = process.createTaskConfig().getAccelerator()
        then:
        res.limit == 5 
        res.request == 5

        when:
        process = new ProcessConfig(script)
        process.accelerator 5, limit: 10, type: 'nvidia'
        res = process.createTaskConfig().getAccelerator()
        then:
        res.request == 5
        res.limit == 10
        res.type == 'nvidia'
    }

    def 'should configure secrets'()  {
        given:
        def script = Mock(BaseScript)

        when:
        def process = new ProcessConfig(script)
        process.secret 'alpha'
        process.secret 'omega'

        then:
        process.getSecret() == ['alpha', 'omega']
        and:
        process.createTaskConfig().secret == ['alpha', 'omega']
        process.createTaskConfig().getSecret() == ['alpha', 'omega']
    }

    def 'should configure resourceLabels options'()  {
        given:
        def script = Mock(BaseScript)

        when:
        def process = new ProcessConfig(script)
        process.resourceLabels( region: 'eu-west-1', organization: 'A', user: 'this', team: 'that' )

        then:
        process.get('resourceLabels') == [region: 'eu-west-1', organization: 'A', user: 'this', team: 'that']

        when:
        def config = process.createTaskConfig()
        then:
        config.getResourceLabels() == [region: 'eu-west-1', organization: 'A', user: 'this', team: 'that']
        config.getResourceLabelsAsString() == 'region=eu-west-1,organization=A,user=this,team=that'
    }

    def 'should report error on negative cpus' () {
        when:
        def config = new TaskConfig([cpus:-1])
        and:
        config.getCpus()
        then:
        def e = thrown(ProcessUnrecoverableException)
        e.message == "Directive 'cpus' cannot be a negative value - offending value: -1"
    }

    def 'should report error on negative resourceLimits cpus' () {
        when:
        def config = new TaskConfig([cpus:4, resourceLimits:[cpus:-1]])
        and:
        config.getCpus()
        then:
        def e = thrown(ProcessUnrecoverableException)
        e.message == "Directive 'resourceLimits.cpus' cannot be a negative value - offending value: -1"
    }

    def 'should validate shell cli' () {
        given:
        def config = new TaskConfig([:])
        when:
        config.validateShell(['bash','this','that'])
        then:
        noExceptionThrown()

        when:
        config.validateShell([''])
        then:
        thrown(IllegalArgumentException)

//        when:
//        config.validateShell(['bash\nthis\nthat'])
//        then:
//        thrown(IllegalArgumentException)
//
//        when:
//        config.validateShell(['bash', ' -eu '])
//        then:
//        thrown(IllegalArgumentException)
    }

    def 'should get arch and container platform' () {
        given:
        def config = new TaskConfig(CONFIG)

        expect:
        config.getArchitecture() == ARCH

        where:
        CONFIG              | ARCH
        [:]                 | null
        [arch:'amd64']      | new Architecture(name:'amd64')
        [arch:'arm64']      | new Architecture(name:'arm64')
    }

}
