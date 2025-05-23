package com.example.myuniversity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class ScienceFacultyActivity extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_faculty);
        pdfView = findViewById(R.id.pdfView);


        pdfView.fromAsset("frrrr.pdf")
                .load();
    }
}
