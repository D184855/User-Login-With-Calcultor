package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button buttonLogin;
    TextView txt_attempt;
    int attempt_count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        buttonLogin = findViewById(R.id.btn_login);
        txt_attempt = findViewById(R.id.txt_attempt);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String USERNAME = username.getText().toString();
                String PASS = password.getText().toString();

                if(USERNAME.isEmpty()){
                    username.setError("Username can't be empty");
                    username.requestFocus();
                    return;
                }

                if(PASS.isEmpty()){
                    password.setError("Password can't be empty");
                    password.requestFocus();
                    return;
                }

                if(USERNAME.equals("admin") && PASS.equals("123")){
                    Intent intent = new Intent(MainActivity.this, welcomeActivity.class);
                    intent.putExtra("username_key", USERNAME);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "User and Pass not match", Toast.LENGTH_SHORT).show();
                    attempt_count--;
                    txt_attempt.setText(Integer.toString(attempt_count));
                    if(attempt_count == 0){
                        buttonLogin.setVisibility(View.INVISIBLE);
                    }
                }

            }
        });

    }
}