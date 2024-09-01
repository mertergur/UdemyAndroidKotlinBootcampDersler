package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentkullanimi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle: DetayFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekarMi = bundle.bekarMi

        val urunId = bundle.urun.id
        val  urunAd = bundle.urun.ad


        binding.textViewBilgi.text = "$gelenAd - $gelenYas - $gelenBoy - $gelenBekarMi - $urunId - $urunAd"

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textViewBilgi,"Geri dönmek istiyor musun?", Snackbar.LENGTH_SHORT)
                    .setAction("EVET"){
                        isEnabled = false // geri dönüş aktif
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }
                        .show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        return binding.root
    }
}