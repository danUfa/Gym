package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class hello4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello4);
    }

    public void SignU(View view) {
        view.setBackgroundColor(Color.parseColor("#E3DFBC"));
    }
    public void SignUpss(View view) {
        view.setBackgroundColor(Color.parseColor("#E3DFBC"));
        Intent sign = new Intent(hello4.this, hello5.class);
        startActivity(sign);
    }
}