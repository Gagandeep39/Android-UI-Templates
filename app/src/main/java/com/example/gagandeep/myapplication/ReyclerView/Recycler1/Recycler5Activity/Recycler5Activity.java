package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler5Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

/**
 * Created by gagandeep on 9/5/17.
 */

public class Recycler5Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);
        click();
    }

    private void click() {
        //recyclerView.setBackgroundResource(R.drawable.rime_blurpng);

        ArrayList<Custom5> custom5s = new ArrayList<>();
        custom5s.add(new Custom5("Calculator","This Activity is just used for calculation of price of coffees with some some price variation depending on extra stuffs like Vanilla, Chocolate or Caramel", R.drawable.ic_drawer));
        custom5s.add(new Custom5("2","", R.drawable.ic_drawer));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Custom5Adapter(custom5s, this);
        recyclerView.setAdapter(adapter);

    }
}
