package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Activity32 extends AppCompatActivity {

    private ListView listView;
    private ArrayList<ListData> dataArrayList;
    private ListAdapter listAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_32);

        listView = findViewById(R.id.listview);

        // Sample data
        int[] images = {R.drawable.fb, R.drawable.link, R.drawable.ins, R.drawable.web};
        String[] titles = {"Facebook Page", "Linkdin Profile", "Instragram Link", "Website Link"};
        String[] descriptions = {"","","",""};

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
                    intent = new Intent(Activity32.this, Activity33.class);
                    break;
                case 1: // Second item
                    intent = new Intent(Activity32.this, Activity34.class);
                    break;
                case 2: // Third item
                    intent = new Intent(Activity32.this, Activity35.class);
                    break;
                case 3: // Fourth item
                    intent = new Intent(Activity32.this, Activity36.class);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + position);
            }

            startActivity(intent);
        });
    }
}
