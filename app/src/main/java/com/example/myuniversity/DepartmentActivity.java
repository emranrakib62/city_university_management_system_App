package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import soup.neumorphism.NeumorphCardView;

public class DepartmentActivity extends AppCompatActivity {
    private Button button20;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);



        NeumorphCardView button20 = findViewById(R.id.button20);
        // Set onClickListener for button20
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent=new Intent(DepartmentActivity.this,DesActivity.class);
                startActivity(myintent);
            }
        });
    }
}


