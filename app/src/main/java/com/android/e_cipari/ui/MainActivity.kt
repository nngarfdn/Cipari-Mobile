package com.android.e_cipari.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.e_cipari.R
import com.android.e_cipari.databinding.ActivityMainBinding
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    private var imageList = ArrayList<SlideModel>()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageList.add(
            SlideModel(R.drawable.ciparibanner1, ScaleTypes.CENTER_CROP)
        )
        imageList.add(
            SlideModel(R.drawable.ciparibanner2, ScaleTypes.CENTER_CROP)
        )// for one image

        binding.imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)

        binding.apply {

            actionBar.apply {
                btnMenu.visibility = View.VISIBLE
                btnMenu.setOnClickListener {
                    startActivity(Intent(this@MainActivity, TentangActivity::class.java))
                }
            }
            btnInstagram.setOnClickListener {
                openUrl("https://www.instagram.com/kelurahan.cipari/")
            }
            btnYoutube.setOnClickListener {
                openUrl("https://www.youtube.com/@kelurahan_cipari")
            }

            btnWebsite.setOnClickListener {
                openUrl("https://kel-cipari.kuningankab.go.id/")
            }

            btnProfile.setOnClickListener {
                startActivity(Intent(this@MainActivity, ProfileKelActivity::class.java))
            }

            btnLembaga.setOnClickListener {
                startActivity(Intent(this@MainActivity, LembagaActivity::class.java))
            }

            btnInformasi.setOnClickListener {
                startActivity(Intent(this@MainActivity, ArtikelActivity::class.java))
            }
        }
    }

    //intent open url
    fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}