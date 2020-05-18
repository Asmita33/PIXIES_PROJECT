package com.example.pixies_project.relaxation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.R;

/**
 * class that takes user to respective exercise class
 * based on user input
 */
public class Speech extends AppCompatActivity {
Button b1,b2,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);

        b1=findViewById(R.id.v1);
        b2=findViewById(R.id.v2);
        b4=findViewById(R.id.back);
;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Speech.this, exercisevideo.class);
                startActivity(i);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Speech.this, insvideo.class);
                startActivity(i);
                finish();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Speech.this, meditation.class);
                startActivity(i);
                finish();
            }
        });


    }
}
