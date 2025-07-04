# Untitled string in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name
```

The parameter name - must be a valid identifier

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## name Type

`string`

## name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-zA-Z_][a-zA-Z0-9_]*$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-zA-Z_%5D%5Ba-zA-Z0-9_%5D*%24 "try regular expression with regexr.com")

## name Examples

```json
"input_file"
```

```json
"output_dir"
```

```json
"threads"
```

```json
"sample_id"
```
