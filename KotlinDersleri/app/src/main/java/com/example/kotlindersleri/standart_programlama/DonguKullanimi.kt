package com.example.kotlindersleri.standart_programlama

fun main(){
    // 1,2,3

    for(i in 1..3){ // Swift: i in 1...3
    println("Döngü1 : $i")
    }

    println("--------------------")

    // 10 ile 20 arasında 5er artsın

    for(a in 10..20 step 5){
        println("Döngü2: $a")
    }

    println("--------------------")

    // 20 ile 10 arasında 5 er azalsın

    for(b in 20 downTo 10 step 5){
        println("Döngü3: $b")
    }

    println("--------------------")

    //1,2,3,4,5
    var sayac = 1
    while(sayac < 6){
        println("Döngü4: $sayac")
        sayac++
    }
    /*
    sayac = 1
    do {
        println("Döngü5: $sayac")
        sayac++
    }while (sayac < 6)
*/
    println("--------------------")

    for( i in 1..5) {
        if (i == 3) {
            break
        }
        println("Döngü5: $i")
    }

    println("--------------------")

    for( i in 1..5) {
        if (i == 3)
            continue
        println("Döngü6: $i")
    }

}