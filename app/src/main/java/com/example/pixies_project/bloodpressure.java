package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bloodpressure extends AppCompatActivity {
    Button okm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodpressure);


        okm3= findViewById(R.id.okbtn3) ;





        okm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
        });



    }
}
