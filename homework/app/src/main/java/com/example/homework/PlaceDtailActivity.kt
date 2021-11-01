package com.example.homework

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.adapter.placeitemAdapter
import com.example.homework.placedata.Affirmation
import com.example.homework.placedata.AffirmationDetail

class PlaceDtailActivity  : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place_detail)

        val PlaceData = intent
        val dataimg = PlaceData.getIntExtra("dataimg",0)
        val datatxt = PlaceData.getStringExtra("datatxt")
        val imgF = findViewById<ImageView>(R.id.imgF)
        val txt = findViewById<TextView>(R.id.txt)
        imgF.setImageResource(dataimg)
        txt.text = datatxt


    }
}