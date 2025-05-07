package com.example.myuniversity;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity35 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_35);


        web = findViewById(R.id.web);


        web.getSettings().setJavaScriptEnabled(true);


        web.loadUrl("https://www.instagram.com/cityuniversity.ac.bd/");
    }
}
