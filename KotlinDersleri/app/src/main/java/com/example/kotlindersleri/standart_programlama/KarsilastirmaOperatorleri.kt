package com.example.kotlindersleri.standart_programlama

fun main() {
    val a = 40
    val b = 50

    val x = 90
    val y = 80

    println("a: $a | b:$b | x:$x | y:$y")
    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a > b : ${a > b}")
    println("a >= b : ${a >= b}")
    println("a < b : ${a < b}")
    println("a <= b : ${a <= b}")

    println("a > b || x > y : ${a > b || x > y}")
    println("a > b && x > y : ${a > b && x > y}")
}