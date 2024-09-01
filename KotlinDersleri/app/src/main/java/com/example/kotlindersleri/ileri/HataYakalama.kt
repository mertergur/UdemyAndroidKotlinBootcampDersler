package com.example.kotlindersleri.ileri

fun main() {

    // 1. Compile error
    /*val x = 10

    x = 300*/

    // 2. Exception : Runtime Error


    try {
        val a = 10
        val b = 2
        println("Sonuç : ${a / b}")
        println("İşlem tamam")
    }catch (e:Exception){
        println("Bir sayıyı 0'a bölemezsiniz")
    }

}



