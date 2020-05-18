package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
/**
 * class for calculating Bmi
 */
public class bmi extends AppCompatActivity {
     EditText userHeight;
     EditText userWeight;
     Button bmiCalculate;
     TextView result;
    double bmi;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        userHeight=findViewById(R.id.height);
        userWeight=findViewById(R.id.weight);
        result=findViewById(R.id.bmiresult);
        bmiCalculate=findViewById(R.id.bmiCalculate);

        /**
         * to give functionality to bmiCalculate button
         */
        bmiCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h=Double.parseDouble(userHeight.getText().toString());
                double w=Double.parseDouble(userWeight.getText().toString());

                 bmi= w /(h *h);
                 checkBmi(bmi);
                 result.setText(message);//to set message in the textView



            }


            /**
             *to check in which range the bmi falls and hence,set the respective message
             */
            void checkBmi(double a)
            {
                if(bmi<18.5)
                message="UNDERWEIGHT";

                else if(bmi>18.5 && bmi<24.9)
                    message="NORMAL";
                else
                    message="OVERWEIGHT";
            }
        });


    }






}
