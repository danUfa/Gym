package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class hello5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello5);
    }
    public void Voitenko(View view) {
        view.setBackgroundColor(Color.parseColor("#E3DFBC"));
        Intent sign = new Intent(hello5.this, hello6.class);
        startActivity(sign);
    }
}