package com.example.navigationcomponentkullanimi

import java.io.Serializable
//Serializable olmadan veri transferi yapılamaz.
data class Urunler(var id: Int, var ad: String) : Serializable{

}
