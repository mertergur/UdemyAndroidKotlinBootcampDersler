package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    // Nullable - Null safety - Optional(Swift)
    var x = "Merhaba"

    // Tanımlama
    var str: String? = null

    str = "Merhaba"

    // Kullanımı
    // Yöntem 1

    println("Yöntem 1 : ${str?.trim()}") // trim gereksiz boşlukları siler

    // Yöntem 2 - !!: koda güveniyorum kesinlikle null olmayacak böyle kullanabilirsin anlamına gelir

//    println("Yöntem 1 : ${str!!.trim()}")

    // Yöntem 3
    if(str != null){
        println("Yöntem 3 : ${str.trim()}")
    }else{
        println("Sonuç nulldur")

    }

    // Yöntem 4
    str?.let{
        println("Yöntem 4 : ${str.trim()}")
    }
}