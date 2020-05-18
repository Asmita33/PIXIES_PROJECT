package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.R;
import com.example.pixies_project.ageRelated.bloodpressure;
import com.example.pixies_project.ageRelated.bonecheck;
import com.example.pixies_project.ageRelated.calcium;
import com.example.pixies_project.ageRelated.diabetes;

/**
 * class that displays several buttons
 * which when clicked takes user to that respective check up activity
 */
public class old extends AppCompatActivity {


    Button bpMeasure, diabetesMeasure, boneDensityMeasure , calciumMeasure ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old);

        bpMeasure = findViewById(R.id.bpbtn);
        diabetesMeasure = findViewById(R.id.diabetesbtn);
        calciumMeasure = findViewById(R.id.calciumbtn);
        boneDensityMeasure= findViewById(R.id.bonebtn);

        //taking the user to different categories according to input
        bpMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), bloodpressure.class));


            }
        });

        diabetesMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), diabetes.class));
            }
        });
        calciumMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), calcium.class));


            }
        });
        boneDensityMeasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), bonecheck.class));


            }
        });



    }
}
