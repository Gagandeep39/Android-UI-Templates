package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class Recycler6Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);
        Toolbar toolbar = findViewById(R.id.nav_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        click();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onItemsSelected(MenuItem menuItem){

        return super.onOptionsItemSelected(menuItem);
    }

    private void click() {

        ArrayList<Custom6> custom6s = new ArrayList<>();
        custom6s.add(new Custom6("Place Holder", "This is another Placeholder", R.drawable.ic_a));
        custom6s.add(new Custom6("Place Holder", "This is another Placeholder", R.drawable.ic_b));

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new Custom6Adapter(custom6s, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }


}
