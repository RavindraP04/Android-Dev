package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class DevopsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.devops)

        val devOps = findViewById<WebView>(R.id.webOps)
        devOps(devOps)
    }
    private fun devOps(devOps: WebView){
        devOps.webViewClient = WebViewClient()
        devOps.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://github.com/milanm/DevOps-Roadmap")
        }
    }
}