package com.example.myuniversity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myuniversity.databinding.ActivityDetailedBinding;

public class DetailedActivity extends AppCompatActivity {

    private ActivityDetailedBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize view binding
        binding = ActivityDetailedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Retrieve the intent data
        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String time = intent.getStringExtra("time");

            int image = intent.getIntExtra("image", R.drawable.cv);

            // Bind the data to views
            binding.detailName.setText(name);
            binding.detailTime.setText(time);
             
            binding.detailImage.setImageResource(image);
        }
    }
}
