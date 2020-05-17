package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//class for giving diabetes alert
public class diabetes extends AppCompatActivity {

    Button okm4;
    Button sym2;
    EditText regularm,fastingm;
    TextView result,result2;
    String message ;
    String message2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
        okm4= findViewById(R.id.okbtn4) ;
        sym2= findViewById(R.id.symtombdn) ;
        regularm= findViewById(R.id.regularsugartv) ;
        fastingm= findViewById(R.id.fastingsugartv) ;
        result = findViewById(R.id.dresult);
        result2 = findViewById(R.id.d1result);

        okm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double x = Double.parseDouble(regularm.getText().toString());
                double y = Double.parseDouble(fastingm.getText().toString());


                checkbp(y);
                checklbp(x);
                result.setText(message);
                result2.setText(message2);





            }

            void checkbp(double a) // to check regular sugar level
            {
                if(a<=70)
                    message=" low sugar level";
                else if (a<=100)
                    message="normal";
                else if(a<125)
                    message="prediabetes";

                else
                    message="diabetes";
            }

            void checklbp(double b)  //to check fasting sugar level
            {
                if(b<=100)
                    message2="low sugar";

                else if(b<=140)
                    message2 =" normal";
                else
                    message2 ="diabetes";






            }
        });


        sym2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),diabetessymtom.class));

            }

        });




    }
}
