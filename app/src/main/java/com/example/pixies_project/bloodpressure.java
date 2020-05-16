package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bloodpressure extends AppCompatActivity {
    Button okm3 , sym1;
    EditText highm,lowm;
    TextView result,result2;
    String message ;
    String message2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodpressure);
        okm3= findViewById(R.id.okbtn3) ;
        sym1 = findViewById(R.id.symtombpbtn) ;
        highm= findViewById(R.id.higherev) ;
        lowm= findViewById(R.id.lowerev) ;
        result = findViewById(R.id.bpresult);
        result2 = findViewById(R.id.bplresult);


        okm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(highm.getText().toString());
                double y = Double.parseDouble(lowm.getText().toString());


                checkbp(x);
                checklbp(y);
                result.setText(message);
                result2.setText(message2);





            }

            void checkbp(double a)
            {
                if(a<=100)
                    message=" very low diastolic BP";
                else if (a<=110)
                    message="low diastolic BP";
                else if(a<120)
                    message="ideal diastolic BP";

                else if(a<=140)
                    message="pre-high diastolic BP";
                else
                    message="high diastolic BP";
            }

            void checklbp(double b){

                if(b<=60)
                    message2 =" very low systolic BP";
                else if(b<70)
                    message2 ="low systolic BP";

                else if(b<=80)
                    message2 ="ideal systolic BP";
                else if(b<90)
                    message2="pre-high systolic BP";
                else
                    message2 ="high systolic BP";

            }
        });
        sym1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),bpsymtom.class));

            }

            });









    }






}
