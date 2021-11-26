package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("MY_BASE", 0, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS users(login INTEGER primary key,  password STRING)");

        db.execSQL("INSERT INTO users VALUES (123, 'Pavel')");

        Cursor ResultatQuery = db.rawQuery("SELECT * FROM users", null);
        if (ResultatQuery != null){
            while (ResultatQuery.moveToNext()){
                Toast.makeText(this, Integer.toString(ResultatQuery.getInt(0)), Toast.LENGTH_LONG).show();
                Toast.makeText(this, ResultatQuery.getString(0), Toast.LENGTH_LONG).show();
            }
        }

    }
}