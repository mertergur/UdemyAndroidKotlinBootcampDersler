package com.example.widgetskullanimi

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.widgetskullanimi.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var kontrol = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOku.setOnClickListener {
            val alinanVeri = binding.editTextGirdi.text.toString()

            binding.textViewSonuc.text = alinanVeri
        }

        binding.buttonResim1.setOnClickListener {

            binding.imageView.setImageResource(R.drawable.resim1)

        }

        binding.buttonResim2.setOnClickListener {

            binding.imageView.setImageResource(resources.getIdentifier("resim2","drawable",packageName))

        }

        binding.switch1.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked){
                Log.e("WidgetsSonuc","Switch: ON")
            }else{
                Log.e("WidgetsSonuc","Switch: OFF")
            }

        }



        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            kontrol = isChecked
            if(kontrol) {
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Sonuc", "Secilen Button : $buttonYazi")
            }

        }

        val ulkeler = ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("İtalya")
        ulkeler.add("Japonya")
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,ulkeler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        binding.buttonBasla.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }

        binding.buttonDur.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }
        binding.textViewSlider.text = "İlerleme: ${binding.slider.progress}"

        binding.slider.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.textViewSlider.text ="İlerleme: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        binding.buttonSaat.setOnClickListener {
            val tp = MaterialTimePicker.Builder()
                .setTitleText("Saat Seç")
                .setTimeFormat(TimeFormat.CLOCK_24H)
                .setInputMode(MaterialTimePicker.INPUT_MODE_CLOCK)
                .build()
            tp.show(supportFragmentManager,"Saat")
            tp.addOnPositiveButtonClickListener {
                binding.editTextSaat.setText("${tp.hour} : ${tp.minute}")
            }
        }

        binding.buttonTarih.setOnClickListener {
            val dp = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Tarih Seç")
                .setInputMode(MaterialDatePicker.INPUT_MODE_CALENDAR)
                .build()
            dp.show(supportFragmentManager,"Tarih")

            dp.addOnPositiveButtonClickListener {
                val df = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val tarih = df.format(it)
                binding.editTextTarih.setText(tarih)
            }
        }

        binding.buttonGoster.setOnClickListener {
            Log.e("Sonuc","Switch Durum : ${binding.switch1.isChecked}")
            if(kontrol) {
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Sonuc", "Toggle Durum : $buttonYazi")
            }
            val ulke = binding.autoCompleteTextView.text.toString()
            Log.e("Sonuc","Ülke : $ulke")
            Log.e("Sonuc", "Slider Durum: ${binding.slider.progress}")
        }

    }
}