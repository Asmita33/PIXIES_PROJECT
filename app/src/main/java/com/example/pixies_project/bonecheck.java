package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bonecheck extends AppCompatActivity {
    Button submit;
    TextView result;
    EditText year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonecheck);

        submit=findViewById(R.id.submitb);
        result=findViewById(R.id.resb);
        year=findViewById(R.id.yearb);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=year.getText().toString();
                Integer x=Integer.parseInt(i);
                Integer r = x+2;
                result.setText(Integer.toString(r));


            }
        });


    }
}
