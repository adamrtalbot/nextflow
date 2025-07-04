# WorkflowRun Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/workflowRuns/items
```

Models a Workflow Execution including the workflow definition, runtime parameters, and configuration

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([WorkflowRun](nextflow-lineage-v1beta1-schema-definitions-workflowrun.md))

# items Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                    |
| :---------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [workflow](#workflow)   | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow")                                 |
| [sessionId](#sessionid) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/sessionId")        |
| [name](#name)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/name")                  |
| [params](#params)       | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-workflow-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params") |
| [config](#config)       | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config")       |

## workflow

Models a workflow definition including source code and version control information

`workflow`

* is required

* Type: `object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow")

### workflow Type

`object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

## sessionId

Execution session identifier - UUID format

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/sessionId")

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

Workflow run name - often auto-generated or user-provided

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/name")

### name Type

`string`

### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

### name Examples

```json
"silly_darwin"
```

```json
"user_analysis_run"
```

```json
"my-workflow-2024"
```

## params

Workflow parameters

`params`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-workflow-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params")

### params Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

## config

Resolved Configuration

`config`

* is required

* Type: `object` ([Configuration](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config")

### config Type

`object` ([Configuration](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md))
