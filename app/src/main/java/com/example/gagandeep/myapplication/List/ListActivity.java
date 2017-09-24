package com.example.gagandeep.myapplication.List;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;
import android.support.v7.app.ActionBar;

public class ListActivity extends AppCompatActivity {
    ActionBar actionBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        actionBar = getSupportActionBar();
//        //ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(R.color.design_3));
//        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.design_3)));

        setContentView(R.layout.activity_list);


        click();
    }

    private void click() {

        ArrayList<String> lol = new ArrayList<>();
        lol.add("Never tell your aims to anyone");
        lol.add("Work hard for what you want");
        lol.add("Never show your emotions to anyone");
        lol.add("Always give a smile to others");
        lol.add("Be nice to everyone no matter how much you hate them");
        lol.add("Be kind");
        lol.add("Don't waste time");
        lol.add("Give your best to achieve a goal");
        lol.add("Don't forget you have to study no matter how difficult it is");
        lol.add("Make your parents happy");
        lol.add("Things what you like can be done later on in future");
        lol.add("Don't make unachievable goals");
        lol.add("There are 2 ways to be successful, either work hard yourself or just don't let others to be better than you");

        ListView listView = findViewById(R.id.list_item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lol);
        listView.setAdapter(arrayAdapter);

    }
}
