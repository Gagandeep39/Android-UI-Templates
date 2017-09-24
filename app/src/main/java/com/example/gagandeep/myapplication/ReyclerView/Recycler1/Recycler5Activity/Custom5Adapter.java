package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler5Activity;

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

public class Custom5Adapter extends RecyclerView.Adapter<Custom5Adapter.ViewHolder> {
    private List<Custom5> custom5s;
    private Context context;

    public Custom5Adapter(List<Custom5> custom5s, Context context) {
        this.custom5s = custom5s;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_5, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Custom5 getCustom5 = custom5s.get(position);
        holder.head.setText(getCustom5.getHead());
        holder.body.setText(getCustom5.getBody());
        holder.resourceId.setImageResource(getCustom5.getResourceId());

    }

    @Override
    public int getItemCount() {
        return custom5s.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView head, body;
        ImageView resourceId;

        public ViewHolder(View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
            resourceId = itemView.findViewById(R.id.image1);
        }
    }


}
