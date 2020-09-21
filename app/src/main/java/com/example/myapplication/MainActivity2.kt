package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

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