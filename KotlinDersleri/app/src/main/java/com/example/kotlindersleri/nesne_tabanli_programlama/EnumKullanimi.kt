package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    ucretHesapla(124, KonserveBoyut.ORTA)
}

fun ucretHesapla(adet:Int, boyut: KonserveBoyut){

    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet: ${adet * 30} TL")
        KonserveBoyut.ORTA -> println("Toplam Maliyet: ${adet * 40} TL")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet: ${adet * 50} TL")
    }

}