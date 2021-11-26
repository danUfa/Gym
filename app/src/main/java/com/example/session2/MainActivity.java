package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread background = new Thread() {
            public void run() {

                try {

                    sleep(5*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(MainActivity.this, hello1.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };
        background.start();


    }
    @Override
    protected void onDestroy() {

        super.onDestroy();

    }

}