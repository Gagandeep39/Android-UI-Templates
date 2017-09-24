package com.example.gagandeep.myapplication.List.List4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class List4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        click();
    }

    private void click() {
        ArrayList<Custom1> custom = new ArrayList<>();
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));

        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));
        custom.add(new Custom1("", "", R.mipmap.ic_launcher_round));


        ListView listView = findViewById(R.id.list_item);
        Custom1Adapter custom1Adapter =  new Custom1Adapter(this, custom);

        listView.setAdapter(custom1Adapter);

    }
}
