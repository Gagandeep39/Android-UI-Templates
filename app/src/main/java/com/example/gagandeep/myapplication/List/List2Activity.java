package com.example.gagandeep.myapplication.List;
/**
 * Just another one for practice
 * */
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class List2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.design_3)));


        click();
    }

    private void click() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        arrayList.add("Six");
        arrayList.add("Seven");
        arrayList.add("Eight");
        arrayList.add("Nine");
        arrayList.add("Ten");
        arrayList.add("Eleven");
        arrayList.add("Twelve");
        arrayList.add("Thirteen");
        arrayList.add("Fourteen");
        arrayList.add("Fifteen");
        arrayList.add("Sixteen");

        ListView listView = findViewById(R.id.list_item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
