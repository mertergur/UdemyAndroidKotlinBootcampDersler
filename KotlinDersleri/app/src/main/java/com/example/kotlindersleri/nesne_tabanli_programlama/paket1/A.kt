package com.example.kotlindersleri.nesne_tabanli_programlama.paket1

open class A {
    var varsayilanDegisken = 1
    public var publicDegisken = 2 // heryerden erişilebilir
    private var privateDegisken = 3 // sadece class(sınıf) içinden erişilebilir
    internal var internalDegisken = 4 // aynı modül içerisinden erişilebilir
    protected var protectedDegisken = 5 // sadece alt sınıflar tarafından erişilebilir -- erişmek için classın başına open eklenir. ve b sınıfına kalıtım eklenir

    fun fonksiyon1(){
        println(privateDegisken)
    }

}