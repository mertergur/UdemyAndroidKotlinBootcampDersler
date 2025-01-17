package com.example.navigationcomponentkullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater,container, false)

        binding.buttonDetay.setOnClickListener {
//            Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
//            binding.textView.text = "Nasılsın

            val urun = Urunler(100,"TV")
            val gecis = AnasayfaFragmentDirections.detayGecis(urun = urun, ad = "Ahmet", yas = 23, boy = 1.78f, bekarMi = false)
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.buttonGoster.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bottomSheetGecis)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Yaşam döngüsü", "onCreate çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Yaşam döngüsü", "onPause çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Yaşam döngüsü", "onResume çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Yaşam döngüsü", "onDestroy çalıştı")
    }
}