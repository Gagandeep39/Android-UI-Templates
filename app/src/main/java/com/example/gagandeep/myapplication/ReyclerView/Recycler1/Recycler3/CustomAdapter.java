package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.List;

/**
 * Created by gagandeep on 9/5/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{
    public CustomAdapter(List<Custom> customs, Context context) {
        this.customs = customs;
        this.context = context;
    }

    private List<Custom> customs;
    private Context context;



    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list3, parent, false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder holder, int position) {
        Custom getCustom = customs.get(position);
        holder.head.setText(getCustom.getHead());
        holder.body.setText(getCustom.getBody());


    }

    @Override
    public int getItemCount() {
        return customs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView head;
        public TextView body;

        public ViewHolder(View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
        }
    }
}
