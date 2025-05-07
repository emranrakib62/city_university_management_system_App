package com.example.myuniversity;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class Activity36 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_36);


        web = findViewById(R.id.web);

        web.getSettings().setJavaScriptEnabled(true);


        web.loadUrl("https://www.cityuniversity.edu.bd/");
    }
}
