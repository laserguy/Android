package com.example.timerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView timertext;
    private Button timerbutton;
    private CountDownTimer timer;
    private EditText minutesedit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timertext = findViewById(R.id.timer_text);
        timerbutton = findViewById(R.id.timer_button);
        minutesedit = findViewById(R.id.minutes_edittext);

        timerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long millsFuture = 1000 * 60 * Integer.valueOf(minutesedit.getText().toString());

                if(timer != null){
                    timer.cancel();
                }

                timer = new CountDownTimer(millsFuture,1000) {
                    @Override
                    public void onTick(long l) {
                        long minutes = l/1000/60;
                        long seconds = (l/1000)%60;
                        timertext.setText(minutes+":"+seconds);
                    }

                    @Override
                    public void onFinish() {
                        timertext.setText("Take a break");
                    }
                };
                timer.start();
            }
        });
    }
}