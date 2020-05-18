package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.ageRelated.agebased;
import com.example.pixies_project.relaxation.exercise;
import com.example.pixies_project.relaxation.meditation;
import com.google.firebase.auth.FirebaseAuth;
/**
this class contains buttons that will take user to the respective check up that the user opts for
 */

public class activity2 extends AppCompatActivity {


    Button bmiCalculateActivity, ageBasedActivity, dentalActivity, meditationActivity ,exerciseActivity ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        bmiCalculateActivity = findViewById(R.id.bmibtn);
        dentalActivity= findViewById(R.id.dentalbtn) ;
        exerciseActivity= findViewById(R.id.exercisebtn) ;
        ageBasedActivity = findViewById(R.id.agebasedbtn);
        meditationActivity = findViewById(R.id.meditationbtn);

        /**
        function that takes the user to bmi calculator
         */
        bmiCalculateActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),bmi.class));


            }
        });


        /**
        *function that takes the user to age based activity
        */
        ageBasedActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), agebased.class));


            }
        });

        /**
        * function that takes user to exercise named activity
        */

        exerciseActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), exercise.class));


            }
        });

        /**
        * function to take the user to dental activity
        */
        dentalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dental.class));


            }
        });

        /**
        * function that takes the user to meditation activity
        */
        meditationActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), meditation.class));


            }
        });

    }

    /**
     * function that lets the user logout
     */
    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}

