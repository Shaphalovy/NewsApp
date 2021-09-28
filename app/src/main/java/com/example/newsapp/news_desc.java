package com.example.newsapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class news_desc extends AppCompatActivity
{
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_desc);

        webView=(WebView)findViewById(R.id.webview);


        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);

        final ProgressDialog pd=new ProgressDialog(this);
        pd.setTitle("News Portal");
        pd.setMessage("Loading...!");

        webView.setWebViewClient(new WebViewClient()
                                 {
                                     @Override
                                     public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                         super.onPageStarted(view, url, favicon);
                                         pd.show();
                                     }

                                     @Override
                                     public void onPageFinished(WebView view, String url) {
                                         super.onPageFinished(view, url);
                                         pd.dismiss();
                                     }
                                 }
        );

        String linkdata = getIntent().getStringExtra("linkvalue");
        webView.loadUrl(linkdata);
    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }else {
            Intent intent = new Intent(news_desc.this,MainActivity.class);
            startActivity(intent);
           super.onBackPressed();
        }
    }
}