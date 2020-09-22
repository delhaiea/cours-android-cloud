package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.viewmodels.CustomViewModel
import com.example.myapplication.pojos.ObjectDataSample
import com.example.myapplication.R
import com.example.myapplication.adapters.CustomAdapter
import com.example.myapplication.pojos.MySecondObject
import kotlinx.android.synthetic.main.activity_recycler_activty.*
import kotlin.random.Random

class RecyclerActivty : AppCompatActivity() {

    private lateinit var adapter: CustomAdapter;
    private lateinit var viewModel : CustomViewModel
    private var observerMyData = Observer<List<MySecondObject>> {
        updateUi(it)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_activty)
        viewModel = ViewModelProvider(this)[CustomViewModel::class.java]
        adapter = CustomAdapter(this)
        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        myRecyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        viewModel.mutable.observe(this, observerMyData)
    }

    override fun onStop() {
        viewModel.mutable.removeObserver(observerMyData)
        super.onStop()
    }

    private fun updateUi(data : List<MySecondObject>) {
        adapter.rebuild(data)
    }

    fun onAddButtonClick(v: View) {
        viewModel.insertData("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg",
        "Nouvelle data", Random.nextInt(0, 1000))
    }

}