package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class Recycler2Activity extends Activity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);

        click();
    }

    private void click() {

        ArrayList<item_2> list = new ArrayList<>();
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));
        list.add(new item_2("", "", R.mipmap.ic_launcher_round));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new item_2Adapter(list, this);
        recyclerView.setAdapter(adapter);


    }

}
