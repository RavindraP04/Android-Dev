package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class BlockchainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.blockchain)

        val blockChain = findViewById<WebView>(R.id.blokChain)
        blockChain(blockChain)
    }
    @SuppressLint("SetJavaScriptEnabled")
    private fun blockChain(blockChain: WebView){
        blockChain.webViewClient = WebViewClient()
        blockChain.apply {
            settings.javaScriptEnabled = true
            loadUrl("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwje0Nirr_L9AhUX7TgGHQILAmQQwqsBegQIJhAF&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DuULy2rc6YDc&usg=AOvVaw1pnvHmXpphoMu3NhQh3zOS")
        }
    }
}