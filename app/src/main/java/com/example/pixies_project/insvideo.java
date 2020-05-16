package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class insvideo extends AppCompatActivity {
    Button as1,as2,as3,as4,as5,as6,as7,as8,as9,yt1,back;
    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insvideo);
        back=findViewById(R.id.back2);
        as1=findViewById(R.id.as1);
        as2=findViewById(R.id.as2);
        as3=findViewById(R.id.as3);
        as4=findViewById(R.id.as4);
        yt1=findViewById(R.id.button4);
        as5=findViewById(R.id.as5);
        as6=findViewById(R.id.as6);
        as7=findViewById(R.id.as7);
        as8=findViewById(R.id.as8);
        as9=findViewById(R.id.as9);
        wv1=findViewById(R.id.wv1);
        as1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             wv1.loadUrl("https://youtu.be/TD884Dl-kLc");
            }
        });
        as2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/5CoKwpezDFE");
            }
        });
        as3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/zxY8LNglUTw");
            }
        });
        as4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/GBM2k2zp-MQ");
            }
        });
        as5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/7OwAeYLDysg");
            }
        });
        as6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/QhGvLnV5QSY");
            }
        });
        as7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/-5tNYkN2p7c");
            }
        });
        as8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/LkSgxuQrYwY");
            }
        });
        as9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv1.loadUrl("https://youtu.be/Tdp3AK9K13o");
            }
        });
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(insvideo.this,Speech.class);
                startActivity(i);
                finish();
            }
        });
    }
}
