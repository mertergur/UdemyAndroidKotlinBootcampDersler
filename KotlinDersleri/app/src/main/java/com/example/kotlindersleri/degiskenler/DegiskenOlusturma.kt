package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.78
    var ogrenciBasharf = ogrenciAdi[0]
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    println("--------------------------------------")

    var urun_id : Int = 3416
    var urun_adi : String = "Macbook Pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 42999.99
    var urun_tedarikci : String = "Apple"

    println("Ürün id: $urun_id")
    println("Ürün adı: $urun_adi")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat ₺")
    println("Ürün tedarikçi: $urun_tedarikci")

    println("--------------------------------------")

    var a = 10
    var b = 20

    println("$a x $b = ${a*b}")

    println("-------------Sabitler-------------")

    // Sabitler - Constant
    // val(kotlin) - let(Swift) - final(Java)

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    // val numara = 80

    println("-------------Tür Dönüşümü - Type Casting-------------")

    // Tür Dönüşümü - Type Casting
    val i = 42
    val d = 78.95

    // Sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    // Sayısaldan metine dönüşüm
    val sonuc3 = i.toString() //"42"
    val sonuc4 = d.toString() //"78.95"
    println(sonuc3)
    println(sonuc4)

    // Metinden sayısala dönüşüm
    val yazi = "67.54fs"

    val sonuc5 = yazi.toDoubleOrNull()

    if(sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşümde hata oluştu")

    }

    sonuc5?.let {
        println(it)
    }
}