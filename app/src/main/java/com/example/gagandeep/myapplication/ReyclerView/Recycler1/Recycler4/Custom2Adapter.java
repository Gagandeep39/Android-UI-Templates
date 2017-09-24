package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4;

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
 * Created by gagandeep on 9/5/17.
 */

public class Custom2Adapter extends RecyclerView.Adapter<Custom2Adapter.ViewHolder>{
    private List<Custom2> custom2s;
    private Context context;

    public Custom2Adapter(List<Custom2> custom2s, Context context) {
        this.custom2s = custom2s;
        this.context = context;
    }

    @Override
    public Custom2Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list4, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Custom2 getCustom2 = custom2s.get(position);
        holder.head.setText(getCustom2.getHead());
        holder.body.setText(getCustom2.getBody());
        holder.resourceId.setImageResource(getCustom2.getResourceId());


    }

    @Override
    public int getItemCount() {
        return custom2s.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView head;
        public TextView body;
        public ImageView resourceId;
        public ViewHolder(View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
            resourceId = itemView.findViewById(R.id.image1);

        }
    }

}
