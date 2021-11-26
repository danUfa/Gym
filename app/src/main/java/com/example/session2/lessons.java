package com.example.session2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class lessons extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);
        Button hands = (Button) findViewById(R.id.button27);
        Button torso = (Button) findViewById(R.id.button26);
        Button spine = (Button) findViewById(R.id.button24);
        Button legs = (Button) findViewById(R.id.button25);
        ImageView image1 = findViewById(R.id.imageView69);
        ImageView image2 = findViewById(R.id.imageView70);
        ImageView image3 = findViewById(R.id.imageView71);
        ImageView image4 = findViewById(R.id.imageView66);
        hands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hands.setBackgroundColor(getResources().getColor(R.color.blue_gym));
                spine.setBackgroundColor(getResources().getColor(R.color.white));
                torso.setBackgroundColor(getResources().getColor(R.color.white));
                legs.setBackgroundColor(getResources().getColor(R.color.white));

                hands.setTextColor(getResources().getColor(R.color.white));
                spine.setTextColor(getResources().getColor(R.color.blue_gym));
                torso.setTextColor(getResources().getColor(R.color.blue_gym));
                legs.setTextColor(getResources().getColor(R.color.blue_gym));


                image1.setImageDrawable(getResources().getDrawable(R.drawable.hands));
                image2.setImageDrawable(getResources().getDrawable(R.drawable.hands));
                image3.setImageDrawable(getResources().getDrawable(R.drawable.hands));
                //  image4.setBackgroundResource(R.drawable.hands);

            }
        });
        spine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hands.setBackgroundColor(getResources().getColor(R.color.white));
                spine.setBackgroundColor(getResources().getColor(R.color.blue_gym));
                torso.setBackgroundColor(getResources().getColor(R.color.white));
                legs.setBackgroundColor(getResources().getColor(R.color.white));

                hands.setTextColor(getResources().getColor(R.color.blue_gym));
                spine.setTextColor(getResources().getColor(R.color.white));
                torso.setTextColor(getResources().getColor(R.color.blue_gym));
                legs.setTextColor(getResources().getColor(R.color.blue_gym));


                image1.setImageDrawable(getResources().getDrawable(R.drawable.spine));
                image2.setImageDrawable(getResources().getDrawable(R.drawable.spine));
                image3.setImageDrawable(getResources().getDrawable(R.drawable.spine));
                //  image4.setBackgroundResource(R.drawable.spine);
            }
        });
        torso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hands.setBackgroundColor(getResources().getColor(R.color.white));
                spine.setBackgroundColor(getResources().getColor(R.color.white));
                torso.setBackgroundColor(getResources().getColor(R.color.blue_gym));
                legs.setBackgroundColor(getResources().getColor(R.color.white));

                hands.setTextColor(getResources().getColor(R.color.blue_gym));
                spine.setTextColor(getResources().getColor(R.color.blue_gym));
                torso.setTextColor(getResources().getColor(R.color.white));
                legs.setTextColor(getResources().getColor(R.color.blue_gym));


                image1.setBackgroundResource(R.drawable.torso);
                image2.setBackgroundResource(R.drawable.torso);
                image3.setBackgroundResource(R.drawable.torso);
                //  image4.setBackgroundResource(R.drawable.torso);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hands.setBackgroundColor(getResources().getColor(R.color.white));
                spine.setBackgroundColor(getResources().getColor(R.color.white));
                torso.setBackgroundColor(getResources().getColor(R.color.white));
                legs.setBackgroundColor(getResources().getColor(R.color.blue_gym));

                hands.setTextColor(getResources().getColor(R.color.blue_gym));
                spine.setTextColor(getResources().getColor(R.color.blue_gym));
                torso.setTextColor(getResources().getColor(R.color.blue_gym));
                legs.setTextColor(getResources().getColor(R.color.white));


                image1.setBackgroundResource(R.drawable.legs);
                image2.setBackgroundResource(R.drawable.legs);
                image3.setBackgroundResource(R.drawable.legs);
                //image4.setBackgroundResource(R.drawable.legs);
            }
        });
    }






    public void Voitenko3(View view) {
        Intent sign = new Intent(lessons.this, Legs.class);
        startActivity(sign);
    }

    public void Voitenko4(View view) {
        Intent sign = new Intent(lessons.this, hello7.class);
        startActivity(sign);
    }
}