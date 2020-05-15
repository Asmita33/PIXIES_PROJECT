package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class diabetes extends AppCompatActivity {

    Button okm4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);



        okm4= findViewById(R.id.okbtn4) ;





        okm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
        });



    }
}
