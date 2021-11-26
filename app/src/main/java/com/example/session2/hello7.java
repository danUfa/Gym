package com.example.session2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.TextView;
import android.view.View;
import android.content.DialogInterface;
import android.widget.VideoView;

public class hello7 extends AppCompatActivity {

    TextView textView11;
    TextView textView22;
    TextView textView28;
    Typeface tf;
    int mCurrentPeriod = 0;
    private Timer myTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello7);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView11.setTypeface(tf);

        textView22 = (TextView) findViewById(R.id.textView22);
        textView22.setText(Push_aps.button_number);

        VideoView videoPlayer;
        videoPlayer = findViewById(R.id.videoView);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.videva);
        videoPlayer.setVideoURI(myVideoUri);
        videoPlayer.start();
    }

    public void onStartButtonClick(View v) {

        if (myTimer == null) {
            myTimer = new Timer();
            myTimer.schedule(new TimerTask() {
                public void run() {
                    TextView TextMinute = findViewById(R.id.textView26);
                    int Minutes = Integer.parseInt(TextMinute.getText().toString());
                    TextMinute.setText(Integer.toString(Minutes + 1));
                    textView22 = findViewById(R.id.textView22);
                    int Score = Integer.parseInt(textView22.getText().toString());
                    textView28 = findViewById(R.id.textView28);
                    textView28.setText(Integer.toString(Minutes / Score));
                }

                ;
            }, 0, 1000);
        }

        textView22 = (TextView) findViewById(R.id.textView22);
        int ScoreInt = Integer.parseInt(textView22.getText().toString());
        if (ScoreInt != 0) {
            textView22.setText(Integer.toString(ScoreInt-1));
            if (ScoreInt > 0) {
                TextView TextMinute = findViewById(R.id.textView26);
                int Minutes = Integer.parseInt(TextMinute.getText().toString());
                textView28 = findViewById(R.id.textView28);
                textView28.setText(Integer.toString(Minutes / ScoreInt));
            }
        }
    };

    public void onPauseButtonClick(View v) {
        if (myTimer != null) {
            myTimer.cancel();
            myTimer = null;

            SQLiteDatabase db = getBaseContext().openOrCreateDatabase("DATA_BASE", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS buttons(id INTEGER primary key)");

            try {
                db.execSQL("INSERT INTO buttons(id) VALUES (" + Integer.toString(Push_aps.button_id) + ")");
            } catch(SQLException e) {
            }

        }
    };



    public void MenuClick(View v) {
        Intent i = new Intent(hello7.this, hello8.class);
        startActivity(i);
    };

    public void UserClick(View v) {

    };

    public void ReportsClick(View v) {

    };

    public void LessonsClick(View v) {
        Intent i = new Intent(this, lessons.class);
        startActivity(i);
    };


    private Runnable Timer_Tick = new Runnable() {
        public void run() {
            mCurrentPeriod++;
            String temp = (new SimpleDateFormat("mm:ss")).format(new Date(
                    mCurrentPeriod * 1000));
            textView11.setText(temp);


        }
    };

    public void onClick(View view) {
    }
}