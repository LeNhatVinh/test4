package com.example.test

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity4)
        var Login = findViewById<Button>(R.id.button)
        Login.setOnClickListener{
            Login()

//            var status = if(username.text.toString().equals("username@gmail.com")
//                && password.text.toString().equals("123456"))"Login successful"
//            else "login fail"
//            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
        }
    }
    private fun Login(){
        var username = findViewById<EditText>(R.id.User)
        var password = findViewById<EditText>(R.id.Pass)
        if(username.text.toString().equals(Util.ACCOUNT) && password.text.toString().equals(Util.PASS_WORD)) {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login success")
                .setPositiveButton("Ok", { dialogInterface: DialogInterface, i: Int -> Continue() })
                .show()
        } else {
            val builder = android.app.AlertDialog.Builder(this)

            builder.setMessage("Login faild")
                .setNegativeButton("Ok", { dialogInterface: DialogInterface, i: Int -> goHome()})
                .show()
        }
    }
    private fun goHome() {
        startActivity(Intent(this, MainActivity::class.java))
    }
    private fun Continue() {
        startActivity(Intent(this, Activity5::class.java))
    }

    object Util {
        const val ACCOUNT = "username@gmail.com"
        const val PASS_WORD = "123456"
    }
}
