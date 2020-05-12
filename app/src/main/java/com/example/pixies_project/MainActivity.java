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
<<<<<<< HEAD

=======
     EditText userName;
     EditText userAge;
     Button submit;
>>>>>>> 9bf98776d3ab7ec4d4ae30c635adde80edb2c3de


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
=======
        userName = findViewById(R.id.edtname);
        userAge = findViewById(R.id.age);

        submit=findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = userName.getText().toString();
                String age = userAge.getText().toString();

                if (name.isEmpty() || age.isEmpty())
          Toast.makeText(MainActivity.this, "Enter details first", Toast.LENGTH_SHORT).show();
         else
          openActivity2();
         }


         });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);

    }
}


>>>>>>> 9bf98776d3ab7ec4d4ae30c635adde80edb2c3de





