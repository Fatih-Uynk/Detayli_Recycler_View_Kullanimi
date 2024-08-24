package com.fatihuynk.detaylirvkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FilmlerAdapter(private val mContext: Context, private val filmlerListesi: List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimNesneleriniTutucu>() {

    //İç sınıf(sınıf içinde sınıf oluşturduk)
    inner class CardTasarimNesneleriniTutucu(view: View):RecyclerView.ViewHolder(view) {
    //Bu sınıf cardTasarım üzerinde ki görsel nesneleri temsil edecek
        //kalıtım yoluyla eklediğimiz için aynı tasarımı sonda bir kez daha kullanabildik

        var imageViewFilmResim:ImageView
        var textViewFilmBaslik:TextView
        var textViewFilmFiyat:TextView
        var buttonSepeteEkle:Button

        init {//yani constructor oluşturacağız

            //Yukarıda ki görsel nesneleri burada tanımlayacağız
            imageViewFilmResim = view.findViewById(R.id.imageViewFilmResim)
            textViewFilmBaslik = view.findViewById(R.id.textViewFilmBaslik)
            textViewFilmFiyat = view.findViewById(R.id.textViewFilmFiyat)
            buttonSepeteEkle = view.findViewById(R.id.buttonSepeteEkle)

        }//card nesnelerini tutan sınıfı oluşturduk ve bu sınıfı Adapter a bağlayacağız

    }

    override fun getItemCount(): Int {//Bu metot burada ki veri kümesinin boyutunu istiyor

        return filmlerListesi.size //Yazarsak ne kadar boyutu varsa bu metot öğrenmiş oluyor
        //İçerisinde 10 tane film varsa 10 sayısını almış olacak örnek olarak.
    }

    //Layout dosyası içinde ki card_film_tasarim bağlamak için aşağıda ki metodu kullanacağız
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimNesneleriniTutucu {
    //CardTasarimNesneleriniTutucu sınıfın dan bir nesne istiyor bu metod

        //Tasarım nesnesi oluşturduk
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_film_tasarim,parent,false)
         //Görsel tasarım ve yazılımsal tasarımı birleştirdik
        // false diyerek bunun üstüne başka bir tasarım nesnesi eklemek istemediğimi belirttim.

        return CardTasarimNesneleriniTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimNesneleriniTutucu, position: Int) {
        //holder nesnesiyle görsel nesnelere erişebiliriz ancak öncelikli olarak veri kümesinden verileri alıp
        //init içerisnde ki görsel nesneler üzerine aktarmalıyız

        val film = filmlerListesi[position]//0. index den kaç tane index varsa sırasıyla positon a gelir ve film nesnesine aktarırız

        holder.textViewFilmBaslik.text = film.film_ad
        holder.textViewFilmFiyat.text = "${film.film_fiyat} TL"

        holder.imageViewFilmResim.setImageResource(//Klasik olandan farklı bir şekilde dinamik olarak eriştik resimleri gösterebiliriz
            mContext.resources.getIdentifier(film.film_resim_ad,"drawable", mContext.packageName))
        //Resime resimle ilgili bilgileri aktardık

       holder.buttonSepeteEkle.setOnClickListener{
           //Tıkladığımız zaman bir Toast Mesaj gösterebiliriz
           Toast.makeText(mContext, "${film.film_ad} sepete eklendi",Toast.LENGTH_SHORT).show()
       }

    }

}