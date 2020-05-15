package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meditation extends AppCompatActivity {
    Button music,camera,speech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        music=findViewById(R.id.click);
        camera=findViewById(R.id.button2);
        speech=findViewById(R.id.button3);


        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this,music.class);
                startActivity(i);
                finish();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this,camera.class);
                startActivity(i);
                finish();
            }
        });
        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this,Speech.class);
                startActivity(i);
                finish();
            }
        });

    }
}
