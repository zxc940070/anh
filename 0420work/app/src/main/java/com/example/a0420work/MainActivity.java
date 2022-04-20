package com.example.a0420work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;

    String correct_username ="aaa";
    String correct_password ="123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                    Toast.makeText(MainActivity.this,"Empty data provided",Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals(correct_username)){

                    if(password.getText().toString().equals(correct_password)){
                        Toast.makeText(MainActivity.this,"Success Login",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,MainActivity2.class);
                        startActivity(intent);
                    }

                }else {
                    Toast.makeText(MainActivity.this,"Invalid Username/Password",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}