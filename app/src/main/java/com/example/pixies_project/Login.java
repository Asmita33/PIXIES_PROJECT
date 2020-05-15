package com.example.pixies_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText email, password;
    Button login, register;
    FirebaseAuth fauth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        fauth = FirebaseAuth.getInstance();
        login = findViewById(R.id.login);
        register = findViewById(R.id.reg);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String memail = email.getText().toString().trim();
                String mpassword = password.getText().toString().trim();
                if (TextUtils.isEmpty(memail)) {
                    email.setError("email is required");
                    return;
                }
                if (TextUtils.isEmpty(mpassword)) {
                    password.setError("password is required");
                    return;

                }
                if (mpassword.length() < 6) {
                    password.setError("password must have more than 6 digits");
                    return;

                }

                fauth.signInWithEmailAndPassword(memail, mpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())  {
                            Toast.makeText(Login.this, "login succesful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), activity2.class));
                        } else {
                            Toast.makeText(Login.this, "error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Register.class));


            }
        });
    }
}