# Multiple Workflow Runs Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1
```

Multiple workflow runs lineage data

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## 1 Type

`object` ([Multiple Workflow Runs](nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs.md))

# 1 Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                    |
| :---------------------------- | :------- | :------- | :------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [version](#version)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs-properties-version.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/version")                       |
| [workflowRuns](#workflowruns) | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs-properties-workflow-runs-collection.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/workflowRuns") |

## version

Lineage model version identifier - must be 'lineage/v1beta1'

`version`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs-properties-version.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/version")

### version Type

`string`

### version Constraints

**constant**: the value of this property must be equal to:

```json
"lineage/v1beta1"
```

### version Examples

```json
"lineage/v1beta1"
```

## workflowRuns

Collection of workflow execution instances with their parameters and configurations

`workflowRuns`

* is required

* Type: `object[]` ([WorkflowRun](nextflow-lineage-v1beta1-schema-definitions-workflowrun.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs-properties-workflow-runs-collection.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/workflowRuns")

### workflowRuns Type

`object[]` ([WorkflowRun](nextflow-lineage-v1beta1-schema-definitions-workflowrun.md))

### workflowRuns Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

### workflowRuns Examples

```json
[
  {
    "workflow": {
      "scriptFiles": [
        {
          "path": "file:///path/to/main.nf",
          "checksum": {
            "value": "abc123",
            "algorithm": "nextflow",
            "mode": "standard"
          }
        }
      ]
    },
    "sessionId": "550e8400-e29b-41d4-a716-446655440000",
    "name": "workflow_run_1",
    "params": [],
    "config": {}
  }
]
```
