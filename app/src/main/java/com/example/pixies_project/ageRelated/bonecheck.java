package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 * class for bone density screening
 */

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

        /**
         * to give functionality to submit button
         */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=year.getText().toString();
                Integer x=Integer.parseInt(i);
                Integer r = x+2; //as bone check should be done after every two years
                result.setText(Integer.toString(r));


            }
        });


    }
}
