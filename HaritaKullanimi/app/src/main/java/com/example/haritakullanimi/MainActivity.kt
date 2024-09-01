package com.example.haritakullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.haritakullanimi.databinding.ActivityMainBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() , OnMapReadyCallback {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        binding.buttonKonumaGit.setOnClickListener {
            //41.0370013,28.9747705,15z
            val konum = LatLng(41.0370013,28.9747705)
            mMap.addMarker(
                MarkerOptions().position(konum).title("Taksim")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.resim))
            )
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,15f))
            mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE

        }

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // -33.8765463,151.1995803
        val konum = LatLng(-34.0,151.0)
        mMap.addMarker(MarkerOptions().position(konum).title("Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(konum))

    }
}