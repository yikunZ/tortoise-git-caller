package com.github.yikunz.tortoisegitcaller.actions

import com.github.yikunz.tortoisegitcaller.actions.global.CleanUpAction
import com.github.yikunz.tortoisegitcaller.actions.global.CommitAction
import com.github.yikunz.tortoisegitcaller.actions.global.DiffAction
import com.github.yikunz.tortoisegitcaller.actions.global.FetchAction
import com.github.yikunz.tortoisegitcaller.actions.global.LogAction
import com.github.yikunz.tortoisegitcaller.actions.global.MergeAction
import com.github.yikunz.tortoisegitcaller.actions.global.PullAction
import com.github.yikunz.tortoisegitcaller.actions.global.PushAction
import com.github.yikunz.tortoisegitcaller.actions.global.RebaseAction
import com.github.yikunz.tortoisegitcaller.actions.global.RefLogAction
import com.github.yikunz.tortoisegitcaller.actions.global.ResolveAction
import com.github.yikunz.tortoisegitcaller.actions.global.RevertAction
import com.github.yikunz.tortoisegitcaller.actions.global.StashPopAction
import com.github.yikunz.tortoisegitcaller.actions.global.StashSaveAction
import com.github.yikunz.tortoisegitcaller.actions.global.SwitchAction
import com.intellij.openapi.actionSystem.DefaultActionGroup

class OperationListPopGroup : DefaultActionGroup() {
    init {
        // global operations
        addAction(LogAction())
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