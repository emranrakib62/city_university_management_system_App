package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {
    private GridView gridView;

    // Data for the grid (updated with 12 items)
    private final int[] images = {
            R.drawable.cse, R.drawable.ee1, R.drawable.tex,
            R.drawable.mech, R.drawable.civil, R.drawable.phar,
            R.drawable.llb, R.drawable.agri, R.drawable.eng,
            R.drawable.bba
    };

    private final String[] titles = {
            "CSE DEPARTMEENT", "EEE DEPARTMEENT", "TEXTILE DEPARTMEENT",
            "MECHANICAL DEPARTMEENT", "CIVIL\n DEPARTMEENT", "PHARMACY DEPARTMEENT",
            "LLB\n DEPARTMEENT", "AGRICULTURE DEPARTMEENT", "ENGLISH DEPARTMEENT",
            "BBA\n DEPARTMEENT"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        // Initialize the GridView
        gridView = findViewById(R.id.gridview);

        // Set custom adapter
        GridAdapter adapter = new GridAdapter(this, images, titles);
        gridView.setAdapter(adapter);
    }

    public class GridAdapter extends BaseAdapter {
        private final Context context;
        private final int[] images;
        private final String[] titles;

        public GridAdapter(Context context, int[] images, String[] titles) {
            this.context = context;
            this.images = images;
            this.titles = titles;
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(context);
                convertView = inflater.inflate(R.layout.item_1, parent, false);
            }

            // Initialize views
            ImageView imageView = convertView.findViewById(R.id.imageView);
            TextView titleView = convertView.findViewById(R.id.titleTextView);

            // Set data
            imageView.setImageResource(images[position]);
            titleView.setText(titles[position]);

            // Set onClick listener for each item
            convertView.setOnClickListener(v -> {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(context, Activity10.class);
                        break;
                    case 1:
                        intent = new Intent(context, Activity11.class);
                        break;
                    case 2:
                        intent = new Intent(context, Activity12.class);
                        break;
                    case 3:
                        intent = new Intent(context, Activity13.class);
                        break;
                    case 4:
                        intent = new Intent(context, Activity14.class);
                        break;
                    case 5:
                        intent = new Intent(context, Activity15.class);
                        break;
                    case 6:
                        intent = new Intent(context, Activity16.class);
                        break;
                    case 7:
                        intent = new Intent(context, Activity17.class);
                        break;
                    case 8:
                        intent = new Intent(context, Activity18.class);
                        break;
                    case 9:
                        intent = new Intent(context, Activity19.class);
                        break;
                    default:
                        return;
                }
                context.startActivity(intent);
            });

            return convertView;
        }
    }
}
