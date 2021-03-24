package com.example.catapplication;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private WebView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView view = (WebView) findViewById(R.id.WebView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/index.html");
        view.getSettings().setAppCachePath("/data/data/com.example.catapplication/cache");
        view.getSettings().setAppCacheEnabled(true);
        WebSettings settings = view.getSettings();
        settings.setDomStorageEnabled(true);
        }

    }
