package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6;

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
 * Created by gagandeep on 9/7/17.
 */

public class Custom6Adapter extends RecyclerView.Adapter<Custom6Adapter.ViewHolder>{


    private List<Custom6> custom6s;
    private Context context;

    public Custom6Adapter(List<Custom6> custom6s, Context context) {
        this.custom6s = custom6s;
        this.context = context;
    }

    @Override
    public Custom6Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_5, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Custom6Adapter.ViewHolder holder, int position) {
        Custom6 getCustom6 = custom6s.get(position);
        holder.head.setText(getCustom6.getHead());
        holder.body.setText(getCustom6.getBody());
        holder.image1.setImageResource(getCustom6.getResourceId());

    }

    @Override
    public int getItemCount() {
        return custom6s.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView head, body;
        ImageView image1;

        public ViewHolder(View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
            image1  =itemView.findViewById(R.id.image1);
            itemView.setClickable(true);



        }


    }

}
