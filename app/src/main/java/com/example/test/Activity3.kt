package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent: Intent = Intent (this, Activity4::class.java)
            startActivity(intent)

        }
    }
}