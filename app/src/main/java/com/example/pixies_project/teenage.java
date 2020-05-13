package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teenage extends AppCompatActivity {



    Button pcodm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenage);

        setContentView(R.layout.activity_teenage);
        pcodm = findViewById(R.id.calciumbtn);
        pcodm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),pcod.class));


            }
        });


    }
}
