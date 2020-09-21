package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_activty.*

class RecyclerActivty : AppCompatActivity() {

    private lateinit var adapter: CustomAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_activty)
        adapter = CustomAdapter(this)

        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        myRecyclerView.adapter = adapter
        adapter.rebuild(genDatas())
    }

    private fun genDatas(): ArrayList<ObjectDataSample> {
        return ArrayList<ObjectDataSample>().also {
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
            it.add(ObjectDataSample("Premiere valeur", 9879))
            it.add(ObjectDataSample("Deuxieme valeur", 2))
            it.add(ObjectDataSample("autre valeur", 666))
        }
    }
}