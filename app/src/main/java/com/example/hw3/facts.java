package com.example.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class facts extends AppCompatActivity {
    private static final String TAG = "weather";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts);
        Log.d(TAG, "onCreate: Starting.");

        Button btnNavToSecond2 = (Button) findViewById(R.id.buttonToSecondScreen2);
        btnNavToSecond2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToSecond2 clicked.");
                Intent intent = new Intent(facts.this, weather.class);
                startActivity(intent);
            }
        });

        Button btnNavToFourth = (Button) findViewById(R.id.buttonToFourthScreen);
        btnNavToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFourth clicked.");
                Intent intent = new Intent(facts.this, invest.class);
                startActivity(intent);
            }
        });
    }
}
