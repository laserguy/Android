package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText FirstName;
    private EditText LastName;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstName = findViewById(R.id.first_name_edit);
        LastName = findViewById(R.id.last_name_edit);
        button = findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello " + FirstName.getText().toString()
                        + " " + LastName.getText().toString() + "!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,GreetingActivity.class);
                intent.putExtra("FIRST NAME", FirstName.getText().toString());
                intent.putExtra("LAST NAME", LastName.getText().toString());
                startActivity(intent);
            }
        });
    }
}