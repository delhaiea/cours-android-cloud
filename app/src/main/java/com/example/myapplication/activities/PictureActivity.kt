package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.pojos.UrlDataObject
import com.example.myapplication.adapters.ImageAdapter
import kotlinx.android.synthetic.main.activity_picture.*

class PictureActivity : AppCompatActivity() {

    private lateinit var adapter: ImageAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture)

        adapter = ImageAdapter(this)

        pictureRecyclerView.layoutManager = GridLayoutManager(this, resources.getInteger(R.integer.number_of_columns))
        pictureRecyclerView.adapter = adapter
        adapter.rebuild(genDatas())
    }

    private fun genDatas(): ArrayList<UrlDataObject> {
        return ArrayList<UrlDataObject>().also {
            it.add(UrlDataObject("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg", 30))
            it.add(UrlDataObject("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg", 31))
            it.add(UrlDataObject("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg", 32))
            it.add(UrlDataObject("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg", 33))
            it.add(UrlDataObject("https://img.phonandroid.com/2013/08/bugdroid-smartphone.jpg", 34))
        }
    }

}