package com.example.kotlindersleri.collections

fun main() {
    //Tanımlama
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    // Veri ekleme
    meyveler.add("Elma") // 0. index
    meyveler.add("Muz") //1.
    meyveler.add("Kiraz") //2.
    println(meyveler)

    // Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    // Insert
    meyveler.add(1, "Portakal")
    println(meyveler)

    // Okuma
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for((indeks, meyve) in meyveler.withIndex()){ // enumareted() swift
        println("indeks: $indeks | meyve: $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}