package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button button;
    public void start1(View view){
        int time = Integer.parseInt(text.getText().toString());
        Log.d("Hi", "start1: " + time);
        new CountDownTimer(time*1000,1000){
            public void onTick(long millisecondsUntilDone){
                Log.d("Running : ", "onTick: "+String.valueOf((int)millisecondsUntilDone/1000));
                text.setText(String.valueOf((int)millisecondsUntilDone/1000));
            }
            public  void onFinish(){
                Log.d("Ended : ", "onFinish: Finished");
                Toast.makeText(MainActivity.this,"Time Finished...",Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        button = findViewById(R.id.button);
    }
}
