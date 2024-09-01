package com.example.kotlindersleri.collections

fun main() {
    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")

    println(meyveler)

    meyveler.add("Elma") // Hashset yapıldığı için eklenmedi.

    meyveler.add("Amasya Elması")
    println(meyveler)

    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for(meyve in meyveler){
        println("Sonuç: $meyve")
    }

    for((indeks, meyve) in meyveler.withIndex()){
        println("İndeks: $indeks | Sonuç: $meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)

    meyveler.clear()
    println(meyveler)

}