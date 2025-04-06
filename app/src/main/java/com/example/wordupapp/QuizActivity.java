package com.example.wordupapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Initialize buttons
        Button playButton = findViewById(R.id.playButton);
        Button optionOne = findViewById(R.id.optionOne);
        Button optionThree = findViewById(R.id.optionThree);
        Button optionTwo = findViewById(R.id.optionTwo);
        Button optionZero = findViewById(R.id.optionZero);



        // Set click listeners
        playButton.setOnClickListener(v -> Toast.makeText(QuizActivity.this, "Play button clicked", Toast.LENGTH_SHORT).show());

        optionOne.setOnClickListener(v -> Toast.makeText(QuizActivity.this, "Selected: One", Toast.LENGTH_SHORT).show());
        optionThree.setOnClickListener(v -> Toast.makeText(QuizActivity.this, "Selected: Three", Toast.LENGTH_SHORT).show());
        optionTwo.setOnClickListener(v -> Toast.makeText(QuizActivity.this, "Selected: Two", Toast.LENGTH_SHORT).show());
        optionZero.setOnClickListener(v -> Toast.makeText(QuizActivity.this, "Selected: Zero", Toast.LENGTH_SHORT).show());
    }
}
