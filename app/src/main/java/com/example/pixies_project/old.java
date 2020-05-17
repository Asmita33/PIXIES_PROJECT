package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class old extends AppCompatActivity {


    Button bpm, diabetesm, bonem , calciumm ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);

        bpm = findViewById(R.id.bpbtn);
        diabetesm = findViewById(R.id.diabetesbtn);
        calciumm = findViewById(R.id.calciumbtn);
        bonem= findViewById(R.id.bonebtn);

        //taking the user to different categories according to input
        bpm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bloodpressure.class));


            }
        });

        diabetesm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), diabetes.class));
            }
        });
        calciumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),calcium.class));


            }
        });
        bonem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bonecheck.class));


            }
        });



    }
}
