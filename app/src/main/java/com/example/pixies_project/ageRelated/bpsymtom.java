package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 * class for checking blood pressure symptoms
 */
public class bpsymtom extends AppCompatActivity {

        Button okButton;
        CheckBox acne;
        CheckBox periods;
        CheckBox face;
        TextView showResult;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bpsymtom);

            okButton= findViewById(R.id.okbtn2) ;
            acne=findViewById(R.id.checkBox1);
            face=findViewById(R.id.checkBox2);
            periods=findViewById(R.id.checkBox3);
            showResult=findViewById(R.id.resultpcod);

            /**
             * to set on click method for ok button which displays the result of user input
             */
            okButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                        showResult.setText("high chances of increased BP");
                    }
                    else if (face.isChecked()&& periods.isChecked()) {
                        showResult.setText("medium chances of high BP");
                    }
                    else if (acne.isChecked()&& periods.isChecked()) {
                        showResult.setText("medium chances of high BP");
                    }
                    else if (face.isChecked()&& acne.isChecked()) {
                        showResult.setText("medium chances of high BP");
                    }
                    else if (periods.isChecked()) {
                        showResult.setText("low chance of high BP");
                    }

                    else if (acne.isChecked()) {
                        showResult.setText("low chance of high BP");
                    }
                    else if (face.isChecked()) {
                        showResult.setText("low chance of high BP");
                    }
                    else
                    {
                        showResult.setText("you don't have sypmtoms of high BP");

                    }

                }
            });




        }
    }

