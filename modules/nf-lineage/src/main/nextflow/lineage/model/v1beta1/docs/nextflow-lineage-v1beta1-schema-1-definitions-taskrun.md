# TaskRun Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun
```

Models a task execution including code, environment, and execution context

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## TaskRun Type

`object` ([TaskRun](nextflow-lineage-v1beta1-schema-1-definitions-taskrun.md))

# TaskRun Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                               |
| :---------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [sessionId](#sessionid)       | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")         |
| [name](#name)                 | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")                   |
| [codeChecksum](#codechecksum) | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")                          |
| [script](#script)             | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")               |
| [input](#input)               | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input") |
| [container](#container)       | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")         |
| [conda](#conda)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")                 |
| [spack](#spack)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")                 |
| [architecture](#architecture) | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")   |
| [globalVars](#globalvars)     | `object` | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars") |
| [binEntries](#binentries)     | `array`  | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")   |
| [workflowRun](#workflowrun)   | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")     |

## sessionId

Execution session identifier - UUID format

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")

### sessionId Type

`string`

### sessionId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$
```

[try pattern](https://regexr.com/?expression=%5E%5B0-9a-fA-F%5D%7B8%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B12%7D%24 "try regular expression with regexr.com")

### sessionId Examples

```json
"550e8400-e29b-41d4-a716-446655440000"
```

## name

Task name as defined in the workflow

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")

### name Type

`string`

### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

### name Examples

```json
"FASTQC"
```

```json
"BWA_MEM"
```

```json
"SAMTOOLS_SORT"
```

## codeChecksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`codeChecksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")

### codeChecksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

## script

Resolved task script

`script`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")

### script Type

`string`

## input

Task run input

`input`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input")

### input Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

## container

Container used for the task run

`container`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")

### container Type

`string`

## conda

Conda environment used for the task run

`conda`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")

### conda Type

`string`

## spack

Spack environment used for the task run

`spack`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")

### spack Type

`string`

## architecture

Architecture defined in the Spack environment used for the task run

`architecture`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")

### architecture Type

`string`

## globalVars

Global variables defined in the task run

`globalVars`

* is optional

* Type: `object` ([Global Variables](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars")

### globalVars Type

`object` ([Global Variables](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md))

## binEntries

Binaries used in the task run

`binEntries`

* is optional

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")

### binEntries Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

## workflowRun

Workflow run associated to the task run

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")

### workflowRun Type

`string`
