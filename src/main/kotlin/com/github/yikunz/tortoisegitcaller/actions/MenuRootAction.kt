package com.github.yikunz.tortoisegitcaller.actions

import com.intellij.openapi.actionSystem.*
import com.intellij.openapi.ui.popup.JBPopupFactory

internal class MenuRootAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val actionGroup = OperationListPopGroup()
        val actionGroupPopup = JBPopupFactory.getInstance()
                .createActionGroupPopup("Tortoise Git Operations", actionGroup, e.dataContext,
                        JBPopupFactory.ActionSelectionAid.NUMBERING, true)
        val project = e.project
        if (project != null) {
            actionGroupPopup.showCenteredInCurrentWindow(project)
        }
    }
}
