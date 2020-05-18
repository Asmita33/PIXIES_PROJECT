package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pixies_project.R;

/**
 * class that enables user to take several tests according to the age group in which he/she falls
 */

public class agebased extends AppCompatActivity {

    EditText getUserAge;
    Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agebased);

        getUserAge = (EditText) findViewById(R.id.enterage);
        ok = findViewById(R.id.okbtn);

        /**
         * adding functionality to ok button
         */
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int x = Integer.parseInt(getUserAge.getText().toString());

                //division of activities depending upon user's age
                if (x>=10 && x<=30) {

                    startActivity(new Intent(getApplicationContext(), teenage.class));
                }
                else if (x>30 && x<=40) {

                    startActivity(new Intent(getApplicationContext(), midage.class));
                }
                else if (x>40 && x<=65) {
                    startActivity(new Intent(getApplicationContext(), elder.class));
                }
                else if (x>65) {


                    startActivity(new Intent(getApplicationContext(), old.class));

                }



            }
        });





    }
}
