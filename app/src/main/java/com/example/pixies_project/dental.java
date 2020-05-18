package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *class for giving next due date for dental checkup
 */
public class dental extends AppCompatActivity {

    String getUserInput;
    String msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dental);

       final AutoCompleteTextView input = findViewById(R.id.input);
        ImageView downArrow =findViewById(R.id.arrow);
        Button submit = findViewById(R.id.click);
        final TextView result1 = findViewById(R.id.res);;



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, calender);
        input.setAdapter(adapter);

        //to show the list of months when downArrow button is clicked
        downArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.showDropDown();
            }
        });


        /**
         *to set on click method for submit button
         */
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUserInput = input.getText().toString();
                //to check the next due month for checkup
                check(getUserInput);
                result1.setText("Your next check up is due in "+msg);
            }

             /**
             * to set the next check up month
              * * * dental check up is taken after every 6 months
             */
             void check(String a) {
                if (a.equals("January")) {
                   msg = "July";
                }
                else if (a.equals("February")) {
                     msg ="August";
                }
                else if (a.equals("March")) {
                   msg = "September";
                }
                else if (a.equals("April")) {
                    msg =" October ";
                }
                else if (a.equals("May")) {
                    msg = " November ";
                }
                else if (a.equals("June")) {
                   msg=" December ";
                }
                else if (a.equals("July")) {
                    msg = " January ";
                }
                else if (a.equals("August")) {
                    msg =" February";
                }
                else if (a.equals("September")) {
                    msg = " March ";
                }
                else if (a.equals("October")) {
                   msg =" April ";
                }
                else if (a.equals("November")) {
                    msg = "May";
                }
                else if (a.equals("December")) {
                    msg =" June ";
                }
            }


        });


    }

    /**
     * string array consisting of all the months
     */
    private static final String[] calender= new String[]{"January","February","March","April",
            "May","June","July","August","September","October","November","December"};



}
