package com.example.session2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registratoin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registratoin);
    }
    public void SignUpClick (View view){
        EditText logT = findViewById(R.id.editTextTextPersonName);
        EditText passT = findViewById(R.id.editTextTextPassword);
        String Log = logT.getText().toString();
        String Pass = passT.getText().toString();
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        Intent sign = new Intent(registratoin.this, hello6.class);
        startActivity(sign);
        if (Log.equals("") || Pass.equals(""))
        {
            alert.setTitle("Not filled!");
            alert.setMessage("You must to fill all of fields");
            alert.show();
            return;
        }

        boolean found = false;

        for (user item: hello6.Users) {

            if (Log.equals(item.login))
            {
                found = true;
                alert.setTitle("Already exist");
                alert.setMessage("User exist");
                alert.show();
            }
        }
        if (!found)
        {
            SaveUser(Log, Pass);
            alert.setMessage("Успешная регистрация");
            alert.setTitle("OK");
            alert.setPositiveButton("Войти", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    registratoin.this.finish();
                }
            });
            alert.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialogInterface) {
                    registratoin.this.finish();
                }
            });
            alert.show();
        }
    }


    public void SaveUser(String login, String password)
    {
        ContentValues cv = new ContentValues();
        cv.put("login", login);
        cv.put("password", password);
        SQLiteDatabase db = getBaseContext().openOrCreateDatabase("Users.db", MODE_PRIVATE, null);
        db.insert("Users", null, cv);
        db.close();
        hello6.Users.add(new user(login, password));

    }
}