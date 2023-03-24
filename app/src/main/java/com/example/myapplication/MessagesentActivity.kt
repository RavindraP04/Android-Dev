package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MessagesentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messagesent)

        val userName = findViewById<TextView>(R.id.userName)
        val messageR = findViewById<TextView>(R.id.messageR)

        val name = intent.getStringExtra(Message.userName)
        val message = intent.getStringExtra(Message.messageR)
        userName.text = name.toString()
        messageR.text = message.toString()
    }
}