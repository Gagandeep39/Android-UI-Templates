package com.example.gagandeep.myapplication.List.List3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class List3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        click();
}

    private void click() {
        ArrayList<Word> test = new ArrayList<Word>();
        test.add(new Word("One", "-----------------------"));

        test.add(new Word("Two", "-----------------------"));

        test.add(new Word("Three", "-----------------------"));

        test.add(new Word("Four", "-----------------------"));

        test.add(new Word("Five", "-----------------------"));

        test.add(new Word("Six", "-----------------------"));

        test.add(new Word("Seven", "-----------------------"));

        test.add(new Word("Eight", "-----------------------"));

        test.add(new Word("Nine", "-----------------------"));

        test.add(new Word("Ten", "-----------------------"));


        ListView listView = (ListView)findViewById(R.id.list_item);
        WordAdapter Adapter = new WordAdapter(this, test);
        listView.setAdapter(Adapter);
    }
    }
