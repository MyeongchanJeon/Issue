package com.mch.issuetest.screen.favoritemenu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mch.issuetest.databinding.ActivityFavoriteMenuBinding
import com.mch.issuetest.screen.favoritemenu.contract.FavoriteMenuContract

class FavoriteMenuActivity: AppCompatActivity(), FavoriteMenuContract.View {
    private val presenter: FavoriteMenuPresenter by lazy {
        FavoriteMenuPresenter(this)
    }

    private lateinit var binding: ActivityFavoriteMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}