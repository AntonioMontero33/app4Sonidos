package com.example.app4sonidos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio = findViewById(R.id.button);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LlamarAudio();
            }
        });
    }

    private void LlamarAudio()
    {
        Intent intent = new Intent(MainActivity.this, botonees.class);
        startActivity(intent);
    }
}