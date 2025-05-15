package com.example.myuniversity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import soup.neumorphism.NeumorphCardView;

public class Activity7 extends AppCompatActivity {
    private NeumorphCardView neumorphButton;
    private NeumorphCardView neumorphButton1;
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


        neumorphButton1 = findViewById(R.id.neumorphButton1);

        neumorphButton = findViewById(R.id.neumorphButton);

        ValueAnimator animator = ValueAnimator.ofFloat(6f, 1f, 6f);
        animator.setDuration(8000); // 3 seconds for smooth looping
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            neumorphButton.setShadowElevation(value);
        });

        animator.start();





        neumorphButton1 = findViewById(R.id.neumorphButton1);

        ValueAnimator animator1 = ValueAnimator.ofFloat(6f, 1f, 6f);
        animator1.setDuration(8000); // 3 seconds for smooth looping
        animator1.setRepeatCount(ValueAnimator.INFINITE);
        animator1.setRepeatMode(ValueAnimator.REVERSE);

        animator1.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            neumorphButton1.setShadowElevation(value);
        });

        animator1.start();





    }
}
