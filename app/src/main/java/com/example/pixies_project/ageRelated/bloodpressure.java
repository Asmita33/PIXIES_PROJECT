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
 *class that enables user to take Blood pressure check-up by providing lower and higher blood
 * pressure rate as input
 */
public class bloodpressure extends AppCompatActivity {
    Button okButton , symptomsChecker;
    EditText highBloodPressureValue,lowBloodPressureValue;
    TextView diastolicResult,systolicResult;
    String message ;
    String message2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodpressure);
        okButton= findViewById(R.id.okbtn3) ;
        symptomsChecker = findViewById(R.id.symtombpbtn) ;
        highBloodPressureValue= findViewById(R.id.higherev) ;
        lowBloodPressureValue= findViewById(R.id.lowerev) ;
        diastolicResult = findViewById(R.id.bpresult);
        systolicResult = findViewById(R.id.bplresult);

        //to give functionality to ok button
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.parseDouble(highBloodPressureValue.getText().toString());
                double y = Double.parseDouble(lowBloodPressureValue.getText().toString());


                checkDiastolicBp(x);
                checkSystolicBp(y);
                diastolicResult.setText(message);
                systolicResult.setText(message2);
            }


            //function to check diastolic blood pressure range
            void checkDiastolicBp(double a)
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


            //function to check systolic blood pressure
            void checkSystolicBp(double b)
            {

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

        //to let the user check the blood pressure on the basis of symptoms
        symptomsChecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), bpsymtom.class));

            }

            });


    }






}
