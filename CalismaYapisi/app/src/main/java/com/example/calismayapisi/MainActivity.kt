package com.example.calismayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.calismayapisi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

private lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_LONG).show()
            binding.textView.text = "Nasılsın"
            val ad = binding.textView.text.toString()

            val intent = Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("ad","Mert")
            intent.putExtra("yas",23)
            intent.putExtra("boy",1.78)
            intent.putExtra("bekar_mi",false)
            startActivity(intent)
        }

    }
}