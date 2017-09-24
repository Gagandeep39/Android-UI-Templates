package com.example.gagandeep.myapplication.List.Earthquake;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.gagandeep.myapplication.R;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter {
    private String LOCATOR = " of ";
    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.earth_list, parent, false);
        }
        //dont forget to type caste
        Earthquake earthquake = (Earthquake) getItem(position);
        Date date = new Date(earthquake.getMilliSecond());
        String formattedData = formatDate(date);
        String formattedTime = formatTime(date);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        String mag = decimalFormat.format(earthquake.getHead());

        TextView head, loc1, loc2 , day, time;
        String body1, body2;

        head = listItemView.findViewById(R.id.head);
        loc1 = listItemView.findViewById(R.id.body);
        loc2 = listItemView.findViewById(R.id.body2);
        day = listItemView.findViewById(R.id.date);
        time = listItemView.findViewById(R.id.time);





        String location = earthquake.getBody();
        if (location.contains(LOCATOR)){
            String parts[] = location.split(LOCATOR);
            body1 = parts[0] + LOCATOR;
            body2 = parts[1];
        }
        else{
            body1 = getContext().getString(R.string.near_the);
            body2 = location;
        }
        GradientDrawable drawable = (GradientDrawable)head.getBackground();
        int color = getMagnitudeColor(earthquake.getHead());
        drawable.setColor(color);

        loc1.setText(body1);
        loc2.setText(body2);
        head.setText(mag);
        //body.setText(earthquake.getBody());
        day.setText(formattedData);
        time.setText(formattedTime);







        return listItemView;

    }


    private int getMagnitudeColor(double head) {
        int setColorID;
        int magnitude = (int)Math.floor(head);
        switch (magnitude){
            case 0:
            case 1:
                setColorID = R.color.design_8;
            case 2:
                setColorID = R.color.design_7;
                break;
            case 3:
                setColorID = R.color.design_6;
                break;
            case 4:
                setColorID = R.color.design_5;
                break;
            case 5:
                setColorID = R.color.design_4;
                break;
            case 6:
                setColorID = R.color.design_3;
                break;
            case 7:
                setColorID = R.color.design_2;
                break;
            case 8:
                setColorID = R.color.design_1;
                break;
                default:
                    setColorID = R.color.design_0;
                    break;
        }
        return ContextCompat.getColor(getContext(), setColorID);
    }

    private String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, YYYY");
        return dateFormat.format(date);
    }

    private String formatTime(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        return  dateFormat.format(date);
    }
}
