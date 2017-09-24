package com.example.gagandeep.myapplication.List.List5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class List5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        click();
    }

    private void click() {

        final ArrayList<Custom2> custom2 = new ArrayList<>();
        custom2.add(new Custom2("hi", "i want to mmori this code", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_4));
        custom2.add(new Custom2("hi hi", "Activity", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("hi hi hi", "context", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("lol", "use super instead of return", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("xD", "null startement is necessary", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("D:", "LayoutInflator.from(getContext())", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2(":)", ".inflate(R.id.name_of_template)", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2(":D", ", parent, false", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("x.x", "i want", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("'.'", "to", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("XOXO", "memorize that above", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("Thats", "line", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("just", "LayoutInflator.from(getContext())", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("more than ", ".inflate(R.id.name_template, parent, flase)", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("enough", "maybe im successfull", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));
        custom2.add(new Custom2("for me atleast", "XD", R.mipmap.ic_launcher_round, R.mipmap.ic_launcher, R.color.design_1));

        ListView listView = findViewById(R.id.list_item);

        Custom2Adapter adapter = new Custom2Adapter(this, custom2);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int postition, long l) {
//                Intent i;
//                switch (postition) {
//                    case 1:
//                        i = new Intent(List5Activity.this, MainActivity.class);
//                        startActivity(i);
//                        break;
//                    case 2:
//                        i = new Intent(List5Activity.this, CalculatorActivity.class);
//                        startActivity(i);
//                        break;
//                }
//            }
//        });


    }
}
