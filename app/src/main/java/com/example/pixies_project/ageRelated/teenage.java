package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 * class that displays information related to pcod
 * suggests user to take pcod test
 */
public class teenage extends AppCompatActivity {
    Button pcod;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teenage);
        setContentView(R.layout.activity_teenage);
        pcod = findViewById(R.id.pcodbtn);
        message=findViewById(R.id.msg);
        //giving information about pcod
        message.setText("Polycystic Ovarian Disease (PCOD), also known as Polycystic Ovary syndrome (PCOS) is a very" +
                " common condition affecting 5% to 10% of women in the age group 12–45 years. " +
                "It is a problem in which a woman’s hormones are out of balance. It can cause problems with menstrual periods and make it difficult for her to conceive. " +
                "The principal features include no ovulation, irregular periods, acne and hirsuitism. " +
                "If not treated it can cause insulin resistant diabetes, obesity and high cholesterol leading to heart disease.");


        /**
         * to set on click method for pcod button
         */

        pcod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), com.example.pixies_project.ageRelated.pcod.class));


            }
        });


    }
}
