package com.example.app4sonidos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class botonees extends AppCompatActivity {

    Button mireyna, elpepe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botonees);

        mireyna = findViewById(R.id.mireyna);
        elpepe = findViewById(R.id.elpepe);

        mireyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer1 = MediaPlayer.create(botonees.this, R.raw.mirayna);
                mediaPlayer1.start();
            }
        });

        elpepe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer2 = MediaPlayer.create(botonees.this, R.raw.elpepe);
                mediaPlayer2.start();
            }
        });
    }
}