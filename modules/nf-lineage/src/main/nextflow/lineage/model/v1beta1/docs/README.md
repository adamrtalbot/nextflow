# README

## Top-level Schemas

* [Nextflow Lineage Data Model v1beta1](./nextflow-lineage-v1beta1-schema.md "JSON Schema for Nextflow lineage data model version v1beta1") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json`

## Other Schemas

### Objects

* [Checksum](./nextflow-lineage-v1beta1-schema-definitions-checksum.md "Models a checksum including the value as well as the algorithm and mode used to compute it") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Checksum`

* [Configuration](./nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-configuration.md "Resolved Configuration") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/config`

* [DataPath](./nextflow-lineage-v1beta1-schema-definitions-datapath.md "Models a data path which includes the path and a checksum to validate the content of the path") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/DataPath`

* [FileOutput](./nextflow-lineage-v1beta1-schema-definitions-fileoutput.md "Model a base class for workflow and task outputs representing real files with metadata") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput`

* [Global Variables](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-global-variables.md "Global variables defined in the task run") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/globalVars`

* [Multiple Workflow Runs](./nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs.md "Multiple workflow runs lineage data") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1`

* [Parameter](./nextflow-lineage-v1beta1-schema-definitions-parameter.md "Model Workflow and Task Parameters including input/output channels and environment variables") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Parameter`

* [TaskOutput](./nextflow-lineage-v1beta1-schema-definitions-taskoutput.md "Models task results") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput`

* [TaskRun](./nextflow-lineage-v1beta1-schema-definitions-taskrun.md "Models a task execution including code, environment, and execution context") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun`

* [Workflow](./nextflow-lineage-v1beta1-schema-definitions-workflow.md "Models a workflow definition including source code and version control information") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow`

* [WorkflowOutput](./nextflow-lineage-v1beta1-schema-definitions-workflowoutput.md "Models the results of a workflow execution") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput`

* [WorkflowRun](./nextflow-lineage-v1beta1-schema-definitions-workflowrun.md "Models a Workflow Execution including the workflow definition, runtime parameters, and configuration") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun`

### Arrays

* [Binary Entries](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-binary-entries.md "Binaries used in the task run") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/binEntries`

* [Labels](./nextflow-lineage-v1beta1-schema-definitions-fileoutput-properties-labels.md "Labels attached to the data") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/FileOutput/properties/labels`

* [Script Files](./nextflow-lineage-v1beta1-schema-definitions-workflow-properties-script-files.md "List of script files defining a workflow (main script and modules)") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/Workflow/properties/scriptFiles`

* [Task Input Parameters](./nextflow-lineage-v1beta1-schema-definitions-taskrun-properties-task-input-parameters.md "Task run input") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskRun/properties/input`

* [Task Output Labels](./nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-labels.md "Labels attached to the task output") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/labels`

* [Task Output Parameters](./nextflow-lineage-v1beta1-schema-definitions-taskoutput-properties-task-output-parameters.md "Output of the task") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/TaskOutput/properties/output`

* [Workflow Output Parameters](./nextflow-lineage-v1beta1-schema-definitions-workflowoutput-properties-workflow-output-parameters.md "Workflow output") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowOutput/properties/output`

* [Workflow Parameters](./nextflow-lineage-v1beta1-schema-definitions-workflowrun-properties-workflow-parameters.md "Workflow parameters") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/definitions/WorkflowRun/properties/params`

* [Workflow Runs Collection](./nextflow-lineage-v1beta1-schema-oneof-multiple-workflow-runs-properties-workflow-runs-collection.md "Collection of workflow execution instances with their parameters and configurations") – `https://nextflow.io/schemas/lineage/v1beta1/lineage-schema.json#/oneOf/1/properties/workflowRuns`
