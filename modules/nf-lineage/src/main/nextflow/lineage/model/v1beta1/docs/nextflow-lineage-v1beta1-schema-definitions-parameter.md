# Parameter Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params/items
```

Model Workflow and Task Parameters including input/output channels and environment variables

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([Parameter](nextflow-lineage-v1beta1-schema-definitions-parameter.md))

# items Properties

| Property        | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                           |
| :-------------- | :------------ | :------- | :------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)   | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")             |
| [name](#name)   | `string`      | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")             |
| [value](#value) | Not specified | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value") |

## type

The parameter type - one of the supported Nextflow parameter types

`type`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-type.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/type")

### type Type

`string`

### type Constraints

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

### type Examples

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

## name

The parameter name - must be a valid identifier

`name`

* is required

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-name.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/name")

### name Type

`string`

### name Constraints

**minimum length**: the minimum number of characters for this string is: `1`

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-zA-Z_][a-zA-Z0-9_]*$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-zA-Z_%5D%5Ba-zA-Z0-9_%5D*%24 "try regular expression with regexr.com")

### name Examples

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

## value

The parameter value - can be any type depending on the parameter type. For 'path' types, may contain file paths or lid:// URIs. For 'val' types, contains primitive values.

`value`

* is required

* Type: unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-parameter-value.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-parameter-value.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter/properties/value")

### value Type

unknown ([Parameter Value](nextflow-lineage-v1beta1-schema-definitions-parameter-properties-parameter-value.md))

### value Examples

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
