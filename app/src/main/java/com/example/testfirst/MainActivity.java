package com.example.testfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    Button plus,equal;
    TextView txtNumbers;
    String f = "";
    int first = 0,second = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumbers = findViewById(R.id.txtnumbers);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        plus = findViewById(R.id.plus);
        equal = findViewById(R.id.equal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = f+"1";
                txtNumbers.setText(f);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = f+"2";
                txtNumbers.setText(f);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = f+"3";
                txtNumbers.setText(f);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = Integer.parseInt(f);
                f = "";
                txtNumbers.setText("");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = Integer.parseInt(f);
                f = "";
                txtNumbers.setText(String.valueOf(first+second));


            }
        });

    }
}