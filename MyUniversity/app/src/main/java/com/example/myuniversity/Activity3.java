package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {

    WebView web;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        // Initialize the WebView
        web = findViewById(R.id.web);

        // Enable JavaScript
        web.getSettings().setJavaScriptEnabled(true);

        // Load the URL
        web.loadUrl("https://cityuniversity.orbund.com/einstein-freshair/application/online_application_form.jsp?id=2&aid=3");
    }
}