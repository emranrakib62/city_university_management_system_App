package com.example.myuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_7);

        // Adjust insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find buttons by ID
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        // Set click listeners
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(Activity7.this, ScienceFacultyActivity.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(Activity7.this, ArtsFacultyActivity.class);
            startActivity(intent);
        });
    }
}
