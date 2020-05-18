package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pixies_project.R;

//class for checking pcod symptoms
public class pcod extends AppCompatActivity {

    Button submit;
    CheckBox acne;
    CheckBox periods;
    CheckBox face;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcod);

        submit= findViewById(R.id.okbtn2) ;
        acne=findViewById(R.id.checkBox1);
        face=findViewById(R.id.checkBox2);
        periods=findViewById(R.id.checkBox3);
        result=findViewById(R.id.resultpcod);


        /**
         * to add on click method to submit button
         * and to set respective text in text view according to user input
         */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                    result.setText("high chances of PCOD visit nearest gynaecologist");
                }
                else if (face.isChecked()&& periods.isChecked()) {
                    result.setText("you might have PCOD ,consult gyno");
                }
                else if (acne.isChecked()&& periods.isChecked()) {
                    result.setText("you might have PCOD ,consult gyno");
                }
                else if (face.isChecked()&& acne.isChecked()) {
                    result.setText("you might have PCOD ,consult gyno");
                }
                else if (periods.isChecked()) {
                    result.setText("low chance of PCOD irregular period is common in growing ages ," +
                            "still consult gyno");
                }

                else if (acne.isChecked()) {
                    result.setText("low chance of PCOD,hormonal changes result in acne,if excess ,visit gyno");
                }
                else if (face.isChecked()) {
                    result.setText("very slight chance of PCOD");
                }
                else
                {
                    result.setText("you don't have risk to PCOD as of now");

                }
            }
        });




    }
}
