package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val context: Context):
    RecyclerView.Adapter<CustomAdapter.MyCustomViewHolder>() {

    private val datas: ArrayList<ObjectDataSample> = ArrayList()
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class MyCustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.name)
        val itemValue: TextView = itemView.findViewById(R.id.value)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        return MyCustomViewHolder(inflater.inflate(R.layout.item_custom_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        val current = datas[position]
        holder.itemName.text = current.name
        holder.itemValue.text = current.value.toString()
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    fun rebuild(newDatas: ArrayList<ObjectDataSample>) {
        datas.clear()
        datas.addAll(newDatas)
    }

}