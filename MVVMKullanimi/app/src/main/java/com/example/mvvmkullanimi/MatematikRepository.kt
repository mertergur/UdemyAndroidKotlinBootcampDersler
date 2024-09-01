package com.example.mvvmkullanimi

class MatematikRepository {
    // repository'nin görevi: Data Sources'i yönetmek.

    var mds = MatematikDataSource()
    suspend fun toplamaYap(alinanSayi1: String, alinanSayi2: String): String =
        mds.toplamaYap(alinanSayi1, alinanSayi2)


    suspend fun carpmaYap(alinanSayi1: String, alinanSayi2: String): String =
        mds.carpmaYap(alinanSayi1, alinanSayi2)

}