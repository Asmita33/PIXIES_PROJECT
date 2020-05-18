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

import com.example.pixies_project.relaxation.Register;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * class for enabling user login
 */
public class Login extends AppCompatActivity {

    EditText email, password;
    Button login, register;
    FirebaseAuth firebaseAuthorisation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuthorisation=FirebaseAuth.getInstance();
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);
        register = findViewById(R.id.reg);

        /**
         * to set on click method for login button
         */
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail = email.getText().toString().trim();
                String userPassword = password.getText().toString().trim();
                //to check whether Email id has been entered or not
                if (TextUtils.isEmpty(userEmail)) {
                    email.setError("email is required");
                    return;
                }

                //to check whether password has been entered or not
                if (TextUtils.isEmpty(userPassword)) {
                    password.setError("Password is required");
                    return;

                }

                //to check if the password contains 6 or more characters
                if (userPassword.length() < 6) {
                    password.setError("password must have more than 6 digits");
                    return;

                }

                firebaseAuthorisation.signInWithEmailAndPassword(userEmail,userPassword)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())  {
                            Toast.makeText(Login.this, "login successful",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), activity2.class));
                        }
                        else {
                            Toast.makeText(Login.this, "error" + task.getException()
                                    .getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });


        /**
         * to take the user to register class
         * if the user does not have an account
         */

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Register.class));


            }
        });
    }
}