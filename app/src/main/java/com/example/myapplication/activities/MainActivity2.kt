package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class MainActivity2 : AppCompatActivity() {

    lateinit var returnLabel: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        returnLabel = findViewById(R.id.returnLabel)
        val value = intent.extras?.getString("RETURNED_VALUE")
        returnLabel.text = value;
    }
}