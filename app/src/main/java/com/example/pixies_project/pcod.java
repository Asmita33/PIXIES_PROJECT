package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class pcod extends AppCompatActivity {

    Button okm2;
    CheckBox acne;
    CheckBox periods;
    CheckBox face;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcod);

        okm2= findViewById(R.id.okbtn2) ;
        acne=findViewById(R.id.checkBox1);
        face=findViewById(R.id.checkBox2);
        periods=findViewById(R.id.checkBox3);
        res=findViewById(R.id.resultpcod);

        okm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                    res.setText("high chances of PCOD visit nearest gynecologist");
                }
                else if (face.isChecked()&& periods.isChecked()) {
                    res.setText("you might have PCOD ,consult gyno");
                }
                else if (acne.isChecked()&& periods.isChecked()) {
                    res.setText("you might have PCOD ,consult gyno");
                }
                else if (face.isChecked()&& acne.isChecked()) {
                    res.setText("you might have PCOD ,consult gyno");
                }
                else if (periods.isChecked()) {
                    res.setText("low chance of PCOD irregular period is common in growing ages ,still consult gyno");
                }

                else if (acne.isChecked()) {
                    res.setText(";ow chance of PCOD,hormonal changes result in acne,if excess ,visit gyno");
                }
                else if (face.isChecked()) {
                    res.setText("very slight chance of PCOD");
                }
                else
                {
                    res.setText("you dont have risk to PCOD as of now");

                }







            }
        });




    }
}
