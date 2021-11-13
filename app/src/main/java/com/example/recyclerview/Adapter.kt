package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(private val items: List<Triple<Int, String, String>>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        var cakeName: TextView? = null
        var price: TextView? = null

        init {
            image = itemView.findViewById(R.id.image)
            cakeName = itemView.findViewById(R.id.cakeName)
            price = itemView.findViewById(R.id.price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recycleview, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image?.setImageResource(items[position].first)
        holder.cakeName?.text = items[position].second
        holder.price?.text = items[position].third
    }

    override fun getItemCount() : Int {
        return items.size
    }
}