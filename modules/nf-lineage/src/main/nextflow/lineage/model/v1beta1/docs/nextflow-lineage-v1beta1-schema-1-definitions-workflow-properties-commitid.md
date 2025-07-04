# Untitled undefined type in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId
```

Git commit identifier (SHA) or null if not from a repository

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                       |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## commitId Type

`string`

## commitId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-fA-F0-9]{6,40}$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-fA-F0-9%5D%7B6%2C40%7D%24 "try regular expression with regexr.com")

## commitId Examples

```json
"a1b2c3d4e5f6789"
```

```json
"1234567890abcdef1234567890abcdef12345678"
```

```json
null
```
