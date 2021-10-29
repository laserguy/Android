package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    private TextView greetingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        greetingText = findViewById(R.id.greeting_text);

        String firstname = getIntent().getStringExtra("FIRST NAME");
        String lastname = getIntent().getStringExtra("LAST NAME");

        greetingText.setText("Hello " + firstname + " " + lastname);
    }
}