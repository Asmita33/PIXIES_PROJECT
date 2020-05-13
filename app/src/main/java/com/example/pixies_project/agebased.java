package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class agebased extends AppCompatActivity {

    EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agebased);




        startActivity(new Intent(getApplicationContext(),teenage.class));





        startActivity(new Intent(getApplicationContext(), midage.class));

        startActivity(new Intent(getApplicationContext(),elder.class));



        startActivity(new Intent(getApplicationContext(),old.class));

    }
}
