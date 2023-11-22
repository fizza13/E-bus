package com.example.e_bus;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button button1;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button1 = (Button) findViewById(R.id.button1);
        button = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    public void openNewActivity1(){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

}