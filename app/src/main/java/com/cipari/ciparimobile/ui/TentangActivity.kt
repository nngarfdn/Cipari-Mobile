package com.cipari.ciparimobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cipari.ciparimobile.databinding.ActivityTentangBinding

class TentangActivity : AppCompatActivity() {
    private val binding by lazy { ActivityTentangBinding.inflate(layoutInflater) }
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