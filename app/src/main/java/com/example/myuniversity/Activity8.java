package com.example.myuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import soup.neumorphism.NeumorphButton;
import soup.neumorphism.NeumorphCardView;

public class Activity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_8);



        // Set up button1 click listener to navigate to Activity30 neumorphButton1
        NeumorphCardView myButton = findViewById(R.id.neumorphButton);
        NeumorphCardView myButton1 = findViewById(R.id.neumorphButton1);
        NeumorphCardView myButton2 = findViewById(R.id.neumorphButton2);

        myButton.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity30.class);
            startActivity(intent);
        });


        myButton1.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity31.class);
            startActivity(intent);
        });

        myButton2.setOnClickListener(view -> {
            Intent intent = new Intent(Activity8.this, Activity32.class);
            startActivity(intent);
        });
    }
}
