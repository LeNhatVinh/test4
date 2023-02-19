package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Activity5 : AppCompatActivity() {
    lateinit var stringname: String
    lateinit var stringemail: String
    lateinit var stringphone: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity5)
        val btnsave = findViewById<Button>(R.id.button7)
        val name = findViewById<EditText>(R.id.name)
        val email= findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
    }


}