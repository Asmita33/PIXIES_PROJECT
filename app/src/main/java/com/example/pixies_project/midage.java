package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class midage extends AppCompatActivity {

    Button calciumm;
    TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midage);

        calciumm = findViewById(R.id.calciumbtn);
        tt=findViewById(R.id.textView18);

        tt.setText("Breast cancer is cancer that forms in the cells of the breasts.Doctors know that breast cancer occurs when some breast cells begin to grow abnormally. These cells divide more rapidly than healthy cells do and continue to accumulate, forming a lump or mass." +
                " Cells may spread (metastasize) through your breast to your lymph nodes or to other parts of your body.It is advised to do self examination to check the its possibilities. ");
        calciumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),calcium.class));


            }
        });



    }
}
