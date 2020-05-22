package com.example.fragmentwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_fragment1.*

class Fragment4 : Fragment() {

    lateinit var contentView: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        contentView = inflater.inflate(R.layout.activity_fragment1, container, false)
        return contentView

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val webview = contentView.findViewById<WebView>(R.id.webView)

        val url = "https://daegu.ac.kr"


        val webSettings = webView.settings

        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true


        webview.webViewClient = WebViewClient()

        webview.loadUrl(url)

    }
}
