package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class welcomeActivity extends AppCompatActivity {

     TextView textView;
    EditText num1, num2;
    Button sum, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textView = findViewById(R.id.username);
        Intent intent = getIntent();
        String TXT = intent.getStringExtra("username_key");
        textView.setText(TXT);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        sum = findViewById(R.id.btn_sum);
        sub = findViewById(R.id.btn_sub);
        mul = findViewById(R.id.btn_mul);
        div = findViewById(R.id.btn_div);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a+b;

                Toast.makeText(welcomeActivity.this, Integer.toString(total), Toast.LENGTH_SHORT).show();

                Toast.makeText(welcomeActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a-b;

                Toast.makeText(welcomeActivity.this, Integer.toString(total), Toast.LENGTH_SHORT).show();

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a*b;

                Toast.makeText(welcomeActivity.this, Integer.toString(total), Toast.LENGTH_SHORT).show();

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NUM1 = num1.getText().toString();
                String NUM2 = num2.getText().toString();

                int a = Integer.parseInt(NUM1);
                int b = Integer.parseInt(NUM2);
                int total = a/b;

                Toast.makeText(welcomeActivity.this, Integer.toString(total), Toast.LENGTH_SHORT).show();

            }
        });

    }
}