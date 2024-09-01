package com.example.kotlindersleri.nesne_tabanli_programlama.paket2

import com.example.kotlindersleri.nesne_tabanli_programlama.paket1.A

//Kalıtımlı sınıf
class B: A() {

    fun fonksiyon(){

        println(varsayilanDegisken)
        println(publicDegisken)
        println(internalDegisken)
        println(protectedDegisken)
    }
}

/* KALITIMSIZ SINIF
class B {

    fun fonksiyon(){
        val nesne = A()

        println(nesne.varsayilanDegisken)
        println(nesne.publicDegisken)
        println(nesne.internalDegisken)
    }

}*/
