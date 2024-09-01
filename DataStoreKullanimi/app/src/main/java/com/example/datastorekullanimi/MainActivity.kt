package com.example.datastorekullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ap = AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {
            // Kayıt İşlemleri
            ap.kayitAd("Ahmet")
            ap.kayitYas(23)
            ap.kayitBoy(1.78)
            ap.kayitBekar(true)

//            ap.silAd()

            val liste = HashSet<String>()
            liste.add("Ali")
            liste.add("Ece")

            ap.kayitArkadasListe(liste)
            // Okuma İşlemleri
            val gelenAd = ap.okuAd()
            val gelenYas = ap.okuYas()
            val gelenBoy = ap.okuBoy()
            val gelenBekar = ap.okuBekar()


            Log.e("Gelen Ad",gelenAd)
            Log.e("Gelen Yaş",gelenYas.toString())
            Log.e("Gelen Boy",gelenBoy.toString())
            Log.e("Gelen Bekar mı",gelenBekar.toString())

            val gelenListe = ap.okuArkadasListe()

            if(gelenListe != null){
                for(a in gelenListe){
                    Log.e("Gelen arkadaş",a)
                }
            }

            var gelenSayac = ap.okuSayac()
            ap.kayitSayac(++gelenSayac)
            binding.textViewSayac.text = "Açılış Sayısı $gelenSayac"


        }
    }
}