package com.example.kotlindersleri.nesne_tabanli_programlama

class Fonksiyonlar {

    // Void - Geri dönüş değeri olmayan fonksiyon
    fun selamla1(){
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    // Return - Geri dönüş değeri olan fonksiyon
    fun selamla2() : String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    // Parametre
    fun selamla3(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    fun toplama(sayi1: Int, sayi2: Int) : Int{
        val toplam = sayi1 + sayi2
        return toplam
    }

    // Overloading - Mülakatta çıkabilir - Aynı isimde fonksiyonlar oluşturmaya yarar
    // Parametrelerin  türlerinde değişiklik yapmak gerekir veya yeni parametre eklemek gerekir
    fun carp(sayi1: Int, sayi2: Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Double, sayi2: Int){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Double, sayi2: Double){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Int, sayi2: Double){
        println("Çarpma : ${sayi1 * sayi2}")
    }
    fun carp(sayi1: Int, sayi2: Int, isim: String){
        println("Çarpma : ${sayi1 * sayi2} - İşlem yapan: $isim")
    }

}