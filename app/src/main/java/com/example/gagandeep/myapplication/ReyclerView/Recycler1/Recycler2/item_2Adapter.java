package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.List;

/**
 * Created by gagandeep on 9/3/17.
 */

public class item_2Adapter extends RecyclerView.Adapter<item_2Adapter.ViewHolder>{

    private List<item_2> item2;
    private Context context;

    public item_2Adapter(List<item_2> item2, Context context) {
        this.item2 = item2;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView head, body;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
            imageView = itemView.findViewById(R.id.image1);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list4, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        item_2 getItem_2 = item2.get(position);
        holder.head.setText(getItem_2.getHead());
        holder.body.setText(getItem_2.getBody());
        holder.imageView.setImageResource(getItem_2.getResouceId());

    }

    @Override
    public int getItemCount() {
        return item2.size();
    }
}
