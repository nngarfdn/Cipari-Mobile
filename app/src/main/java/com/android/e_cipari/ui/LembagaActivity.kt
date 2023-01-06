package com.android.e_cipari.ui

import android.content.res.AssetManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.e_cipari.databinding.ActivityLembagaBinding

class LembagaActivity : AppCompatActivity() {
    private val binding by lazy { ActivityLembagaBinding.inflate(layoutInflater) }
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
        showWebView()
    }


    // show webview html from assets
    fun showWebView() {
        val assetManager: AssetManager = assets
        val inputStream = assetManager.open("lembaga.html")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val html = String(buffer)
        binding.webView.loadData(html, "text/html", "UTF-8")

        }
}