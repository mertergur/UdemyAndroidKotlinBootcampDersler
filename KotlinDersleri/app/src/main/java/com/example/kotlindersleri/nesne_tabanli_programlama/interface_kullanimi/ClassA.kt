package com.example.kotlindersleri.nesne_tabanli_programlama.interface_kullanimi


// Class'a birden fazla kalıtım yapılamaz ancak interface de birden fazla interface i class a ekleme yapabiliriz.
class ClassA: MyInterface {
    override val degisken: Int = 10

    override fun metod1() {
        println("Metod çalıştı")
    }

    override fun metod2(): String {
        return "Metod 2 çalıştı"
    }
}