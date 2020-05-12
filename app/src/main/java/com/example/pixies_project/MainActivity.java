package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText userName;
    private EditText userAge;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.edtname);
        userAge = findViewById(R.id.age);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = userName.getText().toString();
                String age = userAge.getText().toString();

                if (name.isEmpty() || age.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter details first", Toast.LENGTH_SHORT).show();
                // else
                //        Intent intent = new Intent(getApplicationContext(), activity2.class);
                //        intent.startActivity();

            }


        });


    }

}



    }

}
