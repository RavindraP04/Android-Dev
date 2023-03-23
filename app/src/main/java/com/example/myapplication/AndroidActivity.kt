package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class AndroidActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android)

        val androidRoadmap = findViewById<WebView>(R.id.androidRoad)
        androidRoadmap(androidRoadmap)
    }
    private fun androidRoadmap(androidRoadmap: WebView){
        androidRoadmap.webViewClient = WebViewClient()
        androidRoadmap.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://roadmap.sh/android")
        }
    }
}