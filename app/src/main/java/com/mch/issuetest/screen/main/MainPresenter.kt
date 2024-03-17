package com.mch.issuetest.screen.main

import android.app.Activity
import android.content.Context
import com.mch.issuetest.R
import com.mch.issuetest.data.IssueListData
import com.mch.issuetest.screen.main.contract.MainContract

class MainPresenter(private val view: MainContract.View): MainContract.Presenter {

    private val activity: Activity
        get() = view as Activity

    private val context: Context
        get() = view as Context

    override fun getIssueList() {
        view.setIssueList(issueList = issueList())
    }

    private fun issueList(): MutableList<IssueListData> {
        return mutableListOf<IssueListData>().apply {
            context.resources.getStringArray(R.array.issue_list).forEachIndexed { index, list ->
                add(IssueListData(list, index))
            }
        }
    }
}