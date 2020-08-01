package com.github.yikunz.tortoisegitcaller.services

import com.intellij.openapi.project.Project
import com.github.yikunz.tortoisegitcaller.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
