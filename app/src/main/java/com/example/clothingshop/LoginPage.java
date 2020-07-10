package com.example.clothingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPage extends AppCompatActivity {
    Button btn;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        btn = (Button) findViewById(R.id.loginButton2);
        button = (Button) findViewById(R.id.Signup_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenuActivity();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSignupActivity();
            }
        });
    }
    public void startMenuActivity(){
        Intent intent= new Intent(this,ItemPage.class);
        startActivity(intent);

    }
    public void startSignupActivity(){
        Intent intent= new Intent(this,SignUpPage.class);
        startActivity(intent);

    }
}
