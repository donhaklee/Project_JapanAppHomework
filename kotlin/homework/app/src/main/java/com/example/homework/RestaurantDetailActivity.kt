package com.example.homework

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.placedata.AffirmationDetail
import com.example.homework.restdata.Affirmation1
import com.example.homework.restdata.AffirmationDetail1

class RestaurantDetailActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurant_detail)

        val PlaceData = intent
        val dataimg = PlaceData.getIntExtra("dataimg",0)
        val datatxt = PlaceData.getStringExtra("datatxt")
        val imgF = findViewById<ImageView>(R.id.imgF)
        val txt = findViewById<TextView>(R.id.txt)
        imgF.setImageResource(dataimg)
        txt.text = datatxt
    }
}