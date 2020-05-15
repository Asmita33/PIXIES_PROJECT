package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class agebased extends AppCompatActivity {

    EditText agem;
    Button okm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agebased);

        agem = (EditText) findViewById(R.id.enterage);
        okm = findViewById(R.id.okbtn);



        okm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int x = Integer.parseInt(agem.getText().toString());


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
