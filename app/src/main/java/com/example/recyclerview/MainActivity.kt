package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var itemsList: List<Triple<Int, String, String>> = listOf(
        Triple(R.drawable.vanilla, "Ванильный торт", "500 рублей"),
        Triple(R.drawable.chocolate, "Шоколадный торт", "650 рублей"),
        Triple(R.drawable.truf, "Трюфельный торт", "700 рублей"),
        Triple(R.drawable.strawberry, "Клубничный торт", "580 рублей"),
        Triple(R.drawable.tiramisu, "Тирамису", "600 рублей"),
        Triple(R.drawable.redb, "Красный бархат", "750 рублей"),
        Triple(R.drawable.limon, "Лимонный торт", "620 рублей"),
        Triple(R.drawable.lady, "Дамские пальчики", "600 рублей"),
        Triple(R.drawable.cherry, "Пьяная вишня", "685 рублей"),
        Triple(R.drawable.banana, "Банановый торт", "485 рублей"),
        Triple(R.drawable.graf, "Графские развалины", "800 рублей"),
        Triple(R.drawable.napoleon, "Наполеон", "560 рублей"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(itemsList)
    }
}