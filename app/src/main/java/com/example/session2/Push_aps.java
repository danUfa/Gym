package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Push_aps extends AppCompatActivity {
    public static String button_number;
    public static int button_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_aps);
        int Button = 0;
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("DATA_BASE", MODE_PRIVATE, null);
        Cursor ResultatQuery = db.rawQuery("SELECT id FROM buttons", null);
       if (ResultatQuery != null) {
            while(ResultatQuery.moveToNext()){
                Button  = ResultatQuery.getInt(0);
                Button ButtonView = findViewById(Button);
                ButtonView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#769CD2")));
           }
       }
    }
    

    public void MenuClick(View v) {

        Intent i = new Intent(this, hello8.class);
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

    public void ButtonClick(View view)
    {
        button_id = view.getId();
       Button Button = findViewById(button_id);
        button_number = Button.getText().toString();
        Intent i = new Intent(this, hello7.class);
        startActivity(i);

    }

}