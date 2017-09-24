package com.example.gagandeep.myapplication.Mainv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class Mainv3Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.scroll_main);
        click();
    }

    private void click() {
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<Main3> main3s = new ArrayList<>();
        main3s.add(new Main3("1. Calculator", "Body", R.drawable.image999));
        main3s.add(new Main3("2. MediaPlayer", "Body", R.drawable.image999));
        main3s.add(new Main3("3. List 1", "Body", R.drawable.image999));
        main3s.add(new Main3("4. List 2", "Body", R.drawable.image999));
        main3s.add(new Main3("5. List 3", "Body", R.drawable.image999));
        main3s.add(new Main3("6. List 4", "Body", R.drawable.image999));
        main3s.add(new Main3("7. List 5", "Body", R.drawable.image999));
        main3s.add(new Main3("8. Recycler 1", "Body", R.drawable.image999));
        main3s.add(new Main3("9. Recycler 2", "Body", R.drawable.image999));
        main3s.add(new Main3("10. Recycler 3", "Body", R.drawable.image999));
        main3s.add(new Main3("11. Recycler 4", "Body", R.drawable.image999));
        main3s.add(new Main3("12. Recycler 5", "Body", R.drawable.image999));
        main3s.add(new Main3("13. Recycler 6", "Body", R.drawable.image999));
        main3s.add(new Main3("14. Main Activity 1", "Body", R.drawable.image999));
        main3s.add(new Main3("15. Main Activity 2", "Body", R.drawable.image999));
        main3s.add(new Main3("16. Ripple Image", "Body", R.drawable.image999));
        main3s.add(new Main3("17. Tab 1", "Body", R.drawable.image999));
        main3s.add(new Main3("18. Tab 2", "Body", R.drawable.image999));
        main3s.add(new Main3("19. BottomBar 1", "Body", R.drawable.image999));
        main3s.add(new Main3("20. BottomBar 2", "Body", R.drawable.image999));
        main3s.add(new Main3("21. Tab 3", "Body", R.drawable.image999));
        main3s.add(new Main3("22. Earthquake", "Body", R.drawable.image999));
        main3s.add(new Main3("23. Widgets", "Body", R.drawable.image999));
        adapter = new Main3Adapter(main3s, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
