package com.example.androidtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.button_1);
        bt2 = findViewById(R.id.button_2);
        bt3 = findViewById(R.id.button_3);
        bt4 = findViewById(R.id.button_4);
        bt5 = findViewById(R.id.button_5);
        bt6 = findViewById(R.id.button_6);
        bt7 = findViewById(R.id.button_7);
        bt8 = findViewById(R.id.button_8);
        bt9 = findViewById(R.id.button_9);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
    }

    int count = 0;

    void buttonClick(View view) {
        if (count % 2 == 0) {
            ((Button) view).setText("X");
        } else {
            ((Button) view).setText("0");
        }
        count++;
        checkWin();
    }

    void checkWin() {
        kiemTraX(bt1, bt2, bt3, "X");
        kiemTraX(bt1, bt4, bt7, "X");
        kiemTraX(bt1, bt5, bt9, "X");
        kiemTraX(bt4, bt5, bt6, "X");
        kiemTraX(bt7, bt8, bt9, "X");
        kiemTraX(bt2, bt5, bt8, "X");
        kiemTraX(bt3, bt6, bt9, "X");
        kiemTraX(bt3, bt5, bt7, "X");

    }

    void kiemTraX(Button btn1, Button btn2, Button btn3, String X) {
        if (btn1.getText().equals(X) && btn2.getText().equals(X) && btn3.getText().equals(X)) {
            Toast.makeText(this, "X win", Toast.LENGTH_SHORT).show();
            reset();
        }

    }

    void reset() {
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        count = 0;
    }
}
