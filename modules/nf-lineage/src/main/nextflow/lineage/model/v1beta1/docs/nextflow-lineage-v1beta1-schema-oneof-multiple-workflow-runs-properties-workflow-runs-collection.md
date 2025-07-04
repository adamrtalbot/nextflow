# Workflow Runs Collection Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/workflowRuns
```

Collection of workflow execution instances with their parameters and configurations

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## workflowRuns Type

`object[]` ([WorkflowRun](nextflow-lineage-v1beta1-schema-definitions-workflowrun.md))

## workflowRuns Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## workflowRuns Examples

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
