package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class BackendActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backend)

        val backend = findViewById<WebView>(R.id.backend)
        backEnd(backend)
    }
    private fun backEnd(backend: WebView){
        backend.webViewClient = WebViewClient()
        backend.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://www.scaler.com/topics/software-engineering/backend-developer-roadmap/")
        }
    }
}