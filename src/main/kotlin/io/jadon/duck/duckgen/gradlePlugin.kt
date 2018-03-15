package io.jadon.duck.duckgen

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

class DuckGenPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.extensions.add("duckGen", DuckGenExtension::class.java)
        project.tasks.create("duckGen", DuckGenTask::class.java)
    }

}

class DuckGenExtension {
    var versions: Array<String> = arrayOf("null")
}

class DuckGenTask : DefaultTask() {

    @TaskAction
    fun generateClasses() {
        println(project.extensions.getByType(DuckGenExtension::class.java).versions)
    }

}
