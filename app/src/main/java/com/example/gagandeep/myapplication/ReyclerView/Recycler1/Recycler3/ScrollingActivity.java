package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivity extends Activity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<Custom> customs;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);
        click();
    }

    private void click() {

        ArrayList<Custom> lol = new ArrayList<>();
        lol.add(new Custom("1", ""));
        lol.add(new Custom("2", ""));
        lol.add(new Custom("3", ""));
        lol.add(new Custom("4", ""));
        lol.add(new Custom("5", ""));
        lol.add(new Custom("6", ""));
        lol.add(new Custom("7", ""));
        lol.add(new Custom("8", ""));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter(lol, this);
        recyclerView.setAdapter(adapter);

    }
}
