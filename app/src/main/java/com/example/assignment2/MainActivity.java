package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView appTitle = findViewById(R.id.app_title);
        TextView appDescription = findViewById(R.id.app_description);
        TextView companyName = findViewById(R.id.company_name);
        TextView companyWebsite = findViewById(R.id.company_website);
        TextView contactEmail = findViewById(R.id.contact_email);
        TextView versionName = findViewById(R.id.version_name);
        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
    }



}