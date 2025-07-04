# Parameter Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/parameters/items
```

Model Workflow and Task Parameters

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                       |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :--------------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([Parameter](nextflow-lineage-v1beta1-schema-1-definitions-parameter.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                             |
| :-------------- | :------------ | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)   | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")             |
| [name](#name)   | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")             |
| [value](#value) | Not specified | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value") |

## type

The parameter type

`type`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")

### type Type

`string`

## name

The parameter name

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")

### name Type

`string`

## value

The parameter value - can be any type

`value`

* is required

* Type: unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value")

### value Type

unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-1-definitions-parameter-properties-parameter-value.md))
