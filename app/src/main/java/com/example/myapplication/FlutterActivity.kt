package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class FlutterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flutter)
        val flutter = findViewById<WebView>(R.id.flutter)
        flutter(flutter)
    }
    private fun flutter(flutter: WebView){
        flutter.webViewClient = WebViewClient()
        flutter.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://github.com/olexale/flutter_roadmap")
        }
    }
}