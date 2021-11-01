package com.example.homework.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.PlaceDtailActivity
import com.example.homework.R
import com.example.homework.placedata.Affirmation
import com.example.homework.placedata.AffirmationDetail
import com.example.homework.placedata.DataSet

class placeitemAdapter(private val context: Context, private val dataSet: List<Affirmation>)
    : RecyclerView.Adapter<placeitemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textview: TextView = view.findViewById(R.id.item_text)
        val imageview: ImageView = view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val item_layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item1,parent,false)
        return ItemViewHolder(item_layout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textview.text = context.resources.getString(item.strResource)
        holder.imageview.setImageResource(item.imageResource)
        holder.itemView.setOnClickListener{
            var img : Int = item.imageResource
            var intent = Intent(context, PlaceDtailActivity::class.java)
            intent.putExtra("dataimg", item.imageResource)
            intent.putExtra("datatxt", item.strResource)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}
