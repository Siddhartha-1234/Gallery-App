package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenAct extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        imageView = (ImageView) findViewById(R.id.image_view);
//        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Image");

        Intent i=getIntent();
        int position = i.getExtras().getInt("id");
        imageAdapter ima = new imageAdapter((this));
        imageView.setImageResource(ima.imageArray[position]);
    }
}