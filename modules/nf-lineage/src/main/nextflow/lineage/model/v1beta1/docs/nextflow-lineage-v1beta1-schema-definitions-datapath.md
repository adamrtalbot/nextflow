# DataPath Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles/items
```

Models a data path which includes the path and a checksum to validate the content of the path

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

# items Properties

| Property              | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                             |
| :-------------------- | :------- | :------- | :------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [path](#path)         | `string` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-datapath-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/path") |
| [checksum](#checksum) | `object` | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/checksum")             |

## path

Real path of the data as a URI (file://, s3://, etc.)

`path`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-datapath-properties-path.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/path")

### path Type

`string`

### path Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

### path Examples

```json
"file:///path/to/script.nf"
```

```json
"file:///path/to/input.txt"
```

## checksum

Models a checksum including the value as well as the algorithm and mode used to compute it

`checksum`

* is required

* Type: `object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-checksum.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath/properties/checksum")

### checksum Type

`object` ([Checksum](nextflow-lineage-v1beta1-schema-definitions-checksum.md))
