package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSampleButtonClick(view: View) {
        val i = Intent(this, MainActivity2::class.java).also {
            it.putExtra("RETURNED_VALUE", "salut!")
        }
        startActivity(i)
    }

    fun onRecyclerButtonClick(v: View) {
        val i = Intent(this, RecyclerActivty::class.java)
        startActivity(i)
    }
}