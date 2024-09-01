package com.example.kotlindersleri.nesne_tabanli_programlama

class Araba(var renk: String, var hiz: Int, var calisiyorMu: Boolean) {
    // bu classdan nesne oluşturulduğu zaman çalışacak ilk fonksiyondur.

    init {
        println("******* Primary constructor çalştı. *******")
    }


    fun calistir(){// Side effect: Fonksiyon ile sınıfın özelliklerini değiştirme
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm: Int){
        hiz += kacKm

    }

    fun yavasla(kacKm: Int){
        hiz -= kacKm
    }

    fun bilgiAl(){
        println("---------------------------------------")
        println("Renk           : ${this.renk}")
        println("Hız            : ${hiz}")
        println("Çalışıyor mu   : ${calisiyorMu}")
    }

    // this veya self(Swift) : Bulunduğunuz sınıfı temsil eder
    // super : Kalıtım varsa üst sınıfı temsil eder


}