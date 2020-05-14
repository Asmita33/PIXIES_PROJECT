package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class music extends AppCompatActivity {
    Button play,pause,back;
    MediaPlayer mp;
    ImageView i1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        play=findViewById(R.id.button5);
        pause=findViewById(R.id.button6);
        back=findViewById(R.id.button4);
        mp=MediaPlayer.create(this,R.raw.m);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(music.this,meditation.class);
                startActivity(i);
                finish();
            }
        });
    }
}
