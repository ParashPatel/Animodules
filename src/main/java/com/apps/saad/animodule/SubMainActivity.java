package com.apps.saad.animodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.VideoView;
//Create by Saad Anwar 7/1/2017
public class SubMainActivity extends AppCompatActivity {
    Button create;
    ImageButton alligator,butterfly,cougar,elephantcolored;
    ImageView mainImg;
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);
        next();
        flipImages();

    }
    private void next(){
        create = (Button) findViewById(R.id.create_animodule);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SubMainActivity.this,EarDesignActivity.class);
                startActivity(myIntent);
            }
        });
    }
    private void flipImages(){
        alligator = (ImageButton) findViewById(R.id.alligator);
        butterfly = (ImageButton) findViewById(R.id.butterfly);
        cougar = (ImageButton) findViewById(R.id.cougar);
        elephantcolored = (ImageButton) findViewById(R.id.elephantcolored);
        mainImg = (ImageView) findViewById(R.id.mainImage);

        alligator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainImg.setImageResource(R.drawable.alligatorcolored);
            }
        });
        butterfly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainImg.setImageResource(R.drawable.butterflycolored);
            }
        });
        cougar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainImg.setImageResource(R.drawable.cougarcolored);
            }
        });

        elephantcolored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainImg.setImageResource(R.drawable.elephantcolored);
            }
        });
    }
}
