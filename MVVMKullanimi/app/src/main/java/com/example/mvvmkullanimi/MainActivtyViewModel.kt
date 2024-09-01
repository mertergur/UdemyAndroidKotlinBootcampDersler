package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//parantez oldugu için kalıtım(inheritance) oluyor.
//parantez olmasaydı interface olacaktı.
class MainActivtyViewModel : ViewModel() {

    var sonuc = MutableLiveData("0")
    var mrepo = MatematikRepository()

    fun toplamaYap(alinanSayi1: String, alinanSayi2: String){
        // arayüzde yapılacak işlemlerde Main kullanılır. DataSource'de IO kullanıldı.
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.toplamaYap(alinanSayi1,alinanSayi2)
        }
    }

    fun carpmaYap(alinanSayi1: String, alinanSayi2: String){
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.carpmaYap(alinanSayi1,alinanSayi2)
        }
    }
}