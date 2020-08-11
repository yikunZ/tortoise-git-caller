package com.github.yikunz.tortoisegitcaller.actions.global

import com.github.yikunz.tortoisegitcaller.util.Command
import com.intellij.openapi.actionSystem.*

internal class RefLogAction : AnAction("Ref log") {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val basePath = project?.basePath
        if (basePath != null) {
            Command.refLog(basePath)
        }
    }
}