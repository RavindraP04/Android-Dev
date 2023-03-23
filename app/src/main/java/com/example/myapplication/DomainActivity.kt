package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class DomainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.domain)

        val callButton = findViewById<Button>(R.id.button2)
        val cardWeb = findViewById<CardView>(R.id.cardWeb)
        val cardBack = findViewById<CardView>(R.id.cardAnd)
        val devOps = findViewById<CardView>(R.id.cardIOS)
        val blockChain = findViewById<CardView>(R.id.cardML)
        val flutter = findViewById<CardView>(R.id.cardBlock)
        val android = findViewById<CardView>(R.id.cardData)


        callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+"9303321532")
            startActivity(intent)
        }

        cardWeb.setOnClickListener {
            intent = Intent(applicationContext, CardwebActivity::class.java)
            startActivity(intent)
        }

        cardBack.setOnClickListener {
            intent = Intent(applicationContext, BackendActivity::class.java)
            startActivity(intent)
        }

        devOps.setOnClickListener {
            intent = Intent(applicationContext, DevopsActivity::class.java)
            startActivity(intent)
        }

        blockChain.setOnClickListener {
            intent = Intent(applicationContext, BlockchainActivity::class.java)
            startActivity(intent)
        }

        flutter.setOnClickListener {
            intent = Intent(applicationContext, FlutterActivity::class.java)
            startActivity(intent)
        }
        android.setOnClickListener {
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }
    }
}