package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Message : AppCompatActivity() {

    companion object{
        const val userName = "com.example.myapplication.userName"
        const val messageR = "com.example.myapplication.messageR"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val button4 = findViewById<Button>(R.id.button4)
        val e1 = findViewById<TextView>(R.id.e1)
        val e2 = findViewById<TextView>(R.id.e2)

        button4.setOnClickListener {
            val name = e1.text.toString()
            val message = e2.text.toString()

            intent = Intent(this, MessagesentActivity::class.java)
            intent.putExtra(userName, name)
            intent.putExtra(messageR, message)
            startActivity(intent)
        }
    }
}