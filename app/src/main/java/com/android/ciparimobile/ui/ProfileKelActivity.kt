package com.android.ciparimobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.ciparimobile.databinding.ActivityProfileKelBinding

class ProfileKelActivity : AppCompatActivity() {
    private val binding by lazy { ActivityProfileKelBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            actionBar.apply {
                btnBack.visibility = View.VISIBLE
                btnBack.setOnClickListener { onBackPressed() }

                btnMenu.visibility = View.INVISIBLE
            }
        }

    }
}