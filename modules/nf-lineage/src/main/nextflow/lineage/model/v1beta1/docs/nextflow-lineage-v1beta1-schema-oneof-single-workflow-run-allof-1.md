# Untitled undefined type in Nextflow Lineage Data Model v1beta1 Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/0/allOf/1
```



| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## 1 Type

unknown

# 1 Properties

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                           |
| :------------------ | :------- | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [version](#version) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-single-workflow-run-allof-1-properties-version.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/0/allOf/1/properties/version") |

## version

Lineage model version identifier - must be 'lineage/v1beta1'

`version`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-oneof-single-workflow-run-allof-1-properties-version.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/0/allOf/1/properties/version")

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
