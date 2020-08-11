package com.github.yikunz.tortoisegitcaller.actions.global

import com.github.yikunz.tortoisegitcaller.util.Command
import com.intellij.openapi.actionSystem.*
import javax.swing.KeyStroke

internal class DiffAction : AnAction("Diff") {
    init {
        // 这边的设置快捷键的代码不起作用，只是在操作弹出窗的操作列表中有个展示，真正起到快捷键功能的代码在resources/META-INF/plugin.xml中
        // 如果这边不设置的话将在列表中不会显示快捷键按钮，而xml中你的代码不会展示按钮但起到了真正的功能
        // 考虑把这两边的代码融合在一起
        val shortcut = KeyboardShortcut(KeyStroke.getKeyStroke("control G"), KeyStroke.getKeyStroke("D"))
        val shortcutSet = CustomShortcutSet(shortcut)
        registerCustomShortcutSet(shortcutSet, null)
    }

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val basePath = project?.basePath
        if (basePath != null) {
            Command.diff(basePath)
        }
    }
}