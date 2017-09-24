package com.example.gagandeep.myapplication.TabbedActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gagandeep.myapplication.R;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.Custom;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.CustomAdapter;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4.Custom2;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4.Custom2Adapter;

import java.util.ArrayList;

/**
 * Created by gagandeep on 9/10/17.
 */

public class Tab3 extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab1, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);
        click();
        return v;
    }

    private void click() {
        ArrayList<Custom2> custom2s = new ArrayList<>();
//        custom2s.add(new Custom2("A", "Madness", R.drawable.amoled_1));
//        custom2s.add(new Custom2("B", "Deep End", R.drawable.amoled_1));
//        custom2s.add(new Custom2("C", "Game of Survival", R.drawable.amoled_1));
//        custom2s.add(new Custom2("D", "Live like Legends", R.drawable.amoled_1));
//        custom2s.add(new Custom2("E", "Where do we go from here?", R.drawable.amoled_1));
//        custom2s.add(new Custom2("F", "Daydream", R.drawable.amoled_1));
//        custom2s.add(new Custom2("G", "Bad Dream", R.drawable.amoled_1));
//        custom2s.add(new Custom2("H", "Closing In", R.drawable.amoled_1));

        for(double i=1; i<999; i++){
            custom2s.add(new Custom2("" + i, "Test", R.mipmap.ic_launcher_round));
            Log.v("Value is : ", "Value " + i);
        }
        adapter = new Custom2Adapter(custom2s, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }
}
