# Checksum Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/codeChecksum
```

Models a checksum including the value as well as the algorithm and mode used to compute it

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## codeChecksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

# codeChecksum Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                       |
| :---------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [value](#value)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")         |
| [algorithm](#algorithm) | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm") |
| [mode](#mode)           | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")           |

## value

The checksum value as a hexadecimal string

`value`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/value")

### value Type

`string`

### value Constraints

**minimum length**: the minimum number of characters for this string is: `1`

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-fA-F0-9]+$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-fA-F0-9%5D%2B%24 "try regular expression with regexr.com")

### value Examples

```json
"a1b2c3d4e5f6"
```

```json
"1234567890abcdef"
```

## algorithm

The algorithm used to compute the checksum. Currently only 'nextflow' is supported.

`algorithm`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-algorithm.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/algorithm")

### algorithm Type

`string`

### algorithm Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"nextflow"` |             |

## mode

The hashing mode used to compute the checksum

`mode`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum-properties-mode.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum/properties/mode")

### mode Type

`string`

### mode Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value        | Explanation |
| :----------- | :---------- |
| `"standard"` |             |
| `"deep"`     |             |
| `"lenient"`  |             |
| `"sha256"`   |             |

### mode Examples

```json
"standard"
```

```json
"deep"
```

```json
"lenient"
```

```json
"sha256"
```
