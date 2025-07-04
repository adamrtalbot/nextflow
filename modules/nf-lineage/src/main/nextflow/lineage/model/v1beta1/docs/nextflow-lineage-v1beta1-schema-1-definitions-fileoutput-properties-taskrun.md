# Untitled undefined type in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/taskRun
```

Reference to the task that generated the data - lid:// URI (null for workflow-level outputs)

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                       |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## taskRun Type

`string`

## taskRun Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^lid://[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5Elid%3A%2F%2F%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

## taskRun Examples

```json
"lid://abc123def456"
```

```json
null
```
