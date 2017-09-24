package com.example.gagandeep.myapplication.List.List3;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gagandeep.myapplication.List.List3.Word;
import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

/**
 * Created by gagandeep on 8/30/17.
 */

public class WordAdapter extends ArrayAdapter<Word>{
    public  WordAdapter(Activity context, ArrayList<Word> Word){

        super(context, 0, Word);
    }
    @Override


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        View  listItemView = convertView;
        if (listItemView==null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list3, parent, false);

        Word currentWord = getItem(position);


        TextView head = listItemView.findViewById(R.id.head);
        head.setText(currentWord.getHead());

        TextView body = listItemView.findViewById(R.id.body);
        body.setText(currentWord.getBody());
        //return super.getView(position, convertView, parent);

        return listItemView;
    }
}
