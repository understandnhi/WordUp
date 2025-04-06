package com.example.wordupapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize the logout button
        TextView logoutButton = findViewById(R.id.logoutButton);



        // Set click listener for logout
        logoutButton.setOnClickListener(v -> {
            Toast.makeText(this, "Đăng xuất clicked", Toast.LENGTH_SHORT).show();
            // Add actual logout logic here (e.g., clear session, navigate to login screen)
        });
    }
}
