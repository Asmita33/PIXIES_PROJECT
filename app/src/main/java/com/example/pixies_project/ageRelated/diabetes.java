package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 *class for giving diabetes alert
 */

public class diabetes extends AppCompatActivity {

    Button submit;
    Button symptomChecker;
    EditText regularSugar,fastingSugar;
    TextView result,result2;
    String message ;
    String message2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
        submit= findViewById(R.id.okbtn4) ;
        symptomChecker= findViewById(R.id.symtombdn) ;
        regularSugar= findViewById(R.id.regularsugartv) ;
        fastingSugar= findViewById(R.id.fastingsugartv) ;
        result = findViewById(R.id.dresult);
        result2 = findViewById(R.id.d1result);

        /**
         * to set on click method for submit button
         */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double x = Double.parseDouble(regularSugar.getText().toString());
                double y = Double.parseDouble(fastingSugar.getText().toString());


                checkRegularSugar(y);
                checkFastingSugar(x);
                result.setText(message);
                result2.setText(message2);
            }


            /**
             * to check regular sugar level
             */
            void checkFastingSugar(double a)
            {
                if(a<=70)
                    message=" low sugar level";
                else if (a<=100)
                    message="normal";
                else if(a<125)
                    message="pre diabetic";

                else
                    message="diabetes";
            }

            /**
             * to check fasting sugar level
             */
            void checkRegularSugar(double b)
            {
                if(b<=100)
                    message2="low sugar";

                else if(b<=140)
                    message2 =" normal";
                else
                    message2 ="diabetes";
            }
        });

        /**
         * to take the user to the acitvity that diagnose diabetes on the basis of symptoms
         */
        symptomChecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), diabetessymtom.class));

            }

        });




    }
}
