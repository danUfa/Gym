package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Legs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
    }
    public void Voitenko(View view) {
        Intent sign = new Intent(Legs.this, lessons.class);
        startActivity(sign);
    }


    public void Voitenko4 (View view) {
        Intent sign = new Intent(Legs.this, hello7.class);
        startActivity(sign);
    }
}