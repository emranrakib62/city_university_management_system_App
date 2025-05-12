package com.example.myuniversity;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

import soup.neumorphism.NeumorphCardView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private NeumorphCardView neumorphCard;
    private TextView animatedTextView;
    private ImageSlider imageSlider;


    private final int[] images = {
            R.drawable.ima, R.drawable.main1, R.drawable.main3,
            R.drawable.mas, R.drawable.main2, R.drawable.main4, R.drawable.main5, R.drawable.fin
    };
    private final String[] titles = {
            "City University Student Orbund", "Certificate Verification", "Online Admission System",
            "Faculty and Department", "Campus Map", "Faculty Member", "Question Pattern", "Others"
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // Check if the user is logged in
        SharedPreferences sharedPreferences = getSharedPreferences("MyUniversityPrefs", Context.MODE_PRIVATE);
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

        if (!isLoggedIn) {
            // Redirect to LoginActivity if the user is not logged in
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
            return;
        }

        // Set the main activity layout
        setContentView(R.layout.activity_main);

        // Initialize views
        gridView = findViewById(R.id.gridview);
        animatedTextView = findViewById(R.id.animatedTextView);
        imageSlider = findViewById(R.id.imageSlider);

        neumorphCard = findViewById(R.id.myNeumorphCard);




        ValueAnimator animator = ValueAnimator.ofFloat(6f, 1f, 6f);
        animator.setDuration(4000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            neumorphCard.setShadowElevation(value);
        });

        animator.start();












        setupImageSlider();


        startTextViewAnimation();


        GridAdapter adapter = new GridAdapter(this, images, titles);
        gridView.setAdapter(adapter);
    }


    private void setupImageSlider() {
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.city11, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city12, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city13, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city15, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city5, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city7, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.city8, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels);
    }


    private void startTextViewAnimation() {
        Animation marqueeAnimation = AnimationUtils.loadAnimation(this, R.anim.marquee_animation);
        animatedTextView.startAnimation(marqueeAnimation);
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
                convertView = inflater.inflate(R.layout.item, parent, false);
            }


            ImageView imageView = convertView.findViewById(R.id.imageView);
            TextView titleView = convertView.findViewById(R.id.titleTextView);


            imageView.setImageResource(images[position]);
            titleView.setText(titles[position]);


            Animation animation = AnimationUtils.loadAnimation(context, R.anim.grid_item_animation);
            convertView.startAnimation(animation);


            convertView.setOnClickListener(v -> {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(context, Activity1.class);
                        break;
                    case 1:
                        intent = new Intent(context, Activity2.class);
                        break;
                    case 2:
                        intent = new Intent(context, Activity3.class);
                        break;
                    case 3:
                        intent = new Intent(context, Activity4.class);
                        break;
                    case 4:
                        intent = new Intent(context, Activity5.class);
                        break;
                    case 5:
                        intent = new Intent(context, Activity6.class);
                        break;
                    case 6:
                        intent = new Intent(context, Activity7.class);
                        break;
                    case 7:
                        intent = new Intent(context, Activity8.class);
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
