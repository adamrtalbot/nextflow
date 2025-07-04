# Checksums Collection Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/checksums
```

Collection of file checksums for validation and integrity checking

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## checksums Type

`object[]` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

## checksums Examples

```json
[
  {
    "value": "a1b2c3d4e5f6",
    "algorithm": "nextflow",
    "mode": "standard"
  }
]
```
