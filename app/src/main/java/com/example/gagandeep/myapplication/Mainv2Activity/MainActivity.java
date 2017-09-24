package com.example.gagandeep.myapplication.Mainv2Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gagandeep.myapplication.BottomActivity;
import com.example.gagandeep.myapplication.Calculator.CalculatorActivity;
import com.example.gagandeep.myapplication.EmptyActivity.EmptyActivity;
import com.example.gagandeep.myapplication.List.List2Activity;
import com.example.gagandeep.myapplication.List.List3.List3Activity;
import com.example.gagandeep.myapplication.List.List4.List4Activity;
import com.example.gagandeep.myapplication.List.List5.List5Activity;
import com.example.gagandeep.myapplication.List.ListActivity;
import com.example.gagandeep.myapplication.MainActivityOld;
import com.example.gagandeep.myapplication.Mainv3.Main3Adapter;
import com.example.gagandeep.myapplication.Mainv3.Mainv3Activity;
import com.example.gagandeep.myapplication.Media.MediaActivity;
import com.example.gagandeep.myapplication.Notification.NotificationActivity;
import com.example.gagandeep.myapplication.R;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler1.Recycler1Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler2.Recycler2Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.ScrollingActivity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4.Recycler4Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler5Activity.Recycler5Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6.Recycler6Activity;
import com.example.gagandeep.myapplication.TabbedActivity.Tabbed2Activity;
import com.example.gagandeep.myapplication.TabbedActivity.TabbedActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.nav_main);
        setSupportActionBar(toolbar);


        onClicks();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void onClicks() {

        ArrayList<Main> main = new ArrayList<>();
        main.add(new Main("1 " + getString(R.string.calculator), R.color.design_0));
        main.add(new Main("2 " + getString(R.string.media_player), R.color.design_1));
        main.add(new Main("3 " + getString(R.string.list), R.color.design_2));
        main.add(new Main("4 " + getString(R.string.second_list), R.color.design_3));
        main.add(new Main("5 " + getString(R.string.custom_list), R.color.design_4));
        main.add(new Main("6 " + getString(R.string.custom_list2), R.color.design_5));
        main.add(new Main("7 " + getString(R.string.third_custom_list), R.color.design_6));
        main.add(new Main("8 " + getString(R.string.notification), R.color.design_7));
        main.add(new Main("9 " + getString(R.string.old_main), R.color.design_8));
        main.add(new Main("10 " + getString(R.string.recycler_view1), R.color.design_9));
        main.add(new Main("11 " + getString(R.string.recycler_view2), R.color.design_10));
        main.add(new Main("12 " + getString(R.string.tab_activity), R.color.design_11));
        main.add(new Main("13. Tab Activty 2", R.color.design_12));
        main.add(new Main("14. In progress", R.color.design_13));
        main.add(new Main("15 " + "RecyclerView 4", R.color.design_14));
        main.add(new Main("16 " + "RecyclerView 5", R.color.design_15));
        main.add(new Main("17 " + "Scrollable RecyclerView", R.color.design_1));
        main.add(new Main("18 " + "RecyclerView 6", R.color.design_2));
        main.add(new Main("19" + "Depricated", R.color.design_3));
        main.add(new Main("20" + "Depricated", R.color.design_3));

        ListView listView = findViewById(R.id.main_activity);

        MainAdapter adapter = new MainAdapter(this, main);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                click(position);
            }
        });
    }

    private void click(int position) {
        Intent i;
        position += 1;
        switch (position) {
            case 1:
                i = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(i);
                break;
            case 2:
                i = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(i);
                break;
            case 3:
                i = new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);
                break;
            case 4:
                i = new Intent(MainActivity.this, List2Activity.class);
                startActivity(i);
                break;
            case 5:
                i = new Intent(MainActivity.this, List3Activity.class);
                startActivity(i);
                break;
            case 6:
                i = new Intent(MainActivity.this, List4Activity.class);
                startActivity(i);
                break;
            case 7:
                i = new Intent(MainActivity.this, List5Activity.class);
                startActivity(i);
                break;
            case 8:
                i = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(i);
                break;
            case 9:
                i = new Intent(MainActivity.this, MainActivityOld.class);
                startActivity(i);
                break;
            case 10:
                startActivity(new Intent(MainActivity.this, Recycler1Activity.class));
                break;
            case 11:
                startActivity(new Intent(MainActivity.this, Recycler2Activity.class));
                break;
            case 12:
                startActivity(new Intent(MainActivity.this, TabbedActivity.class));
                break;
            case 13:
                startActivity(new Intent(MainActivity.this, Tabbed2Activity.class));
                break;
            case 14:
                startActivity(new Intent(MainActivity.this, EmptyActivity.class));
            case 15:
                startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
                break;
            case 16:
                startActivity(new Intent(MainActivity.this, Recycler4Activity.class));
                break;
            case 17:
                startActivity(new Intent(MainActivity.this, Recycler5Activity.class));
                break;
            case 18:
                startActivity(new Intent(MainActivity.this, Recycler5Activity.class));
                break;
            case 19:
                startActivity(new Intent(MainActivity.this, BottomActivity.class));
                break;
            case 20:
                startActivity(new Intent(MainActivity.this, Mainv3Activity.class));
                break;
        }
    }


}
