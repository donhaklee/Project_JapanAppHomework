package com.example.homework.hotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.R

class Hotel3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frag3)
        val back1 = findViewById<Button>(R.id.back_hotel3)
        back1.setOnClickListener{
            val intent = Intent(this, HotelActivity::class.java)
            startActivity(intent)
        }
    }
}