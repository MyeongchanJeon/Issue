package com.mch.issuetest.screen.main.contract

import com.mch.issuetest.data.IssueListData

interface MainContract {
    interface View {
        fun setIssueList(issueList: MutableList<IssueListData>)
    }
    interface Presenter {
        fun getIssueList()
    }
}