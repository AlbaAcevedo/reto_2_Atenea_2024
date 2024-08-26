package com.example.ecoapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    private TextView confirmationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        confirmationTextView = findViewById(R.id.confirmation_text_view);
        displayConfirmation();
    }

    private void displayConfirmation() {
        SharedPreferences sharedPref = getSharedPreferences("UserPreferences", MODE_PRIVATE);
        String username = sharedPref.getString("username", "User");

        String confirmationMessage = "Registro exitoso para " + username + "!";
        confirmationTextView.setText(confirmationMessage);
    }
}
