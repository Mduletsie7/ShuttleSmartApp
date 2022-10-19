package com.example.shuttlesmartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShuttleSchedules = findViewById(R.id.btnShuttleSchedules);
        Button btnDriverProfiles = findViewById(R.id.btnDriverProfiles);
        Button btnLogout = findViewById(R.id.btnLogout);
        Button btnUserFeedback = findViewById(R.id.btnUserFeedback);

        btnShuttleSchedules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShuttleSchedules();
            }
        });

        btnDriverProfiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDriverProfiles();
            }
        });

        btnUserFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDriverProfiles();
            }
        });

        btnUserFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserFeedback();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Farewell & Safe travels!", Toast.LENGTH_LONG).show();
                System.exit(0);
            }
        });
    }

    public void openShuttleSchedules() {
        Intent intent = new Intent(this, ShuttleSchedules.class);
        startActivity(intent);
    }

    public void openDriverProfiles() {
        Intent intent = new Intent(this, DriversProfiles.class);
        startActivity(intent);
    }

    public void openUserFeedback() {
        Intent intent = new Intent(this, UserFeedback.class);
        startActivity(intent);
    }
}