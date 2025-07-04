# Workflow Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/workflows/items
```

Models a workflow definition

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## items Type

`object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

# items Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                          |
| :-------------------------- | :------- | :------- | :------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [scriptFiles](#scriptfiles) | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-data-paths.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles") |
| [repository](#repository)   | `string` | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")  |
| [commitId](#commitid)       | `string` | Optional | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")      |

## scriptFiles

List of script files defining a workflow

`scriptFiles`

* is required

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-data-paths.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles")

### scriptFiles Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

## repository

Workflow repository

`repository`

* is optional

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")

### repository Type

`string`

## commitId

Workflow commit identifier

`commitId`

* is optional

* Type: `string`

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")

### commitId Type

`string`
