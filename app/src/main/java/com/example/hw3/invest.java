package com.example.hw3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class invest extends AppCompatActivity {
    private static final String TAG = "invest";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invest);
        Log.d(TAG, "onCreate: Starting.");

        Button btnNavToThird2 = (Button) findViewById(R.id.buttonToThirdScreen2);
        btnNavToThird2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToThird2 clicked.");
                Intent intent = new Intent(invest.this, facts.class);
                startActivity(intent);
            }
        });

        Button btnNavToFifth = (Button) findViewById(R.id.buttonToFifthScreen);
        btnNavToFifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFifth clicked.");
                Intent intent = new Intent(invest.this, resume.class);
                startActivity(intent);
            }
        });
    }
}
