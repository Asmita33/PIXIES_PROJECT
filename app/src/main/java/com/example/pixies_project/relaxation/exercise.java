package com.example.pixies_project.relaxation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pixies_project.R;

import java.util.Locale;

public class exercise extends AppCompatActivity {


    private  static  final long STARTS_TIME_IN_MILLIS = 600000;
    TextView countm;
    Button startpausem,resetm;
    CountDownTimer cdrm;
    boolean trm;
    long tlmm =STARTS_TIME_IN_MILLIS;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        countm = findViewById(R.id.startbtn);


        startpausem = findViewById(R.id.startbtn);
        resetm = findViewById(R.id.resetbtn);

        startpausem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (trm) {
                    pauseTimer();
                } else {
                    startTimer();
                }

            }
        });
        resetm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();

            }
        });

        updateCountDownText();
    }
    private void startTimer(){
        cdrm=new CountDownTimer(tlmm,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                tlmm = millisUntilFinished;
                updateCountDownText();

            }

            @Override
            public void onFinish() {

                trm= false;
                startpausem.setText("START");
                startpausem.setVisibility(View.INVISIBLE);
                resetm.setVisibility(View.VISIBLE);


            }
        }.start();
        trm = true;
        startpausem.setText("pause");
        resetm.setVisibility(View.INVISIBLE);


    }
    private void pauseTimer(){
        cdrm.cancel();
        trm= false;
        startpausem.setText("START");
        resetm.setVisibility(View.VISIBLE);
    }
    private void resetTimer(){
        tlmm = STARTS_TIME_IN_MILLIS;
        updateCountDownText();
        resetm.setVisibility(View.INVISIBLE);
        startpausem.setVisibility(View.VISIBLE);



    }
    private void updateCountDownText(){

        int minutes =(int)(tlmm/1000)/60;
        int seconds =(int)(tlmm/1000)%60;
        String tlf = String .format(Locale.getDefault(),"%02d:%02d" , minutes,seconds);
        countm.setText(tlf);



    }






}
