package com.example.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponentkullanimi.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        binding.imageViewPaylas.setOnClickListener {

            Snackbar.make(it,"paylaşıldı",Snackbar.LENGTH_SHORT).show()

        }

        binding.imageViewKopyala.setOnClickListener {
            Snackbar.make(it,"kopyalandı",Snackbar.LENGTH_SHORT).show()
        }

        return binding.root
    }
}