package com.example.myuniversity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ArtsFacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_arts_faculty);


                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView questionTextView = findViewById(R.id.questionTextView);

                // BBA Final Exam Question Set
                String finalExamSet = "Final Exam Question\n\n\n"
                        + "City University\n"
                        + "Department of Business Administration\n"
                        + "B. B. A. in Business Administration\n"
                        + "Semester: Spring 2024\n"
                        + "Course Title: Business Management\n"
                        + "Course Code: BBA 310\n"
                        + "Total Marks: 200\n"
                        + "Time: 2.30 hours\n\n"
                        + "Instructions:\n"
                        + "Attempt 5 questions. Each question carries 25 marks.\n"
                        + "Use proper examples and case studies to explain your answers where applicable.\n"
                        + "Marks for each part are indicated in the question.\n\n"
                        + "Question Set\n\n"
                        + "1. Fundamentals of Management\n"
                        + "(a) Define management and explain its importance in organizations. (15 marks)\n"
                        + "(b) Discuss the major functions of management. (10 marks)\n\n"
                        + "2. Organizational Behavior\n"
                        + "(a) Explain the significance of organizational behavior for managers. (15 marks)\n"
                        + "(b) Discuss the factors influencing organizational culture. (10 marks)\n\n"
                        + "3. Marketing Management\n"
                        + "(a) Define marketing and explain the concept of the marketing mix. (15 marks)\n"
                        + "(b) Discuss the stages of the product life cycle. (10 marks)\n\n"
                        + "4. Financial Management\n"
                        + "(a) Define financial management and explain its objectives. (15 marks)\n"
                        + "(b) Discuss the importance of financial analysis in business decision-making. (10 marks)\n\n"
                        + "5. Human Resource Management\n"
                        + "(a) Explain the recruitment process and its significance. (15 marks)\n"
                        + "(b) Discuss the role of employee motivation in improving organizational performance. (10 marks)\n\n"
                        + "6. Operations Management\n"
                        + "(a) What is operations management? Explain its importance in business. (15 marks)\n"
                        + "(b) Discuss the concept of Total Quality Management (TQM). (10 marks)\n\n"
                        + "7. Strategic Management\n"
                        + "(a) Explain the concept of strategic planning and its role in organizational success. (15 marks)\n"
                        + "(b) Analyze the significance of SWOT analysis in formulating business strategies. (10 marks)\n\n"
                        + "8. Business Ethics and Corporate Governance\n"
                        + "(a) Define business ethics and explain its importance. (15 marks)\n"
                        + "(b) Discuss the role of corporate governance in preventing business scandals. (10 marks)\n\n";

                // BBA Midterm Exam Question Set
                String midtermExamSet = "\nMidterm Exam Question\n\n\n"
                        + "City University\n"
                        + "Department of Business Administration\n"
                        + "B. B. A. in Business Administration\n"
                        + "Semester: Spring 2025\n"
                        + "Course Title: Business Management\n"
                        + "Course Code: BBA 310\n"
                        + "Total Marks: 100\n"
                        + "Time: 1 hours\n\n"
                        + "Instructions:\n"
                        + "Answer all the 4 questions provided. Each question carries 25 marks.\n"
                        + "Provide proper examples and case studies to explain your answers.\n"
                        + "Marks for each part are indicated in the question.\n\n"
                        + "Question Set\n\n"
                        + "1. Principles of Management\n"
                        + "(a) Define management and explain its functions. (15 marks)\n"
                        + "(b) Discuss the different types of business organizations. (10 marks)\n\n"
                        + "2. Marketing Management\n"
                        + "(a) Discuss the importance of customer satisfaction in marketing. (15 marks)\n"
                        + "(b) Explain the stages of the product life cycle. (10 marks)\n\n"
                        + "3. Financial Management\n"
                        + "(a) What is the importance of working capital management in a business? (15 marks)\n"
                        + "(b) Describe the key financial ratios used in analyzing a company’s financial performance. (10 marks)\n\n"
                        + "4. Human Resource Management\n"
                        + "(a) Discuss the importance of training and development in human resource management. (15 marks)\n"
                        + "(b) Explain the different types of employee benefits and compensation. (10 marks)\n";

                // Set the text to the TextView
                questionTextView.setText(finalExamSet + "\n\n" + midtermExamSet);
            }
        }












