package com.example.calismayapisi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calismayapisi.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas",0)
        val gelenBoy = intent.getDoubleExtra("boy",0.0)
        val gelenBekarMi = intent.getBooleanExtra("bekar_mi",false)

        binding.textViewBilgi.text = "$gelenAd - $gelenYas - $gelenBoy - $gelenBekarMi"



    }
}