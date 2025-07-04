# TaskRun Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/taskRuns/items
```

Models a task execution

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([TaskRun](nextflow-lineage-v1beta1-schema-definitions-taskrun.md))

# items Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                             |
| :---------------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [sessionId](#sessionid)       | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")         |
| [name](#name)                 | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")                   |
| [codeChecksum](#codechecksum) | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")                          |
| [script](#script)             | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")               |
| [input](#input)               | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input") |
| [container](#container)       | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")         |
| [conda](#conda)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")                 |
| [spack](#spack)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")                 |
| [architecture](#architecture) | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")   |
| [globalVars](#globalvars)     | `object` | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars") |
| [binEntries](#binentries)     | `array`  | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")   |
| [workflowRun](#workflowrun)   | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")     |

## sessionId

Execution session identifier

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")

### sessionId Type

`string`

## name

Task name

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")

### name Type

`string`

## codeChecksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`codeChecksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")

### codeChecksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

## script

Resolved task script

`script`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")

### script Type

`string`

## input

Task run input

`input`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input")

### input Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

## container

Container used for the task run

`container`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")

### container Type

`string`

## conda

Conda environment used for the task run

`conda`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")

### conda Type

`string`

## spack

Spack environment used for the task run

`spack`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")

### spack Type

`string`

## architecture

Architecture defined in the Spack environment used for the task run

`architecture`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")

### architecture Type

`string`

## globalVars

Global variables defined in the task run

`globalVars`

* is optional

* Type: `object` ([Global Variables](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars")

### globalVars Type

`object` ([Global Variables](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md))

## binEntries

Binaries used in the task run

`binEntries`

* is optional

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")

### binEntries Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

## workflowRun

Workflow run associated to the task run

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")

### workflowRun Type

`string`
