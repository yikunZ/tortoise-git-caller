package com.github.yikunz.tortoisegitcaller.actions

import com.intellij.openapi.actionSystem.DefaultActionGroup

class OperationListPopGroup : DefaultActionGroup() {
    init {
        // global operations
        addAction(ShowLogAction())
        addAction(CommitAction())
        addAction(FetchAction())
        addAction(MergeAction())
        addAction(PullAction())
        addAction(PushAction())
        addAction(PullAction())
        addAction(RebaseAction())
        addAction(RevertAction())
        addAction(StashPopAction())
        addAction(StashSaveAction())
        addAction(SwitchAction())
        addAction(CleanUpAction())
        addAction(DiffAction())
        addAction(ResolveAction())
        addAction(RefLogAction())
    }
}