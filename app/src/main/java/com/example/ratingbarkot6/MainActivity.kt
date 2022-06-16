package com.example.ratingbarkot6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rt = findViewById<RatingBar>(R.id.ratingBar)
        val bt = findViewById<Button>(R.id.button)
        bt.setOnClickListener {
            val ratingBarValue = rt.rating
            Toast.makeText(this@MainActivity, "rating:- $ratingBarValue", Toast.LENGTH_LONG).show()
        }
    }
}