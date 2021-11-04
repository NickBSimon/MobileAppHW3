package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting");
        Button btnNavToSecond = (Button) findViewById(R.id.buttonToSecondScreen);
        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnNavToSecond.");

                Intent intent = new Intent(MainActivity.this, weather.class);
                startActivity(intent);
            }
        });

        Button btnNavToSixth = (Button) findViewById(R.id.buttonToSixthScreen);
        btnNavToSixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btnNavSixthScreen.");
                Intent intent = new Intent(MainActivity.this, dog.class);
                startActivity(intent);
            }
        });
    }
}