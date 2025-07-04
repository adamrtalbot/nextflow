# TaskOutput Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput
```

Models task results

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## TaskOutput Type

`object` ([TaskOutput](nextflow-lineage-v1beta1-schema-definitions-taskoutput.md))

# TaskOutput Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                     |
| :-------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [taskRun](#taskrun)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/taskRun")               |
| [workflowRun](#workflowrun) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/workflowRun")       |
| [createdAt](#createdat)     | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/createdAt")           |
| [output](#output)           | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output") |
| [labels](#labels)           | `array`  | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels")     |

## taskRun

Reference to the task that generated the output

`taskRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-taskrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/taskRun")

### taskRun Type

`string`

## workflowRun

Reference to the WorkflowRun that generated the output

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/workflowRun")

### workflowRun Type

`string`

## createdAt

Creation date of this task output description (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/createdAt")

### createdAt Type

`string`

### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## output

Output of the task

`output`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output")

### output Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

## labels

Labels attached to the task output

`labels`

* is optional

* Type: `string[]` ([Label](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels-label.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels")

### labels Type

`string[]` ([Label](nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels-label.md))
