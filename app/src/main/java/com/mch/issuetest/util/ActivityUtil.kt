package com.mch.issuetest.util

import android.app.Activity
import android.content.Intent
import com.mch.issuetest.screen.favoritemenu.FavoriteMenuActivity

object ActivityUtil {
    fun startFavoriteMenuActivity(activity: Activity) {
        activity.startActivity(Intent(activity, FavoriteMenuActivity::class.java))
    }
}