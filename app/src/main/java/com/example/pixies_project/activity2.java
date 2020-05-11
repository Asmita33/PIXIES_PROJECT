package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {
    private Button bmi;
    private Button dentist;
    private Button other;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        bmi = findViewById(R.id.button);
        dentist = findViewById(R.id.button2);
        other = findViewById(R.id.button3);


    }
}

