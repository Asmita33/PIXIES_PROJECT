package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.relaxation.Register;

/**
 *the introductory class where user has to click on the register or login button
 * to start the app
 */
public class MainActivity extends AppCompatActivity {

     Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register=findViewById(R.id.reg);

        /**
         * to set on click method for register button taking user to the register class
         */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Register.class)) ;
            }
        });



}}








