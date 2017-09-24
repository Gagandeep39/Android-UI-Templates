package com.example.gagandeep.myapplication;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.gagandeep.myapplication.TabbedActivity.Tab1;
import com.example.gagandeep.myapplication.TabbedActivity.Tab2;
import com.example.gagandeep.myapplication.TabbedActivity.Tab3;
import com.example.gagandeep.myapplication.TabbedActivity.Tab4;

public class BottomActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()){
                    case R.id.favourite: {
                        transaction.replace(R.id.container, new Tab1()).commit();
                        return true;
                    }
                    case R.id.setting: {
                        transaction.replace(R.id.container, new Tab2()).commit();
                        return true;
                    }
                    case R.id.llist: {
                        transaction.replace(R.id.container, new Tab4()).commit();
                        return true;
                    }
                }
                return true;
            }
        });
    }
}
