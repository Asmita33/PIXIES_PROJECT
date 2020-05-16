package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class meditation extends AppCompatActivity {
    Button music,camera,speech,back,fb,whp,inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        music=findViewById(R.id.click);
        camera=findViewById(R.id.button2);
        speech=findViewById(R.id.button3);
        back=findViewById(R.id.button);
        fb=findViewById(R.id.fb);
        inst=findViewById(R.id.inst);
        whp=findViewById(R.id.whp);

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.jio.media.jiobeats");
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
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this,activity2.class);
                startActivity(i);
                finish();
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
                startActivity(i);
            }
        });
        whp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);

            }
        });
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(i);
            }
        });
    }
}
