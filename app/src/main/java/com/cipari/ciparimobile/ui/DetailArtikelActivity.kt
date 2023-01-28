package com.cipari.ciparimobile.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cipari.ciparimobile.model.Artikel
import com.cipari.ciparimobile.databinding.ActivityDetailArtikelBinding

class DetailArtikelActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDetailArtikelBinding.inflate(layoutInflater) }

    companion object {
        const val EXTRA_ARTIKEL = "extra_artikel"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data = intent.getParcelableExtra(EXTRA_ARTIKEL) as Artikel?
        if (data != null) {
            binding.apply {
                txtTitleArtikel.text = data.title
                txtDesc.text = data.description
                imgArtikel.setImageResource(data.image)
                actionBar.apply {
                    txtTitle.text = data.title
                    btnBack.visibility = View.VISIBLE
                    btnBack.setOnClickListener { onBackPressed() }
                    btnMenu.visibility = View.INVISIBLE
                }
            }
        }

    }
}