# Script Files Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles
```

List of script files defining a workflow (main script and modules)

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## scriptFiles Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

## scriptFiles Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

## scriptFiles Examples

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
