package com.example.gagandeep.myapplication.TabbedActivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gagandeep.myapplication.R;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6.Custom6;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6.Custom6Adapter;

import java.util.ArrayList;

/**
 * Created by gagandeep on 9/10/17.
 */

public class Tab4 extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.tab1, container, false);

        recyclerView = v.findViewById(R.id.recycler_view);
                click();
        return v;
    }

    private void click() {
        ArrayList<Custom6> lol = new ArrayList<>();
        for(int i=0; i<100; i++) {
            lol.add(new Custom6("Title" + i, "This is a place holder number " + i, R.drawable.ic_fire));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);
        adapter = new Custom6Adapter(lol, getActivity());
        recyclerView.setAdapter(adapter);
    }
}
