package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class hello3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello3);
    }
    public void next(View view) {
        view.setBackgroundColor(Color.parseColor("#E3DFBC"));
        Intent sign = new Intent(hello3.this, hello4.class);
        startActivity(sign);
    }
}