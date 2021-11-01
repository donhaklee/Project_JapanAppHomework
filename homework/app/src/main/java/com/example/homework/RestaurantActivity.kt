package com.example.homework

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.adapter.restitemAdapter
import com.example.homework.placedata.DataSet
import com.example.homework.restdata.DataSet1

class RestaurantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        val dataset1 = DataSet1<Any>().makeSet1()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.adapter = restitemAdapter(this,dataset1)
        recyclerView.layoutManager = GridLayoutManager(this, 3)


    }
}