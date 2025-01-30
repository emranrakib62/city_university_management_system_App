package com.example.myuniversity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity30 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_30);

        // Find the TextView in the layout
        TextView admissionInfo = findViewById(R.id.admissionInfo);

        // Text content to be displayed
        String infoText = "Under-Graduate Programs:\n" +
                "To be eligible for admission as a regular student the application must have:\n\n" +
                "- Completed higher secondary education (12 years of schooling pre-university education) under a system different from SSC/HSC or O/A-Levels will be considered for equivalent by the University on a case-to-case basis.\n" +
                "- A minimum GPA of 2.5 each in SSC/Equivalence and HSC/Equivalence examination and must have a total GPA 6.00.\n" +
                "- B Grade/GPA 4.0 and for A-Level students two subjects with minimum C Grade/GPA 3.5 for O-Level students five subjects with minimum.\n" +
                "- Go to City University Website, go to admission, and then go to Apply Online.\n" +
                "- GPA 5.0 Freedom fighters ward will be considered a total.\n" +
                "- 410 out of 800 and in average 450 for GED examination each courses marks must have.\n" +
                "- A minimum SSC/O-Level and HSC/A-Level must have GPA 2.0 in case of Music, Fashion Design, Fine Arts & Graphic Design Programs.\n\n" +
                "Graduate Programs:\n" +
                "To be eligible for admission as a regular student of Graduate/Master Program the applicant must have:\n\n" +
                "- Completed undergraduate degree with at least 2.0 CGPA and above-mentioned criteria.\n\n" +
                "Required Papers For Admission:\n" +
                "* Two (2) attested copies of all mark sheets & certificates. (Original academic papers must present at admission time).\n" +
                "* Four (4) attested copies of recent passport size color photographs.\n" +
                "* Attested copy of national ID card.\n" +
                "* Attested copy of certificate from Union Parishad/Word Commissioner.\n" +
                "* Job experience certificate for EMBA.\n\n" +
                "Admission Procedure:\n" +
                "A candidate seeking admission in Undergraduate or Graduate Program must:\n\n" +
                "- Collect or download prescribed admission form.\n" +
                "- Fill-up prescribed admission form.\n" +
                "- Submit the admission form with 4 copies of attested passport size color photographs within the deadline and pay for the admission form, if he has not already paid.\n" +
                "- Seat for admission test.\n" +
                "- Submit attested copies of certificates/testimonials of all board examinations passed.\n" +
                "- Submit 4 copies of passport size and attested color photographs.\n" +
                "- Pay admission and other fees.\n" +
                "- Collect ID card when ready from the Admission Office.";

        // Set the text dynamically
        admissionInfo.setText(infoText);
    }
}
