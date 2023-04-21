package com.example.recyclerviewexample3101

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample3101.RecyclerAdapter.ViewHolder

class RecyclerAdapter: RecyclerView.Adapter<ViewHolder>(){

    var names = arrayOf("Arpan","Raj", "Nihil","Mehul","Niraj","Rahul","Sandeep")
    var images = intArrayOf(R.drawable.router, R.drawable.router, R.drawable.router,R.drawable.router, R.drawable.router, R.drawable.router,R.drawable.router)


    open class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    var itemimage: ImageView
    var itemname: TextView
        init{

            itemimage = itemView.findViewById(R.id.image)
            itemname = itemView.findViewById(R.id.name)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemimage.setImageResource(images[position])
        holder.itemname.text=names[position]
    }

    override fun getItemCount(): Int {
        return names.size

    }


}