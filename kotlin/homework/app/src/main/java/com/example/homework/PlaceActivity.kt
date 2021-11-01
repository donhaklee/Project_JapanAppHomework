package com.example.homework

import android.content.Context
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.adapter.placeitemAdapter
import com.example.homework.adapter.restitemAdapter
import com.example.homework.placedata.Affirmation
import com.example.homework.placedata.AffirmationDetail
import com.example.homework.placedata.DataSet
import com.example.homework.restdata.Affirmation1
import com.example.homework.restdata.DataSet1

class PlaceActivity : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place)
        val dataset = DataSet().makeSet()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view1)
        recyclerView.adapter = placeitemAdapter(this, dataset)


    }

}