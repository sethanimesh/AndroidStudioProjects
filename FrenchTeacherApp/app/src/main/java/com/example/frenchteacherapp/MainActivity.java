package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button black;
    Button green;
    Button purple;
    Button red;
    Button yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        black = findViewById(R.id.black);
        green = findViewById(R.id.green);
        purple = findViewById(R.id.purple);
        red = findViewById(R.id.red);
        yellow = findViewById(R.id.yellow);

        black.setOnClickListener(this); //Refers to view on click listener to redirect to onclick
        green.setOnClickListener(this);
        purple.setOnClickListener(this);
        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickedBtnid = v.getId();
        
        if (clickedBtnid == R.id.black){
            PlaySounds(R.raw.black);
        } else if (clickedBtnid == R.id.green){
            PlaySounds(R.raw.green);
        } else if (clickedBtnid == R.id.purple){
            PlaySounds(R.raw.purple);
        } else if (clickedBtnid == R.id.red){
            PlaySounds(R.raw.red);
        } else if (clickedBtnid == R.id.yellow){
            PlaySounds(R.raw.yellow);
        }
    }

    public void PlaySounds(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}