# Checksum Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/checksums/items
```

Models a checksum including the value as well as the algorithm and mode used to compute it

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-1-definitions-checksum.md))

# items Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                         |
| :---------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [value](#value)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")         |
| [algorithm](#algorithm) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm") |
| [mode](#mode)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")           |

## value

The checksum value

`value`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")

### value Type

`string`

## algorithm

The algorithm used to compute the checksum

`algorithm`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm")

### algorithm Type

`string`

## mode

The mode used to compute the checksum

`mode`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")

### mode Type

`string`
