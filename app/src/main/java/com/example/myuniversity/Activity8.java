package com.example.myuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_8);



        // Set up button1 click listener to navigate to Activity30
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity30.class);
            startActivity(intent);
        });


        button2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity31.class);
            startActivity(intent);
        });

        button3.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity32.class);
            startActivity(intent);
        });
    }
}
