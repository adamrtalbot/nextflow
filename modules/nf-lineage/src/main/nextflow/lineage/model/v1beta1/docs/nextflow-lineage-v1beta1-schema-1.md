# Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json
```

JSON Schema for Nextflow lineage data model version v1beta1. This schema validates data lineage information produced by Nextflow workflows including checksums, file paths, task runs, workflow runs, and their relationships.

| Abstract               | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                     |
| :--------------------- | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :------------------------------------------------------------------------------------------------------------- |
| Cannot be instantiated | Yes        | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## Nextflow Lineage Data Model v1beta1 Type

`object` ([Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1.md))

one (and only one) of

* all of

  * [WorkflowRun](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun.md "check type definition")

  * [Untitled undefined type in Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-oneof-single-workflow-run-allof-1.md "check type definition")

* [Multiple Workflow Runs](nextflow-lineage-v1beta1-schema-1-oneof-multiple-workflow-runs.md "check type definition")

# Nextflow Lineage Data Model v1beta1 Definitions

## Definitions group Checksum

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum"}
```

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                         |
| :---------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [value](#value)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")         |
| [algorithm](#algorithm) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm") |
| [mode](#mode)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")           |

### value

The checksum value as a hexadecimal string

`value`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")

#### value Type

`string`

#### value Constraints

**minimum length**: the minimum number of characters for this string is: `1`

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

#### value Examples

```json
"a1b2c3d4e5f6"
```

```json
"1234567890abcdef"
```

### algorithm

The algorithm used to compute the checksum. Currently only 'nextflow' is supported.

`algorithm`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm")

#### algorithm Type

`string`

#### algorithm Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"nextflow"` |             |

### mode

The hashing mode used to compute the checksum

`mode`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")

#### mode Type

`string`

#### mode Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"standard"` |             |
| `"deep"`     |             |
| `"lenient"`  |             |
| `"sha256"`   |             |

#### mode Examples

```json
"standard"
```

```json
"deep"
```

```json
"lenient"
```

```json
"sha256"
```

## Definitions group DataPath

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath"}
```

| Property              | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                               |
| :-------------------- | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [path](#path)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-datapath-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/path") |
| [checksum](#checksum) | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/checksum")             |

### path

Real path of the data as a URI (file://, s3://, etc.)

`path`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-datapath-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/path")

#### path Type

`string`

#### path Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

#### path Examples

```json
"file:///path/to/script.nf"
```

```json
"file:///path/to/input.txt"
```

### checksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`checksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/checksum")

#### checksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

## Definitions group Parameter

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter"}
```

| Property          | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                             |
| :---------------- | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)     | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")             |
| [name](#name)     | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")             |
| [value](#value-1) | Not specified | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value") |

### type

The parameter type - one of the supported Nextflow parameter types

`type`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")

#### type Type

`string`

#### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | :---------- |
| `"stdout"`     |             |
| `"stdin"`      |             |
| `"path"`       |             |
| `"val"`        |             |
| `"env"`        |             |
| `"eval"`       |             |
| `"each"`       |             |
| `"Path"`       |             |
| `"String"`     |             |
| `"Collection"` |             |
| `"Map"`        |             |

#### type Examples

```json
"path"
```

```json
"val"
```

```json
"env"
```

```json
"String"
```

```json
"Collection"
```

### name

The parameter name - must be a valid identifier

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")

#### name Type

`string`

#### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-zA-Z_][a-zA-Z0-9_]*$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-zA-Z_%5D%5Ba-zA-Z0-9_%5D*%24 "try regular expression with regexr.com")

#### name Examples

```json
"input_file"
```

```json
"output_dir"
```

```json
"threads"
```

```json
"sample_id"
```

### value

The parameter value - can be any type depending on the parameter type. For 'path' types, may contain file paths or lid:// URIs. For 'val' types, contains primitive values.

`value`

* is required

* Type: unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value")

#### value Type

unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md))

#### value Examples

```json
"file:///path/to/input.txt"
```

```json
"lid://abc123/output.txt"
```

```json
42
```

```json
"sample_name"
```

```json
[
  "item1",
  "item2"
]
```

## Definitions group FileOutput

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput"}
```

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                                 |
| :-------------------------- | :-------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [path](#path-1)             | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/path")               |
| [checksum](#checksum-1)     | `object`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/checksum")                             |
| [source](#source)           | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-source.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/source")           |
| [workflowRun](#workflowrun) | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/workflowRun") |
| [taskRun](#taskrun)         | `string`  | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/taskRun")         |
| [size](#size)               | `integer` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-size.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/size")               |
| [createdAt](#createdat)     | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/createdAt")     |
| [modifiedAt](#modifiedat)   | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-modifiedat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/modifiedAt")   |
| [labels](#labels)           | `array`   | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels")           |

### path

Real path of the output data as a URI (file://, s3://, etc.)

`path`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/path")

#### path Type

`string`

#### path Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

#### path Examples

```json
"file:///path/to/output.txt"
```

```json
"s3://bucket/output.txt"
```

### checksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`checksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/checksum")

#### checksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

### source

Entity that generated the data - lid:// URI referencing FileOutput, TaskRun, or WorkflowRun

`source`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-source.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/source")

#### source Type

`string`

#### source Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+(/.*)?$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B\(%2F.*\)%3F%24 "try regular expression with regexr.com")

#### source Examples

```json
"lid://1234567890abcdef"
```

```json
"lid://abc123/output.txt"
```

### workflowRun

Reference to the WorkflowRun that generated the data - lid:// URI

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/workflowRun")

#### workflowRun Type

`string`

#### workflowRun Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

#### workflowRun Examples

```json
"lid://1234567890abcdef"
```

### taskRun

Reference to the task that generated the data - lid:// URI (null for workflow-level outputs)

`taskRun`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/taskRun")

#### taskRun Type

`string`

#### taskRun Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

#### taskRun Examples

```json
"lid://abc123def456"
```

```json
null
```

### size

Size of the data

`size`

* is required

* Type: `integer`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-size.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/size")

#### size Type

`integer`

#### size Constraints

**minimum**: the value of this number must greater than or equal to: `0`

### createdAt

Data creation date (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/createdAt")

#### createdAt Type

`string`

#### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### modifiedAt

Data last modified date (ISO 8601 format)

`modifiedAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-modifiedat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/modifiedAt")

#### modifiedAt Type

`string`

#### modifiedAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### labels

Labels attached to the data

`labels`

* is optional

* Type: `string[]` ([Label](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-labels-label.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels")

#### labels Type

`string[]` ([Label](nextflow-lineage-v1beta1-schema-1-definitions-fileoutput-properties-labels-label.md))

## Definitions group TaskOutput

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                       |
| :---------------------------- | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [taskRun](#taskrun-1)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/taskRun")               |
| [workflowRun](#workflowrun-1) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/workflowRun")       |
| [createdAt](#createdat-1)     | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/createdAt")           |
| [output](#output)             | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output") |
| [labels](#labels-1)           | `array`  | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels")     |

### taskRun

Reference to the task that generated the output

`taskRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/taskRun")

#### taskRun Type

`string`

### workflowRun

Reference to the WorkflowRun that generated the output

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/workflowRun")

#### workflowRun Type

`string`

### createdAt

Creation date of this task output description (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/createdAt")

#### createdAt Type

`string`

#### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### output

Output of the task

`output`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output")

#### output Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

### labels

Labels attached to the task output

`labels`

* is optional

* Type: `string[]` ([Label](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-labels-label.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels")

#### labels Type

`string[]` ([Label](nextflow-lineage-v1beta1-schema-1-definitions-taskoutput-properties-task-output-labels-label.md))

## Definitions group TaskRun

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                               |
| :---------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [sessionId](#sessionid)       | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")         |
| [name](#name-1)               | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")                   |
| [codeChecksum](#codechecksum) | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")                          |
| [script](#script)             | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")               |
| [input](#input)               | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input") |
| [container](#container)       | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")         |
| [conda](#conda)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")                 |
| [spack](#spack)               | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")                 |
| [architecture](#architecture) | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")   |
| [globalVars](#globalvars)     | `object` | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars") |
| [binEntries](#binentries)     | `array`  | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")   |
| [workflowRun](#workflowrun-2) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")     |

### sessionId

Execution session identifier - UUID format

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/sessionId")

#### sessionId Type

`string`

#### sessionId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$
```

[try pattern](https://regexr.com/?expression=%5E%5B0-9a-fA-F%5D%7B8%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B12%7D%24 "try regular expression with regexr.com")

#### sessionId Examples

```json
"550e8400-e29b-41d4-a716-446655440000"
```

### name

Task name as defined in the workflow

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/name")

#### name Type

`string`

#### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

#### name Examples

```json
"FASTQC"
```

```json
"BWA_MEM"
```

```json
"SAMTOOLS_SORT"
```

### codeChecksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`codeChecksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum")

#### codeChecksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

### script

Resolved task script

`script`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-script.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/script")

#### script Type

`string`

### input

Task run input

`input`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-task-input-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input")

#### input Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

### container

Container used for the task run

`container`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-container.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/container")

#### container Type

`string`

### conda

Conda environment used for the task run

`conda`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-conda.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/conda")

#### conda Type

`string`

### spack

Spack environment used for the task run

`spack`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-spack.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/spack")

#### spack Type

`string`

### architecture

Architecture defined in the Spack environment used for the task run

`architecture`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-architecture.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/architecture")

#### architecture Type

`string`

### globalVars

Global variables defined in the task run

`globalVars`

* is optional

* Type: `object` ([Global Variables](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars")

#### globalVars Type

`object` ([Global Variables](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-global-variables.md))

### binEntries

Binaries used in the task run

`binEntries`

* is optional

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-binary-entries.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries")

#### binEntries Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

### workflowRun

Workflow run associated to the task run

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-taskrun-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/workflowRun")

#### workflowRun Type

`string`

## Definitions group Workflow

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow"}
```

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                              |
| :-------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [scriptFiles](#scriptfiles) | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-script-files.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles") |
| [repository](#repository)   | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")    |
| [commitId](#commitid)       | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")        |

### scriptFiles

List of script files defining a workflow (main script and modules)

`scriptFiles`

* is required

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-script-files.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles")

#### scriptFiles Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-1-definitions-datapath.md))

#### scriptFiles Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

#### scriptFiles Examples

```json
[
  {
    "path": "file:///path/to/main.nf",
    "checksum": {
      "value": "abc123",
      "algorithm": "nextflow",
      "mode": "standard"
    }
  }
]
```

### repository

Workflow repository URL (git, github, etc.) or null if local

`repository`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")

#### repository Type

`string`

#### repository Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

#### repository Examples

```json
"https://github.com/user/workflow.git"
```

```json
null
```

### commitId

Git commit identifier (SHA) or null if not from a repository

`commitId`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")

#### commitId Type

`string`

#### commitId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-fA-F0-9]{6,40}$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-fA-F0-9%5D%7B6%2C40%7D%24 "try regular expression with regexr.com")

#### commitId Examples

```json
"a1b2c3d4e5f6789"
```

```json
"1234567890abcdef1234567890abcdef12345678"
```

```json
null
```

## Definitions group WorkflowOutput

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                   |
| :---------------------------- | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [createdAt](#createdat-2)     | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/createdAt")               |
| [workflowRun](#workflowrun-3) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/workflowRun")           |
| [output](#output-1)           | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-workflow-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output") |

### createdAt

Creation date of the workflow output (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/createdAt")

#### createdAt Type

`string`

#### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### workflowRun

Workflow run that generated the output

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/workflowRun")

#### workflowRun Type

`string`

### output

Workflow output

`output`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowoutput-properties-workflow-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output")

#### output Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

## Definitions group WorkflowRun

Reference this group by using

```json
{"$ref":"https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun"}
```

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                      |
| :------------------------ | :------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [workflow](#workflow)     | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow")                                 |
| [sessionId](#sessionid-1) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/sessionId")        |
| [name](#name-2)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/name")                  |
| [params](#params)         | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-workflow-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params") |
| [config](#config)         | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-configuration.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config")       |

### workflow

Models a workflow definition including source code and version control information

`workflow`

* is required

* Type: `object` ([Workflow](nextflow-lineage-v1beta1-schema-1-definitions-workflow.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflow.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow")

#### workflow Type

`object` ([Workflow](nextflow-lineage-v1beta1-schema-1-definitions-workflow.md))

### sessionId

Execution session identifier - UUID format

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/sessionId")

#### sessionId Type

`string`

#### sessionId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$
```

[try pattern](https://regexr.com/?expression=%5E%5B0-9a-fA-F%5D%7B8%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B4%7D-%5B0-9a-fA-F%5D%7B12%7D%24 "try regular expression with regexr.com")

#### sessionId Examples

```json
"550e8400-e29b-41d4-a716-446655440000"
```

### name

Workflow run name - often auto-generated or user-provided

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/name")

#### name Type

`string`

#### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

#### name Examples

```json
"silly_darwin"
```

```json
"user_analysis_run"
```

```json
"my-workflow-2024"
```

### params

Workflow parameters

`params`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-workflow-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params")

#### params Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

### config

Resolved Configuration

`config`

* is required

* Type: `object` ([Configuration](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-configuration.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-configuration.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config")

#### config Type

`object` ([Configuration](nextflow-lineage-v1beta1-schema-1-definitions-workflowrun-properties-configuration.md))
