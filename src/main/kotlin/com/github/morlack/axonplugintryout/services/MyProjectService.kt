package com.github.morlack.axonplugintryout.services

import com.intellij.openapi.project.Project
import com.github.morlack.axonplugintryout.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
