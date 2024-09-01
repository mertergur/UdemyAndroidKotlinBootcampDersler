package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim

fun main() {
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,10)

    println(topkapiSarayi.kuleSayisi)
    println(topkapiSarayi.pencereSayisi)

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    if(topkapiSarayi is Saray)
        println("Saraydır")
    else
        println("Saray değildir")
/*
    // upcasting - alt sınıfı üst sınıfa çevirme
    val ev: Ev = bogazVilla


    // downcasting - üst sınıfı alt sınıfa çevirme
    val ev1 = Ev(7)
    val saray: Saray = ev1 as Saray
    */
}