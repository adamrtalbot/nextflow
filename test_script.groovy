@Grab('org.junit:junit-dep:4.10')
import nextflow.cloud.azure.file.AzBashLib

println "Generated script:"
println AzBashLib.script()
println "End of script"
