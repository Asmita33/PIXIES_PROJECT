package com.example.pixies_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class camera extends AppCompatActivity {
    Button b1,b2;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        b1 = findViewById(R.id.button7);
        b2 = findViewById(R.id.button8);
        i1 = findViewById(R.id.imageView4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(camera.this, meditation.class);
                startActivity(j);
                finish();
            }
        });
    }
     @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
        {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bm=(Bitmap)data.getExtras().get("data");
        i1.setImageBitmap(bm);
        }

}
