package com.github.sukhoy94.myawesomeplugin.services

import com.github.sukhoy94.myawesomeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
