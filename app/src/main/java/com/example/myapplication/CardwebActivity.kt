package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class CardwebActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardweb)

        val webView = findViewById<WebView>(R.id.webView)
        webViewSetUp(webView)
    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webView: WebView){
        webView.webViewClient = WebViewClient()
        webView.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://frontendmasters.com/guides/learning-roadmap/")
        }
    }
}
