package com.github.yikunz.tortoisegitcaller.actions

import com.intellij.openapi.actionSystem.*
import com.intellij.openapi.ui.popup.JBPopupFactory

import com.intellij.util.castSafelyTo

internal class MenuRootAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val action = ActionManager.getInstance().getAction("com.github.yikunz.tortoisegitcaller.actions.MenuRootAction.OperationPopList")
        val actionGroup = action.castSafelyTo<DefaultActionGroup>()
        if (actionGroup != null) {
            val actionGroupPopup = JBPopupFactory.getInstance()
                    .createActionGroupPopup("Tortoise Git Operations", actionGroup, e.dataContext,
                            JBPopupFactory.ActionSelectionAid.NUMBERING, true)
            val project = e.project
            if (project != null) {
                actionGroupPopup.showCenteredInCurrentWindow(project)
            }
        }
    }
}
