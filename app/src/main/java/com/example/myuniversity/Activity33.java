package com.example.myuniversity;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity33 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_33);

        // Initialize the WebView
        web = findViewById(R.id.web);

        // Enable JavaScript
        web.getSettings().setJavaScriptEnabled(true);

        // Load the URL
        web.loadUrl("https://www.cityuniversity.edu.bd/");
    }
}
