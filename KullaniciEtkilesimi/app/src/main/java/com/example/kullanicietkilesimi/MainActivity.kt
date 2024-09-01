package com.example.kullanicietkilesimi

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {

            Toast.makeText(this@MainActivity, "Merhaba", Toast.LENGTH_SHORT).show()

        }

        binding.buttonSnackbar.setOnClickListener {

            Snackbar.make(it,"Silmek istiyor musunuz?", Snackbar.LENGTH_SHORT)
                .setAction("Evet"){
                    Snackbar.make(it,"Silindi", Snackbar.LENGTH_SHORT)
                        .show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()

        }

        binding.buttonDialog.setOnClickListener {

            MaterialAlertDialogBuilder(this@MainActivity)
                .setTitle("Başlık")
                .setMessage("Mesaj")
                .setPositiveButton("Tamam"){ d, i ->
                    Toast.makeText(this@MainActivity, "Tamam Seçildi", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("İptal"){
                    d, i ->
                    Toast.makeText(this@MainActivity, "İptal Seçildi", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}