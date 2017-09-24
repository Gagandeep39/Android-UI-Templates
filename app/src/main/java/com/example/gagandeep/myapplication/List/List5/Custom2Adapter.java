package com.example.gagandeep.myapplication.List.List5;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by gagandeep on 8/30/17.
 */

public class Custom2Adapter extends ArrayAdapter{

    public Custom2Adapter(Activity context, ArrayList<Custom2> Custom2){

        super(context, 0, Custom2);
    }
    @NonNull
    @Override



    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list5, parent, false);
        }

        Custom2 currentCustom2 = (Custom2) getItem(position);

        TextView head = listItemView.findViewById(R.id.head);
        head.setText(currentCustom2.getHead());

        TextView body = listItemView.findViewById(R.id.body);
        body.setText(currentCustom2.getBody());

        ImageView resourceId1 = listItemView.findViewById(R.id.image1);
        resourceId1.setImageResource(currentCustom2.getResourceId1());

        ImageView resourceId2 = listItemView.findViewById(R.id.image2);
        resourceId2.setImageResource(currentCustom2.getResourceId2());

        ConstraintLayout constraintLayout = listItemView.findViewById(R.id.example);
        constraintLayout.setBackgroundResource(currentCustom2.getBackground());








        return listItemView;
    }
}
