package com.github.gradea.crossrepoqueuesplugin.services

import com.intellij.openapi.project.Project
import com.github.gradea.crossrepoqueuesplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
