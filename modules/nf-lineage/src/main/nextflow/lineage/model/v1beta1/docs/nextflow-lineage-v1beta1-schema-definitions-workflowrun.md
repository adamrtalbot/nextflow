# WorkflowRun Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/workflowRuns/items
```

Models a Workflow Execution

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

Models a workflow definition

`workflow`

* is required

* Type: `object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow")

### workflow Type

`object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

## sessionId

Session identifier used in the workflow run

`sessionId`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-sessionid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/sessionId")

### sessionId Type

`string`

## name

Workflow run name

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/name")

### name Type

`string`

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
