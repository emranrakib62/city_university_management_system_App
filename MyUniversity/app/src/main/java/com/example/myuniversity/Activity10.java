package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity10 extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ListData> dataArrayList;
    private ListAdapter listAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        listView = findViewById(R.id.listview);

        // Sample data
        int[] images = {R.drawable.anis, R.drawable.ata, R.drawable.sar, R.drawable.sab, R.drawable.mon, R.drawable.mir};
        String[] titles = {"Engr S M Anisur Rahman", "Md Ataullah Bhuiyan", "Sharmin Akter", "Sabbir Hossen", "Monoara Sultana Morzina", "Md. Ajharul Islam Miraj"};
        String[] descriptions = {"Associate Professor & Head", "Senior Lecturer & Coordinator", "Lecturer", "Lecturer", "Lecturer", "Lecturer"};

        dataArrayList = new ArrayList<>();
        for (int i = 0; i < images.length; i++) {
            dataArrayList.add(new ListData(titles[i], descriptions[i], images[i]));
        }

        listAdapter = new ListAdapter(this, dataArrayList);
        listView.setAdapter(listAdapter);

        // Handle item clicks
        listView.setOnItemClickListener((adapterView, view, position, id) -> {
            Intent intent;

            switch (position) {
                case 0: // First item
                    intent = new Intent(Activity10.this, ActivityAnis.class);
                    break;
                case 1: // Second item
                    intent = new Intent(Activity10.this, ActivityAta.class);
                    break;
                case 2: // Third item
                    intent = new Intent(Activity10.this, ActivitySharmin.class);
                    break;
                case 3: // Fourth item
                    intent = new Intent(Activity10.this, ActivitySabbir.class);
                    break;
                case 4: // Fifth item
                    intent = new Intent(Activity10.this, ActivityMonoar.class);
                    break;
                case 5: // Sixth item
                    intent = new Intent(Activity10.this, ActivityMiraj.class);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + position);
            }

            startActivity(intent);
        });
    }
}
