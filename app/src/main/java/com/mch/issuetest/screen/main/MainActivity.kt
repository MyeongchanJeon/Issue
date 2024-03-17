package com.mch.issuetest.screen.main

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.mch.issuetest.R
import com.mch.issuetest.data.IssueListData
import com.mch.issuetest.databinding.ActivityMainBinding
import com.mch.issuetest.databinding.ItemIssueListBinding
import com.mch.issuetest.enums.MainActionType
import com.mch.issuetest.screen.main.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter : MainPresenter by lazy {
        MainPresenter(this)
    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter.getIssueList()
    }

    override fun setIssueList(issueList: MutableList<IssueListData>) {
        issueList.forEach { issue ->
            ItemIssueListBinding.inflate(LayoutInflater.from(this@MainActivity), null, false).apply {
                this.tvTitle.text = issue.issueTitle
                binding.layoutIssueList.addView(this.root)
            }.also { view ->
                view.root.setOnClickListener {
                    actionActivity(issue.issueNumber)
                }
            }
        }
    }

    private fun actionActivity(actionType: Int?=-1) {
        when {
            actionType == MainActionType.FAVORITE_LIST.type -> {

            }
            else -> {} //do nothing
        }
    }
}