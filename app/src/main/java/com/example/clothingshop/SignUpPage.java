package com.example.clothingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPage extends AppCompatActivity {
    Button btn;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        btn = (Button) findViewById(R.id.SignUpbutton);
        button = (Button) findViewById(R.id.gobackButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextActivity();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenuActivity();
            }
        });
    }
        public void startMenuActivity () {
            Intent intent = new Intent(this, ItemPage.class);
            startActivity(intent);

        }
        public void startNextActivity () {
            Intent intent = new Intent(this, LoginPage.class);
            startActivity(intent);

        }

        public void LoginPage (View view){
        }
    }

