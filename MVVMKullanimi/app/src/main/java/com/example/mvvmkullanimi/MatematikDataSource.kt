package com.example.mvvmkullanimi

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikDataSource {

    // suspend: bunun asenk çalışan bir fonk olduğunu gösterir. yani coroutine ile çalıştığını gösterir.
    //asenkron:  veritabanlarıyla daha perf. çalışır

    // return olabilir. Return edilmeyecekse withContext Kullanılmayacak.
    // veritabanlarıyla işlem yapılacaksa Dispatchers.IO, Arayüze yaklaşıldığında Main kullanılacak.
    suspend fun toplamaYap(alinanSayi1: String, alinanSayi2: String): String =
        withContext(Dispatchers.IO){
            val sayi1 = alinanSayi1.toInt()
            val sayi2 = alinanSayi2.toInt()

            val carpma  = sayi1 + sayi2

            return@withContext carpma.toString()
        }

    suspend fun carpmaYap(alinanSayi1: String, alinanSayi2: String): String =
        withContext(Dispatchers.IO){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpma  = sayi1 * sayi2

        return@withContext carpma.toString()
    }

}