package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Speech extends AppCompatActivity {
Button b1,b2,b3,b4;
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);

        b1=findViewById(R.id.v1);
        b2=findViewById(R.id.v2);
        b3=findViewById(R.id.v3);
        b4=findViewById(R.id.back);
        w=findViewById(R.id.w)
;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.loadUrl("https://youtu.be/fBnAMUkNM2k");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              w.loadUrl("https://youtu.be/6Rfn94k717U");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                w.loadUrl("https://youtu.be/3gqQevdM7xM");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Speech.this,meditation.class);
                startActivity(i);
                finish();
            }
        });


    }
}
