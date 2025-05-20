package com.example.myuniversity;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ScienceFacultyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_faculty);

        TextView questionTextView = findViewById(R.id.questionTextView);


        String questionSet = "Final Question\n\n\n"
                + "City University\n"
                + "Department of Computer Science and Engineering\n"
                + "B. Sc. in Computer Science and Engineering\n"
                + "Semester: Spring 2024\n"
                + "Course Title: Data Communication\n"
                + "Course Code: CSE 220\n"
                + "Total Marks: 200\n"
                + "Time: 2.30 hours\n\n"
                + "Instructions:\n"
                + "Attempt any 6 questions. Each question carries 25 marks.\n"
                + "Use proper examples and diagrams to explain your answers where applicable.\n"
                + "Marks for each part are indicated in the question.\n\n"
                + "Question Set\n\n"
                + "1. Fundamentals of Data Communication\n"
                + "(a) Define data communication. Explain the key components of a data communication system with a neat diagram. (10 marks)\n"
                + "(b) Differentiate between analog and digital signals. Illustrate your answer with examples. (10 marks)\n"
                + "(c) List and explain any three factors that affect the performance of a data communication system. (5 marks)\n\n"
                + "2. OSI Model and Protocols\n"
                + "(a) Draw and explain the OSI reference model, describing the functions of each layer in detail. (15 marks)\n"
                + "(b) Compare the OSI model with the TCP/IP model, highlighting their similarities and differences. (10 marks)\n\n"
                + "3. Transmission Media\n"
                + "(a) Classify transmission media into guided and unguided media. Explain with examples. (10 marks)\n"
                + "(b) Describe the working principles, advantages, and disadvantages of the following:\n"
                + "   i. Optical fiber\n"
                + "   ii. Coaxial cable\n"
                + "   iii. Radio waves (15 marks)\n\n"
                + "4. Error Detection and Correction\n"
                + "(a) Define error detection and error correction in data communication. Why are they important? (5 marks)\n"
                + "(b) Explain the working of the Cyclic Redundancy Check (CRC) method with an example. (10 marks)\n"
                + "(c) Differentiate between Hamming Code and Parity Check. Illustrate your answer with examples. (10 marks)\n\n"
                + "5. Data Link Layer and ARQ Protocols\n"
                + "(a) Discuss the role of the Data Link Layer in the OSI model. (5 marks)\n"
                + "(b) Explain the Stop-and-Wait ARQ protocol with an example. (10 marks)\n"
                + "(c) Compare Go-Back-N ARQ and Selective Repeat ARQ. Use diagrams to support your answer. (10 marks)\n\n"
                + "6. Multiplexing and Switching\n"
                + "(a) What is multiplexing? Explain the following types with examples:\n"
                + "   i. Frequency-Division Multiplexing (FDM)\n"
                + "   ii. Time-Division Multiplexing (TDM) (15 marks)\n"
                + "(b) Differentiate between circuit switching, packet switching, and message switching. (10 marks)\n\n"
                + "7. Wireless Communication\n"
                + "(a) Explain the working principle of wireless communication. List its advantages and disadvantages. (10 marks)\n"
                + "(b) Compare the following wireless communication technologies:\n"
                + "   i. Wi-Fi\n"
                + "   ii. Bluetooth\n"
                + "   iii. Cellular networks (10 marks)\n"
                + "(c) Define Line of Sight (LOS) and its importance in wireless communication. (5 marks)\n\n"
                + "8. Network Security and Encryption\n"
                + "(a) Define network security. What are the main threats to network security? (5 marks)\n"
                + "(b) Explain the working of symmetric key encryption and asymmetric key encryption with suitable examples. (10 marks)\n"
                + "(c) Discuss any two encryption protocols used in secure communication (e.g., SSL/TLS, IPsec). (10 marks)\n";

        // Midterm Question Set
        String questionSeet = "\nMidTerm Question\n\n\n"
                + "City University\n"
                + "Department of Computer Science and Engineering\n"
                + "B. Sc. in Computer Science and Engineering\n"
                + "Semester: Spring 2025\n"
                + "Course Title: Data Communication\n"
                + "Course Code: CSE 220\n"
                + "Total Marks: 100\n"
                + "Time: 1 hour\n\n"
                + "Instructions:\n"
                + "Answer any 3 questions out of the 4 questions provided.\n"
                + "Each question carries 25 marks.\n"
                + "Provide proper examples and diagrams to explain your answers.\n"
                + "Marks for each part are indicated in the question.\n\n"
                + "Question Set\n\n"
                + "1. Fundamentals of Data Communication\n"
                + "   (a) Define data communication and explain its importance in modern computing. (10 marks)\n"
                + "   (b) Describe the main components of a data communication system with a neat diagram. (10 marks)\n"
                + "   (c) Briefly explain any two types of data transmission: simplex, half-duplex, and full-duplex. (5 marks)\n\n"
                + "2. OSI Model\n"
                + "   (a) Draw and describe the OSI reference model with its seven layers. (15 marks)\n"
                + "   (b) Compare and contrast the physical layer and the data link layer in the OSI model. (10 marks)\n\n"
                + "3. Transmission Media\n"
                + "   (a) Explain the difference between guided and unguided transmission media. Provide suitable examples. (10 marks)\n"
                + "   (b) Write short notes on the following transmission media:\n"
                + "       i. Twisted Pair Cable (5 marks)\n"
                + "       ii. Coaxial Cable (5 marks)\n"
                + "       iii. Radio Waves (5 marks)\n\n"
                + "4. Error Detection Techniques\n"
                + "   (a) What is error detection? Why is it important in data communication? (5 marks)\n"
                + "   (b) Explain the working of the parity-check method with an example. (10 marks)\n"
                + "   (c) Briefly describe the concept of Cyclic Redundancy Check (CRC) and its advantages. (10 marks)\n";

        // Setting both question sets in the TextView
        questionTextView.setText(questionSet + questionSeet);
    }
}
