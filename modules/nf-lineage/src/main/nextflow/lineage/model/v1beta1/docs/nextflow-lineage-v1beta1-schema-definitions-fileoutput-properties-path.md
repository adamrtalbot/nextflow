# Untitled string in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/path
```

Real path of the output data as a URI (file://, s3://, etc.)

| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :---------------------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## path Type

`string`

## path Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

## path Examples

```json
"file:///path/to/output.txt"
```

```json
"s3://bucket/output.txt"
```
