package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.pojos.UrlDataObject

class ImageAdapter(private val context: Context):
    RecyclerView.Adapter<ImageAdapter.MyGridViewHolder>() {

    private val datas: ArrayList<UrlDataObject> = ArrayList()
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class MyGridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.idValue)
        val itemPicture: ImageView = itemView.findViewById(R.id.picture)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGridViewHolder {
        return MyGridViewHolder(inflater.inflate(R.layout.item_grid_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: MyGridViewHolder, position: Int) {
        val o = datas[position]
        holder.itemName.text = o.value.toString()
        Glide.with(context)
            .load(o.url)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.itemPicture)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    fun rebuild(newDatas: ArrayList<UrlDataObject>) {
        datas.clear()
        datas.addAll(newDatas)
    }
}