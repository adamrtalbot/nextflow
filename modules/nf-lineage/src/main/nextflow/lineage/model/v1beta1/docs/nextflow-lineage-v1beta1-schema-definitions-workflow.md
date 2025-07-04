# Workflow Schema

```txt
https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/workflow
```

Models a workflow definition including source code and version control information

| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                                                                   |
| :------------------ | :--------- | :------------- | :----------- | :---------------- | :-------------------- | :------------------ | :----------------------------------------------------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Forbidden             | none                | [nextflow-lineage-v1beta1-schema.json\*](../out/nextflow-lineage-v1beta1-schema.json "open original schema") |

## workflow Type

`object` ([Workflow](nextflow-lineage-v1beta1-schema-definitions-workflow.md))

# workflow Properties

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                            |
| :-------------------------- | :------- | :------- | :------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [scriptFiles](#scriptfiles) | `array`  | Required | cannot be null | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-script-files.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles") |
| [repository](#repository)   | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")    |
| [commitId](#commitid)       | `string` | Optional | can be null    | [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")        |

## scriptFiles

List of script files defining a workflow (main script and modules)

`scriptFiles`

* is required

* Type: `object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

* cannot be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-script-files.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles")

### scriptFiles Type

`object[]` ([DataPath](nextflow-lineage-v1beta1-schema-definitions-datapath.md))

### scriptFiles Constraints

**minimum number of items**: the minimum number of items for this array is: `1`

### scriptFiles Examples

```json
[
  {
    "path": "file:///path/to/main.nf",
    "checksum": {
      "value": "abc123",
      "algorithm": "nextflow",
      "mode": "standard"
    }
  }
]
```

## repository

Workflow repository URL (git, github, etc.) or null if local

`repository`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-repository.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/repository")

### repository Type

`string`

### repository Constraints

**URI**: the string must be a URI, according to [RFC 3986](https://tools.ietf.org/html/rfc3986 "check the specification")

### repository Examples

```json
"https://github.com/user/workflow.git"
```

```json
null
```

## commitId

Git commit identifier (SHA) or null if not from a repository

`commitId`

* is optional

* Type: `string`

* can be null

* defined in: [Nextflow Lineage Data Model v1beta1](nextflow-lineage-v1beta1-schema-definitions-workflow-properties-commitid.md "https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/commitId")

### commitId Type

`string`

### commitId Constraints

**pattern**: the string must match the following regular expression:&#x20;

```regexp
^[a-fA-F0-9]{6,40}$
```

[try pattern](https://regexr.com/?expression=%5E%5Ba-fA-F0-9%5D%7B6%2C40%7D%24 "try regular expression with regexr.com")

### commitId Examples

```json
"a1b2c3d4e5f6789"
```

```json
"1234567890abcdef1234567890abcdef12345678"
```

```json
null
```
