package com.example.myuniversity;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity34 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        // Initialize the WebView
        web = findViewById(R.id.web);

        // Enable JavaScript
        web.getSettings().setJavaScriptEnabled(true);

        // Load the URL
        web.loadUrl("https://www.cityuniversity.edu.bd/");
    }
}
