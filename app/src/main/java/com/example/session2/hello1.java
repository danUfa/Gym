package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;


public class hello1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello1);

    }

    public void SignUpClick(View view) {
        Intent sign = new Intent(hello1.this, hello7.class);
        startActivity(sign);
    }
}
