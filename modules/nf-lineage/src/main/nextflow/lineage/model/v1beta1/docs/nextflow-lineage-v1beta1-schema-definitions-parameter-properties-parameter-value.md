# Parameter Value Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value
```

The parameter value - can be any type depending on the parameter type. For 'path' types, may contain file paths or lid:// URIs. For 'val' types, contains primitive values.

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## value Type

unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-parameter-value.md))

## value Examples

```json
"file:///path/to/input.txt"
```

```json
"lid://abc123/output.txt"
```

```json
42
```

```json
"sample_name"
```

```json
[
  "item1",
  "item2"
]
```
