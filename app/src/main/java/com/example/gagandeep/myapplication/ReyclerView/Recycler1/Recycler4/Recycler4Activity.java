package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class Recycler4Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);
        click();

    }

    private void click() {
        ArrayList<Custom2> custom2s = new ArrayList<>();
        custom2s.add(new Custom2("A", "Madness", R.drawable.amoled_1));
        custom2s.add(new Custom2("B", "Deep End", R.drawable.amoled_1));
        custom2s.add(new Custom2("C", "Game of Survival", R.drawable.amoled_1));
        custom2s.add(new Custom2("D", "Live like Legends", R.drawable.amoled_1));
        custom2s.add(new Custom2("E", "Where do we go from here?", R.drawable.amoled_1));
        custom2s.add(new Custom2("F", "Daydream", R.drawable.amoled_1));
        custom2s.add(new Custom2("G", "Bad Dream", R.drawable.amoled_1));
        custom2s.add(new Custom2("H", "Closing In", R.drawable.amoled_1));


        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Custom2Adapter(custom2s, this);
        recyclerView.setAdapter(adapter);
    }
}
