package com.example.homework.hotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.homework.MainActivity
import com.example.homework.R

class HotelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel)
        val h1 = findViewById<ImageView>(R.id.h1)
        h1.setOnClickListener{
            val intent = Intent(this, Hotel1::class.java)
            startActivity(intent)
        }
        val h2 = findViewById<ImageView>(R.id.h2)
        h2.setOnClickListener{
            val intent = Intent(this, Hotel2::class.java)
            startActivity(intent)
        }
        val h3 = findViewById<ImageView>(R.id.h3)
        h3.setOnClickListener{
            val intent = Intent(this, Hotel3::class.java)
            startActivity(intent)
        }

        val back = findViewById<Button>(R.id.back)
        back.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}