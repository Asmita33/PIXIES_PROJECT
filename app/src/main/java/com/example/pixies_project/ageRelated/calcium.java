package com.example.pixies_project.ageRelated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.pixies_project.R;

/**
 * class for breast cancer diagnosis
 */
public class calcium extends AppCompatActivity {


    Button okButton;
    CheckBox acne;
    CheckBox periods;
    CheckBox face;
    TextView showResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcium);

        okButton= findViewById(R.id.okbtn2) ;
        acne=findViewById(R.id.checkBox1);
        face=findViewById(R.id.checkBox2);
        periods=findViewById(R.id.checkBox3);
        showResult=findViewById(R.id.resultpcod);


        /**
         *to set on click method for ok button and then set message to the text view according to
         * different conditions
         */
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(acne.isChecked() && face.isChecked()&& periods.isChecked()) {
                    showResult.setText("high chances of breast cancer visit nearest gynaecologist");
                }
                else if (face.isChecked()&& periods.isChecked()) {
                    showResult.setText("you might have breast cancer ,consult gyno");
                }
                else if (acne.isChecked()&& periods.isChecked()) {
                    showResult.setText("you might have breast cancer ,consult gyno");
                }
                else if (face.isChecked()&& acne.isChecked()) {
                    showResult.setText("you might have breast cancer ,consult gyno");
                }
                else if (periods.isChecked()) {
                    showResult.setText("slight chances of breast cancer,still consult gyno");
                }

                else if (acne.isChecked()) {
                    showResult.setText("slight chances of breast cancer,still consult gyno");
                }
                else if (face.isChecked()) {
                    showResult.setText("slight chances of breast cancer,still consult gyno");
                }
                else
                {
                    showResult.setText("very low chances of diabetes");

                }


            }
        });




    }
}






