package com.fatihuynk.detaylirvkullanimi

data class Filmler(//Veri Tabanı üzerinde ki sınıfları modellerken data class kullanırız.
    var film_id: Int,
    var film_ad: String,
    var film_resim_ad: String,
    var film_fiyat: Double) {

    //Bu sınıftan nesneler oluşturacağız ve daha sonra arrayList içerisine aktararak veri kümesini oluşturacağız.

   //Bu yapıyı kullanarak Adapter oluşturabiliriz
}