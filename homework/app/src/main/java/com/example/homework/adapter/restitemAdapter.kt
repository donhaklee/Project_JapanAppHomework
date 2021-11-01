package com.example.homework.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.PlaceDtailActivity
import com.example.homework.R
import com.example.homework.RestaurantActivity
import com.example.homework.RestaurantDetailActivity
import com.example.homework.restdata.Affirmation1

class restitemAdapter(private val context: Context, private val dataSet: List<Affirmation1>)
    : RecyclerView.Adapter<restitemAdapter.MyViewHolder>() {
    class MyViewHolder(private val view1: View) : RecyclerView.ViewHolder(view1){
        val textview: TextView = view1.findViewById(R.id.item_text1)
        val imageView : ImageView = view1.findViewById(R.id.item_image1)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)
        return MyViewHolder(itemview)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val rest = dataSet[position]
        holder.textview.text = context.resources.getString(rest.strResource)
        holder.imageView.setImageResource(rest.imageResource)
        holder.itemView.setOnClickListener{
            var img : Int = rest.imageResource
            var intent = Intent(context, RestaurantDetailActivity::class.java)
            intent.putExtra("dataimg", rest.imageResource)
            intent.putExtra("datatxt", rest.strResource)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return dataSet.size
    }
}