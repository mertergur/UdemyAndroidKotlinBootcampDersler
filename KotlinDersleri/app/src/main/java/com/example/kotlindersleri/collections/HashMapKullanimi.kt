package com.example.kotlindersleri.collections

fun main() {
    // HashMap -> key, value ilişkisi vardır.
    // Dictionary
    val iller = HashMap<Int, String>()
    iller.put(16, "Bursa")
    iller.put(34, "İstanbul")
    iller[6] = "Ankara"

    println(iller)

    println(iller.get(16))
    println(iller[6])

    iller.put(16,"YENİ BURSA")
    println(iller)


    iller[16] = "YENİ BURSA2"
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    for((anahtar, deger) in iller){
        println("Anahtar: $anahtar | Değer: $deger")
    }

   /*
    for(i in iller.keys){
        println("$i")
    }
    for(v in iller.values){
        println(v)
    }
    */

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)
}