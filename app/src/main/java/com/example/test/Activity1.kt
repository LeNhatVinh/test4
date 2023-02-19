package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val intent: Intent = Intent (this, Activity2::class.java)
            startActivity(intent)

        }
    }
}