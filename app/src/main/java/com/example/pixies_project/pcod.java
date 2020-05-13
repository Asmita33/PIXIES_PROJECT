package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pcod extends AppCompatActivity {

    Button okm2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcod);

        okm2= findViewById(R.id.okbtn2) ;





        okm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
        });




    }
}
