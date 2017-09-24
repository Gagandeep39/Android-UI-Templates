package com.example.gagandeep.myapplication.TabbedActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gagandeep.myapplication.R;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.Custom;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.CustomAdapter;

import java.util.ArrayList;

/**
 * Created by gagandeep on 9/10/17.
 */

public class Tab2 extends Fragment{
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab1, container, false);

         recyclerView = v.findViewById(R.id.recycler_view);
        click();
        return v;
    }

    private void click() {

        ArrayList<Custom> lol = new ArrayList<>();
        lol.add(new Custom("1", ""));
        lol.add(new Custom("2", ""));
        lol.add(new Custom("3", ""));
        lol.add(new Custom("4", ""));
        lol.add(new Custom("5", ""));
        lol.add(new Custom("6", ""));
        lol.add(new Custom("7", ""));
        lol.add(new Custom("8", ""));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new CustomAdapter(lol, getActivity());
        recyclerView.setAdapter(adapter);
    }
}
