package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.List;

/**
 * Created by gagandeep on 9/2/17.
 */
    //1. <Adapter name.ViewHolder>
public class Item2Adapter extends RecyclerView.Adapter<Item2Adapter.ViewHolder>{

    private List<Item2> item2;

    //List is a data type
    private Context context;

    public Item2Adapter(List<Item2> item2, Context context) {
        this.item2 = item2;
        this.context = context;
    }


    //5. click on text of above class and press rightclick or alt + enter to generate
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list3, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item2 getItem2 = item2.get(position);
        holder.head.setText(getItem2.getHead());
        holder.body.setText(getItem2.getBody());
    }

    @Override
    public int getItemCount() {
        return item2.size();
    }
    //give any name


    // 2. public class ViewHolder<!--is a random name-->    extends RecyclerView.ViewHolder{}
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView head, body;

        //4. Alt + Enter or rightclick->implement to create constructor
        public ViewHolder(View itemView) {
            super(itemView);

            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);


        }
    }
}
