package com.thuchanhlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT5();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT6();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT7();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT8();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT9();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT10();
            }
        });


    }
    private void addControls(){
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
    }

    public void BT5(){
        Intent intent = new Intent(getApplicationContext(), BT5.class);
        startActivity(intent);
    }
    public void BT6(){
        Intent intent = new Intent(getApplicationContext(), BT6.class);
        startActivity(intent);
    }
    public void BT7(){
        Intent intent = new Intent(getApplicationContext(), BT7.class);
        startActivity(intent);
    }
    public void BT8(){
        Intent intent = new Intent(getApplicationContext(), BT8.class);
        startActivity(intent);
    }
    public void BT9(){
        Intent intent = new Intent(getApplicationContext(), BT9.class);
        startActivity(intent);
    }
    public void BT10(){
        Intent intent = new Intent(getApplicationContext(), BT10.class);
        startActivity(intent);
    }

}