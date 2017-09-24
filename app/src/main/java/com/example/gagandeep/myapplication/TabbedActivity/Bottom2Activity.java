package com.example.gagandeep.myapplication.TabbedActivity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.gagandeep.myapplication.R;

public class Bottom2Activity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom2);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //transaction.replace(R.id.container, new Tab1()).commit();
                switch (item.getItemId()){
                    case R.id.tab1:{
                        transaction.replace(R.id.container, new Tab1()).commit();
                        return true;

                    }
                    case R.id.tab2:{
                        transaction.replace(R.id.container, new Tab2()).commit();
                        return true;
                    }
                    case R.id.tab3:{
                        transaction.replace(R.id.container, new Tab3()).commit();
                        return true;
                    }
                    case R.id.tab4:{
                        transaction.replace(R.id.container, new Tab4()).commit();
                        return true;
                    }
                    case R.id.tab5:{
                        transaction.replace(R.id.container, new Tab1()).commit();
                        return true;
                    }

                }
                return true;
            }
        });
    }
}
