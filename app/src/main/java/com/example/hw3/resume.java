package com.example.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class resume extends AppCompatActivity {
    private static final String TAG = "resume";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resume);
        Log.d(TAG, "onCreate: Starting.");

        Button btnNavToFourth2 = (Button) findViewById(R.id.buttonToFourthScreen2);
        btnNavToFourth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFourth2 clicked.");
                Intent intent = new Intent(resume.this, invest.class);
                startActivity(intent);
            }
        });

        Button btnNavToSixth2 = (Button) findViewById(R.id.buttonToSixthScreen2);
        btnNavToSixth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToSixth2 clicked.");
                Intent intent = new Intent(resume.this, dog.class);
                startActivity(intent);
            }
        });
    }
}
