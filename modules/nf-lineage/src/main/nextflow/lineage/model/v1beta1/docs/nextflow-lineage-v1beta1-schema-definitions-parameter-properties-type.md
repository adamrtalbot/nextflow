# Untitled string in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type
```

The parameter type - one of the supported Nextflow parameter types

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## type Type

`string`

## type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | :---------- |
| `"stdout"`     |             |
| `"stdin"`      |             |
| `"path"`       |             |
| `"val"`        |             |
| `"env"`        |             |
| `"eval"`       |             |
| `"each"`       |             |
| `"Path"`       |             |
| `"String"`     |             |
| `"Collection"` |             |
| `"Map"`        |             |

## type Examples

```json
"path"
```

```json
"val"
```

```json
"env"
```

```json
"String"
```

```json
"Collection"
```
