package com.example.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class dog extends AppCompatActivity {
    private static final String TAG = "dog";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dog);
        Log.d(TAG, "onCreate: Starting.");

        Button btnNavToFifth2 = (Button) findViewById(R.id.buttonToFifthScreen2);
        btnNavToFifth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFifth2 clicked.");
                Intent intent = new Intent(dog.this, resume.class);
                startActivity(intent);
            }
        });

        Button btnNavToFirst2 = (Button) findViewById(R.id.buttonToFirstScreen2);
        btnNavToFirst2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFirst2 clicked.");
                Intent intent = new Intent(dog.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
