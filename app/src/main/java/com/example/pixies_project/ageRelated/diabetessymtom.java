package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 * class to diagnose diabetes on the basis of symptoms
 */
public class diabetessymtom extends AppCompatActivity {
    Button submit;
    CheckBox acne;
    CheckBox periods;
    CheckBox face;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetessymtom);

        submit= findViewById(R.id.okbtn2) ;
        acne=findViewById(R.id.checkBox1);
        face=findViewById(R.id.checkBox2);
        periods=findViewById(R.id.checkBox3);
        res=findViewById(R.id.resultpcod);

        /**
         * to set on click method for submit metthod and set etxt in the text view base on different
         * conditions
       */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                    res.setText("high chances of diabetes");
                }
                else if (face.isChecked()&& periods.isChecked()) {
                    res.setText("medium chances of diabetes");
                }
                else if (acne.isChecked()&& periods.isChecked()) {
                    res.setText("medium chances of diabetes");
                }
                else if (face.isChecked()&& acne.isChecked()) {
                    res.setText("medium chances of diabetes");
                }
                else if (periods.isChecked()) {
                    res.setText("low chance of diabetes");
                }

                else if (acne.isChecked()) {
                    res.setText("low chances of diabetes");
                }
                else if (face.isChecked()) {
                    res.setText("low chances of diabetes");
                }
                else
                {
                    res.setText("you don't have symptoms of diabetes");

                }

            }
        });

    }
}







