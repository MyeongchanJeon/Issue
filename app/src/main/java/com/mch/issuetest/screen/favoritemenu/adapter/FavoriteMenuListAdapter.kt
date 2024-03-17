package com.mch.issuetest.screen.favoritemenu.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mch.issuetest.screen.favoritemenu.contract.FavoriteMenuContract
import com.mch.issuetest.screen.favoritemenu.viewholder.FavoriteMenuListViewHolder

class FavoriteMenuListAdapter: RecyclerView.Adapter<FavoriteMenuListViewHolder>(), FavoriteMenuContract.Model {
    private var list = mutableListOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteMenuListViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FavoriteMenuListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}