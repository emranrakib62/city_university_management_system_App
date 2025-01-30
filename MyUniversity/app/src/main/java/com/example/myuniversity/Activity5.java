package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity5 extends AppCompatActivity {
    WebView web;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        // Initialize the WebView
        web = findViewById(R.id.web);

        // Enable JavaScript
        web.getSettings().setJavaScriptEnabled(true);

        // Load the URL
        web.loadUrl("https://mapcarta.com/W587837411/Map");
    }
}
