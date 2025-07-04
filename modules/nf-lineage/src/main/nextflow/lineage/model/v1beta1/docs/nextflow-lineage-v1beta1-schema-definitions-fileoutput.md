# FileOutput Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput
```

Model a base class for workflow and task outputs representing real files with metadata

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## FileOutput Type

`object` ([FileOutput](nextflow-lineage-v1beta1-schema-definitions-fileoutput.md))

# FileOutput Properties

| Property                    | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                               |
| :-------------------------- | :-------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [path](#path)               | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/path")               |
| [checksum](#checksum)       | `object`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/checksum")                             |
| [source](#source)           | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-source.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/source")           |
| [workflowRun](#workflowrun) | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/workflowRun") |
| [taskRun](#taskrun)         | `string`  | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/taskRun")         |
| [size](#size)               | `integer` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-size.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/size")               |
| [createdAt](#createdat)     | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/createdAt")     |
| [modifiedAt](#modifiedat)   | `string`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-modifiedat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/modifiedAt")   |
| [labels](#labels)           | `array`   | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels")           |

## path

Real path of the output data as a URI (file://, s3://, etc.)

`path`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/path")

### path Type

`string`

### path Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

### path Examples

```json
"file:///path/to/output.txt"
```

```json
"s3://bucket/output.txt"
```

## checksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`checksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/checksum")

### checksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

## source

Entity that generated the data - lid:// URI referencing FileOutput, TaskRun, or WorkflowRun

`source`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-source.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/source")

### source Type

`string`

### source Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+(/.*)?$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B\(%2F.*\)%3F%24 "try regular expression with regexr.com")

### source Examples

```json
"lid://1234567890abcdef"
```

```json
"lid://abc123/output.txt"
```

## workflowRun

Reference to the WorkflowRun that generated the data - lid:// URI

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/workflowRun")

### workflowRun Type

`string`

### workflowRun Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

### workflowRun Examples

```json
"lid://1234567890abcdef"
```

## taskRun

Reference to the task that generated the data - lid:// URI (null for workflow-level outputs)

`taskRun`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/taskRun")

### taskRun Type

`string`

### taskRun Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

### taskRun Examples

```json
"lid://abc123def456"
```

```json
null
```

## size

Size of the data

`size`

* is required

* Type: `integer`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-size.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/size")

### size Type

`integer`

### size Constraints

**minimum**: the value of this number must greater than or equal to: `0`

## createdAt

Data creation date (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/createdAt")

### createdAt Type

`string`

### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## modifiedAt

Data last modified date (ISO 8601 format)

`modifiedAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-modifiedat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/modifiedAt")

### modifiedAt Type

`string`

### modifiedAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## labels

Labels attached to the data

`labels`

* is optional

* Type: `string[]` ([Label](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels-label.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels")

### labels Type

`string[]` ([Label](nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels-label.md))
