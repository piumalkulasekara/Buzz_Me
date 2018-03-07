package com.buzz_me.sashinip.buzz_me_driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onecountDown;
    Button twologin;
    Button threesignup;
    Button fourstartride;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onecountDown = (Button) findViewById(R.id.btn1);
        twologin = (Button) findViewById(R.id.btn2);
        threesignup = (Button) findViewById(R.id.btn3);
        fourstartride = (Button) findViewById(R.id.btn4);

        onecountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(MainActivity.this, CountDownActivity.class);
                startActivity(one);
            }
        });

        twologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent two = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(two);
            }
        });

        threesignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(three);
            }
        });

        fourstartride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent four = new Intent(MainActivity.this, StartRideActivity.class);
                startActivity(four);
            }
        });
    }
}
