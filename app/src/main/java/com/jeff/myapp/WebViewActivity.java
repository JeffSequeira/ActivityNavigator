package com.jeff.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);
        webview=(WebView)findViewById(R.id.web_layout);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.felight.com/");

    }
}
