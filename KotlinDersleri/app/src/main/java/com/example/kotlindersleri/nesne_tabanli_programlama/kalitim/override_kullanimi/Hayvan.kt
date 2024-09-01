package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.override_kullanimi

open class Hayvan {
    open fun sesCikar(){ // override olması için open tanımlamamız gerekir
        println("Sesim yok")
    }
}