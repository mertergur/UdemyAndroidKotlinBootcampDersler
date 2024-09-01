package com.example.kotlindersleri

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var str1 : String? = null
    lateinit var str2: String // lateinit: daha sonra başlatacağım/değer aktaracağım anlamına geliyor
    var sayi: Int = 0
    // lateinit primitive(int, double vs) tiplerde kullanılamaz
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        str2 = "Merhaba"
    }
}