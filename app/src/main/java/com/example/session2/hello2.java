package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class hello2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
    }

    public void SignUp(View view) {
        view.setBackgroundColor(Color.parseColor("#E3DFBC"));
    }
    public void SignUps(View view) {
        Intent sign = new Intent(hello2.this, hello3.class);
        startActivity(sign);
    }
    public void video (View view){
        Intent sign = new Intent(this, video.class);
        startActivity(sign);
    }
}