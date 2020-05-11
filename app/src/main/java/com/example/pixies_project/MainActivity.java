package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText password;
    private TextView attempts;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.edtname);
        password = (EditText)findViewById(R.id.edtpassword);
        attempts = (TextView)findViewById(R.id.tvattempt);
        login = (Button)findViewById(R.id.btnlogin);





    }

    private void validate(String username,String password)
    {
        if (username == "pixies" && password=="1234")
        {
            Intent intent = new Intent(MainActivity.this,activity2.class);

        }
    }
}
