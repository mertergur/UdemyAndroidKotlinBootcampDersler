package com.example.konumkullanimi

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.konumkullanimi.databinding.ActivityMainBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    private var izinKontrol = 0

    private lateinit var flpc: FusedLocationProviderClient
    private lateinit var locationTask: Task<Location>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        flpc = LocationServices.getFusedLocationProviderClient(this)

        binding.buttonKonumAl.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)

            if(izinKontrol == PackageManager.PERMISSION_GRANTED){ // İzin onaylanmışsa
                locationTask = flpc.lastLocation
                konumBilgisiAl()

            }else{
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 100)
            }
        }
    }

    fun konumBilgisiAl(){
        locationTask.addOnSuccessListener {
            if(it != null){
                binding.textViewEnlem.text = "Enlem : ${it.latitude}"
                binding.textViewBoylam.text = "Boylam : ${it.longitude}"
            }else{
                binding.textViewEnlem.text = "Enlem : Bulunamadı"
                binding.textViewBoylam.text = "Boylam : Bulunamadı"
            }

        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == 100){
            izinKontrol = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(applicationContext,"İzin onaylandı",Toast.LENGTH_SHORT).show()
                locationTask = flpc.lastLocation
                konumBilgisiAl()
            }else{
                Toast.makeText(applicationContext,"İzin onaylanmadı",Toast.LENGTH_SHORT).show()
            }
        }
    }
}