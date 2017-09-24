package com.example.gagandeep.myapplication.List.List4;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

/**
 * Created by gagandeep on 8/30/17.
 */

public class Custom1Adapter extends ArrayAdapter{

    public Custom1Adapter(Activity context, ArrayList<Custom1> Custom1){

        super(context, 0, Custom1);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        View listItemView = convertView;
        if (listItemView==null){
            //listItemView= LayoutInflater.from(getContext()).inflate(R.id.custom_list4, false);    *must have been layout instead of id*
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list4, parent, false);
        }

        //Custom1 currentcutom1 = getItem(Position);
        Custom1 currentCustom1 = (Custom1) getItem(position);

        TextView head = listItemView.findViewById(R.id.head);
        head.setText(currentCustom1.getHead());

        TextView body = listItemView.findViewById(R.id.body);
        body.setText(currentCustom1.getBody());

        ImageView imageView = listItemView.findViewById(R.id.image1);
        imageView.setImageResource(currentCustom1.getResourceId());



        return listItemView;
    }
}
