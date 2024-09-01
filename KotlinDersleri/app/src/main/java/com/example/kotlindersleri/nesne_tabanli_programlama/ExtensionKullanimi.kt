package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5 carpi 2 // infix fonksiyon kullanımı
//    val sonuc = 5.carpi(2) // infix siz kullanım
    println("Gelen sonuc: $sonuc")
}

infix fun Int.carpi(sayi: Int) : Int{

    return this * sayi // this = int sınıfı
}