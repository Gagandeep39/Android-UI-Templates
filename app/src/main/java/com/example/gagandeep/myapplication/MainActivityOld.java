package com.example.gagandeep.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gagandeep.myapplication.Calculator.CalculatorActivity;
import com.example.gagandeep.myapplication.EmptyActivity.EmptyActivity;
import com.example.gagandeep.myapplication.List.List2Activity;
import com.example.gagandeep.myapplication.List.List3.List3Activity;
import com.example.gagandeep.myapplication.List.List4.List4Activity;
import com.example.gagandeep.myapplication.List.List5.List5Activity;
import com.example.gagandeep.myapplication.List.ListActivity;
import com.example.gagandeep.myapplication.Media.MediaActivity;
import com.example.gagandeep.myapplication.Notification.NotificationActivity;

public class MainActivityOld extends AppCompatActivity {

    TextView textViewCalculator, textViewMedia, textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_old);
        click();
    }

    private void click() {

            textViewCalculator = findViewById(R.id.textCalculator);
            textViewCalculator.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, CalculatorActivity.class);
                    startActivity(i);
                }
            });

            textViewMedia = findViewById(R.id.textMedia);
            textViewMedia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, MediaActivity.class);
                    startActivity(i);

                }
            });

            textView = findViewById(R.id.textProgress);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, EmptyActivity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textNotification);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, NotificationActivity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textList);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, ListActivity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textList2);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, List2Activity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textList3);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, List3Activity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textList4);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, List4Activity.class);
                    startActivity(i);
                }
            });

            textView = findViewById(R.id.textList5);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivityOld.this, List5Activity.class);
                    startActivity(i);
                }
            });
        }
    }

