package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent: Intent = Intent (this, Activity3::class.java)
            startActivity(intent)

        }
    }
}