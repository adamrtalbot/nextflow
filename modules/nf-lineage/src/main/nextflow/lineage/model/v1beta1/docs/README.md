# README

## Top-level Schemas

* [Nextflow Lineage Data Model v1beta1](./nextflow-lineage-v1beta1-schema.md "JSON Schema for Nextflow lineage data model version v1beta1") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json`

## Other Schemas

### Objects

* [Checksum](./nextflow-lineage-v1beta1-schema-definitions-checksum.md "Models a checksum including the value as well as the algorithm and mode used to compute it") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum`

* [Configuration](./nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md "Resolved Configuration") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config`

* [DataPath](./nextflow-lineage-v1beta1-schema-definitions-datapath.md "Models a data path which includes the path and a checksum to validate the content of the path") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath`

* [FileOutput](./nextflow-lineage-v1beta1-schema-definitions-fileoutput.md "Model a base class for workflow and task outputs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput`

* [Global Variables](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md "Global variables defined in the task run") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars`

* [Parameter](./nextflow-lineage-v1beta1-schema-definitions-parameter.md "Model Workflow and Task Parameters") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter`

* [TaskOutput](./nextflow-lineage-v1beta1-schema-definitions-taskoutput.md "Models task results") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput`

* [TaskRun](./nextflow-lineage-v1beta1-schema-definitions-taskrun.md "Models a task execution") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun`

* [Workflow](./nextflow-lineage-v1beta1-schema-definitions-workflow.md "Models a workflow definition") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow`

* [WorkflowOutput](./nextflow-lineage-v1beta1-schema-definitions-workflowoutput.md "Models the results of a workflow execution") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput`

* [WorkflowRun](./nextflow-lineage-v1beta1-schema-definitions-workflowrun.md "Models a Workflow Execution") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun`

### Arrays

* [Binary Entries](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-binary-entries.md "Binaries used in the task run") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries`

* [Checksums Collection](./nextflow-lineage-v1beta1-schema-properties-checksums-collection.md "Collection of checksums") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/checksums`

* [Data Paths](./nextflow-lineage-v1beta1-schema-definitions-workflow-properties-data-paths.md "List of script files defining a workflow") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles`

* [Data Paths Collection](./nextflow-lineage-v1beta1-schema-properties-data-paths-collection.md "Collection of data paths") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/dataPaths`

* [File Outputs Collection](./nextflow-lineage-v1beta1-schema-properties-file-outputs-collection.md "Collection of file outputs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/fileOutputs`

* [Labels](./nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels.md "Labels attached to the data") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels`

* [Parameters Collection](./nextflow-lineage-v1beta1-schema-properties-parameters-collection.md "Collection of parameters") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/parameters`

* [Task Input Parameters](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-task-input-parameters.md "Task run input") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input`

* [Task Output Labels](./nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels.md "Labels attached to the task output") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels`

* [Task Output Parameters](./nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-parameters.md "Output of the task") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output`

* [Task Outputs Collection](./nextflow-lineage-v1beta1-schema-properties-task-outputs-collection.md "Collection of task outputs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/taskOutputs`

* [Task Runs Collection](./nextflow-lineage-v1beta1-schema-properties-task-runs-collection.md "Collection of task runs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/taskRuns`

* [Workflow Output Parameters](./nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflow-output-parameters.md "Workflow output") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output`

* [Workflow Outputs Collection](./nextflow-lineage-v1beta1-schema-properties-workflow-outputs-collection.md "Collection of workflow outputs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/workflowOutputs`

* [Workflow Parameters](./nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-workflow-parameters.md "Workflow parameters") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params`

* [Workflow Runs Collection](./nextflow-lineage-v1beta1-schema-properties-workflow-runs-collection.md "Collection of workflow runs") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/workflowRuns`

* [Workflows Collection](./nextflow-lineage-v1beta1-schema-properties-workflows-collection.md "Collection of workflows") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/properties/workflows`
