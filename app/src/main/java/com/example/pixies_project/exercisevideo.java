package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

//for providing links to exercise videos
public class exercisevideo extends AppCompatActivity {
    Button bv1,bv2,bv3,iv1,iv2,iv3,e1,e2,e3,e4,e5,yt,back;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercisevideo);
        bv1=findViewById(R.id.bv1);
        back=findViewById(R.id.back1);
        bv2=findViewById(R.id.bv2);
        bv3=findViewById(R.id.bv3);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);
        wv=findViewById(R.id.wv);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        e5=findViewById(R.id.e5);
        yt=findViewById(R.id.yt);
        bv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/9jAyRP0bqKA");

            }
        });
        bv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/UItWltVZZmE");
            }
        });
        bv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/gC_L9qAHVJ8");
            }
        });
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/GauW8uJtvFs");
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/UBMk30rjy0o");
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/n5t0FaYkKLs");
            }
        });
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/VkBxPdqczzo");
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/PG2f3GF5RlI");
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/3TD19XA6Wmo");
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/cnKZit6VB44");
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl("https://youtu.be/lbdWgnnkJX0");
            }
        });

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(exercisevideo.this,Speech.class);
                startActivity(i);
                finish();
            }
        });
    }
}
