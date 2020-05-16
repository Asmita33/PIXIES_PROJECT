package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class bpsymtom extends AppCompatActivity {

        Button okm2;
        CheckBox acne;
        CheckBox periods;
        CheckBox face;
        TextView res;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bpsymtom);

            okm2= findViewById(R.id.okbtn2) ;
            acne=findViewById(R.id.checkBox1);
            face=findViewById(R.id.checkBox2);
            periods=findViewById(R.id.checkBox3);
            res=findViewById(R.id.resultpcod);

            okm2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                        res.setText("high chances of increased BP");
                    }
                    else if (face.isChecked()&& periods.isChecked()) {
                        res.setText("medium chances of high BP");
                    }
                    else if (acne.isChecked()&& periods.isChecked()) {
                        res.setText("medium chances of high BP");
                    }
                    else if (face.isChecked()&& acne.isChecked()) {
                        res.setText("medium chances of high BP");
                    }
                    else if (periods.isChecked()) {
                        res.setText("low chance of high BP");
                    }

                    else if (acne.isChecked()) {
                        res.setText("low chance of high BP");
                    }
                    else if (face.isChecked()) {
                        res.setText("low chance of high BP");
                    }
                    else
                    {
                        res.setText("you dont have symtoms of high BP");

                    }







                }
            });




        }
    }

