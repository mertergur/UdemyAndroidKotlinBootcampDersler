package com.example.filmlerapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.filmlerapp.R
import com.example.filmlerapp.databinding.FragmentDetayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)

        val bundle: DetayFragmentArgs by navArgs()
        val film = bundle.film

        binding.filmNesnesi = film

        val url= "http://kasimadalan.pe.hu/filmler_yeni/resimler/${film.resim}"
        Glide.with(this@DetayFragment).load(url).override(500,700).into(binding.imageViewFilm)


        return binding.root
    }
}