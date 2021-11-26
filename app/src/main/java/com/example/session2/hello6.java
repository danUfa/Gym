package com.example.session2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class hello6 extends AppCompatActivity {

        final int dialog = 1;
        public static ArrayList<user> Users;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hello6);

            Users = new ArrayList<>();

            //Загружаем данные пользователей из бд
            SQLiteDatabase db = getBaseContext().openOrCreateDatabase("Users.db", MODE_PRIVATE, null);
            db.execSQL("CREATE TABLE IF NOT EXISTS users (login TEXT, password TEXT)");
            Cursor query = db.rawQuery("SELECT * FROM users;", null);
            while(query.moveToNext()){
                String login = query.getString(0);
                String password = query.getString(1);
                Users.add(new user(login, password));
            }
            query.close();
            db.close();
        }

        public void LogInClick (View view) {
            Intent profile = new Intent(hello6.this, hello8.class);
            EditText logT = findViewById(R.id.editTextTextPersonName);
            EditText passT = findViewById(R.id.editTextTextPassword);
            String Log = logT.getText().toString();
            String Pass = passT.getText().toString();
            boolean found = false;
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            if(Log.equals("") || Pass.equals("")){
                showDialog(dialog);
            }else{
                for (user item: hello6.Users) {
                    if (logT.getText().toString().equals(item.login))
                    {
                        found = true;

                        if (item.getPassword().equals(passT.getText().toString()))
                        {
                            user.LastUser = item.login;
                            logT.setText("");
                            passT.setText("");
                            startActivity(profile);
                            break;
                        }
                        else
                        {
                            alert.setTitle("Wrong!");
                            alert.setMessage("Password is incorrect!");
                            alert.show();
                        }

                    }
                }
                if (!found)
                {
                    alert.setTitle("Not found!");
                    alert.setMessage("Пользователь не найден");
                    alert.show();
                }
            }


        }
        protected Dialog onCreateDialog(int id){
            if(id == dialog){
                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setMessage(R.string.error);
                alert.setTitle(R.string.erroor);
                alert.setNeutralButton(R.string.cancel, myClickListener);
                return alert.create();

            }

            return super.onCreateDialog(id);
        }
        DialogInterface.OnClickListener myClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case Dialog.BUTTON_NEUTRAL:
                        break;
                }
            }
        };

        public void SignUpClick (View view){
            Intent sign = new Intent(hello6.this, registratoin.class);
            startActivity(sign);
            EditText logT = findViewById(R.id.editTextTextPersonName);
            EditText passT = findViewById(R.id.editTextTextPassword);
            logT.setText("");
            passT.setText("");
        }
    }

