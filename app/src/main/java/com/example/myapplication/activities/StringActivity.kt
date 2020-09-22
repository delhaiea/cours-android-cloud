package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_string.*

class StringActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        textViewPluralsOne.text = resources.getQuantityString(R.plurals.found_contact, 1)
        textViewPluralsTwo.text = resources.getQuantityString(R.plurals.found_contact, 1)

        // Define value for dynamic content in string
        textViewDynamicString.text = String.format(getString(R.string.dynamic_content), "This line", 2);

        // You can mix dynamic values and plurals / single variable
        textViewDynamicPlurals.text = resources.getQuantityString(R.plurals.dynamic_plurals, 4, 4);
    }
}