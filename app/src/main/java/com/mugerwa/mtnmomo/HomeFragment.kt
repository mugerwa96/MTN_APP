package com.mugerwa.mtnmomo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient

class HomeFragment : Fragment() {

    private lateinit var webView:WebView
    private val URL="https://www.mtn.co.ug/personal/mymtn"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    webView=webView.findViewById(R.id.web)
         
    }




}
