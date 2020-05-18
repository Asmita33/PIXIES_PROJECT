package com.example.pixies_project.relaxation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pixies_project.Login;
import com.example.pixies_project.R;
import com.example.pixies_project.activity2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
/**
 * class that enables new users to login
 */

public class Register extends AppCompatActivity {

    EditText name,email,password;
    Button registration,login;
    FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        name = findViewById(R.id.name);
        email= findViewById(R.id.email);
        password= findViewById(R.id.password);
        registration=findViewById(R.id.reg);
        login=findViewById(R.id.login);
        firebaseAuth= FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), activity2.class));
            finish();
        }

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail = email.getText().toString().trim();
                String userPassword =password.getText().toString().trim();

                //to check if Email has been entered or not
                if(TextUtils.isEmpty(userEmail))
                {
                    email.setError("email is required");
                    return;
                }

                //to check if password has been entered or not
                if(TextUtils.isEmpty(userPassword)){
                    password.setError("password is required");
                    return;

                }

                //to check is password contains minimum 6 characters or not
                if(userPassword.length()<6){
                    password.setError("password must have more than 6 digits");
                    return;

                }


                /**
                 *to set email and password firebase authorization
                 */
                firebaseAuth.createUserWithEmailAndPassword(userEmail,userPassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Register.this, "user created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), activity2.class));
                        }
                        else {
                            Toast.makeText(Register.this, "error" + task.getException().getMessage()
                                    , Toast.LENGTH_SHORT).show();
                        }


                    }
                });

            }
        });

        /**
         * to take the user to login class if his/her account exists
         */
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));


            }
        });

    }
}


