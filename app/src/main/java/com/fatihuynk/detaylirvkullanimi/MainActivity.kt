package com.fatihuynk.detaylirvkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.fatihuynk.detaylirvkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var filmlerArrayList: ArrayList<Filmler>//Filmler sınıfından nesneleri tutacak,boş bir arrayList
    private lateinit var adapter: FilmlerAdapter //Boş bir Adapter oluşturduk

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         //Öncelikle RV yapısını tasarım olarak belirleyelim

        binding.rv.setHasFixedSize(true)//Tasarımı ekranda güzel gözüksün diye bu kodlamayı yapıyoruz

        //Nasıl bir görüntü sağlayacağım bunu belirliyorum
        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        //Tek bir satırda 2 tane veri görünecek

        //Filmler sınıfından nesneler oluşturalım ve bunu arrayList içerisine aktaralım
        val f1 = Filmler(1,"Tree Body Problem's","treebodyproblems",99.99)
        val f2 = Filmler(2,"The Martian","martian",95.99)
        val f3 = Filmler(3,"The Signal","thesignal",98.99)
        val f4 = Filmler(4,"The Peripheral","peripheral",97.99)

        //Bu nesneleri içine aktaracağımız bir arrayList oluşturduk
        filmlerArrayList = ArrayList<Filmler>()

        //ArrayList üzerine filmleri ekleyelim
        filmlerArrayList.add(f1)
        filmlerArrayList.add(f2)
        filmlerArrayList.add(f3)
        filmlerArrayList.add(f4)


        //Yukarıda ki boş Adapter ı tanımlayacağız
        adapter = FilmlerAdapter(this, filmlerArrayList)

        binding.rv.adapter = adapter

    }
}