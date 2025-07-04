# WorkflowOutput Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput
```

Models the results of a workflow execution

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## WorkflowOutput Type

`object` ([WorkflowOutput](nextflow-lineage-v1beta1-schema-definitions-workflowoutput.md))

# WorkflowOutput Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                                 |
| :-------------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [createdAt](#createdat)     | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/createdAt")               |
| [workflowRun](#workflowrun) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/workflowRun")           |
| [output](#output)           | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflow-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output") |

## createdAt

Creation date of the workflow output (ISO 8601 format)

`createdAt`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-createdat.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/createdAt")

### createdAt Type

`string`

### createdAt Constraints

**date time**: the string must be a date time string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## workflowRun

Workflow run that generated the output

`workflowRun`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflowrun.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/workflowRun")

### workflowRun Type

`string`

## output

Workflow output

`output`

* is required

* Type: `object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflow-output-parameters.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output")

### output Type

`object[]` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))
