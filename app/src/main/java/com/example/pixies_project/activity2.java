package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class activity2 extends AppCompatActivity {


    Button bmim, agebasedm, dentalm, meditationm ,ecercisem ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        bmim = findViewById(R.id.bmibtn);
       dentalm= findViewById(R.id.dentalbtn) ;
        ecercisem= findViewById(R.id.exercisebtn) ;


        agebasedm = findViewById(R.id.agebasedbtn);
        meditationm = findViewById(R.id.meditationbtn);
        bmim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bmi.class));


            }
        });

        agebasedm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),agebased.class));


            }
        });
        ecercisem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),exercise.class));


            }
        });





        dentalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dental.class));


            }
        });
        meditationm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),meditation.class));


            }
        });




    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}

