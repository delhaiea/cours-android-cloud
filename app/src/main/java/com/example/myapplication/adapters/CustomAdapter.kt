package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.pojos.ObjectDataSample
import com.example.myapplication.R
import com.example.myapplication.pojos.MySecondObject

class CustomAdapter(private val context: Context):
    RecyclerView.Adapter<CustomAdapter.MyCustomViewHolder>() {

    private val datas: ArrayList<MySecondObject> = ArrayList()
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class MyCustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.name)
        val itemValue: TextView = itemView.findViewById(R.id.value)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomViewHolder {
        return MyCustomViewHolder(inflater.inflate(R.layout.item_custom_recycler, parent, false))
    }

    override fun onBindViewHolder(holder: MyCustomViewHolder, position: Int) {
        val o = datas[position]
        holder.itemName.text = o.text
        holder.itemValue.text = o.value.toString()
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    fun rebuild(newDatas: List<MySecondObject>) {
        datas.clear()
        datas.addAll(newDatas)
        this.notifyDataSetChanged()
    }

}