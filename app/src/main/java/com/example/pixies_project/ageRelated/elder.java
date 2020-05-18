package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.R;
import com.example.pixies_project.ageRelated.bloodpressure;
import com.example.pixies_project.ageRelated.calcium;
import com.example.pixies_project.ageRelated.diabetes;

/**
 * class that takes the user to different test activites based on input
 */
public class elder extends AppCompatActivity {


    Button bpMeasure, diabetesMeasure, calciumMeasure;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elder);


        bpMeasure = findViewById(R.id.bpbtn);
        diabetesMeasure = findViewById(R.id.diabetesbtn);
        calciumMeasure = findViewById(R.id.calciumbtn);

        /**
         * to take user to blood pressure check up activity if he/she clicks on this button
         */
        bpMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), bloodpressure.class));


            }
        });



        /**
         * to take user to diabetes check up activity if he/she clicks on this button
         */
        diabetesMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), diabetes.class));
            }
        });

        /**
         * to take user to calcium check up activity if he/she clicks on this button
         */
        calciumMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), calcium.class));


            }
        });

    }
}
