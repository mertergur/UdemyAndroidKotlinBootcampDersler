package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val fonk = Fonksiyonlar()
    fonk.selamla1()

    val gelenSonuc = fonk.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    fonk.selamla3("Mert")

    val gelenToplam = fonk.toplama(10,20)
    println("Gelen Toplam : $gelenToplam")

    fonk.carp(2,10,"Mert")


}