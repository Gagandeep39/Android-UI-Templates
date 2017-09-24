package com.example.gagandeep.myapplication.Mainv2Activity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

/**
 * Created by gagandeep on 8/31/17.
 */

public class MainAdapter extends ArrayAdapter{

    public MainAdapter(Activity context, ArrayList<Main> Main){

        super(context, 0, Main);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;


        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.main, parent, false);
        }

        Main currentMain = (Main) getItem(position);
        TextView textView = listItemView.findViewById(R.id.title);
        textView.setText(currentMain.getText());

        ConstraintLayout constraintLayout = listItemView.findViewById(R.id.custom_background);
        constraintLayout.setBackgroundResource(currentMain.getBackground());

//Always write this return statement at last
        return listItemView;

    }
}
