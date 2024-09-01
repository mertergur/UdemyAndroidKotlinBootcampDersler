package com.example.hiltkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

//başlangıç noktası
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject // nesneleri çalıştırabileceğimizi temsil eder. Androidde bunlara gerek kalmıyor.
    lateinit var kargo: Kargo
    @Inject
    lateinit var internet: Internet
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kargo.gonder()

        internet.basvuruYap()
    }
}