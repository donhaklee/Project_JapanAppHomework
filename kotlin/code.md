# placeItemAdapter

## Adapter

```kotlin
package com.example.homework.adapter
// placeitemAdapter

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
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}

```

## placedata
```kotlin
// Affirmation
package com.example.homework.placedata

class Affirmation(val strResource: Int, val imageResource: Int) {
}



// DataSet
package com.example.homework.placedata

import com.example.homework.R

class DataSet  {
    fun makeSet() : List<Affirmation> {
        return listOf<Affirmation>(Affirmation(R.string.affirmation1, R.drawable.chiba),
            Affirmation(R.string.affirmation2, R.drawable.hukuoka),
            Affirmation(R.string.affirmation3, R.drawable.kyoto),
            Affirmation(R.string.affirmation4, R.drawable.okinawa),
            Affirmation(R.string.affirmation5, R.drawable.osaka),
            Affirmation(R.string.affirmation6, R.drawable.osakacastle),
            Affirmation(R.string.affirmation7, R.drawable.satporo),
            Affirmation(R.string.affirmation8, R.drawable.univer))
    }
}

```
## restdata
```kotlin

```
