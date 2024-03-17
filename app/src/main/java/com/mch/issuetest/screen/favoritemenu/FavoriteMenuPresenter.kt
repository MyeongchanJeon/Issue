package com.mch.issuetest.screen.favoritemenu

import android.app.Activity
import android.content.Context
import com.mch.issuetest.screen.favoritemenu.contract.FavoriteMenuContract

class FavoriteMenuPresenter(val view: FavoriteMenuContract.View): FavoriteMenuContract.Presenter {
    private val activity: Activity
        get() = view as Activity

    private val context: Context
        get() = view as Context


}