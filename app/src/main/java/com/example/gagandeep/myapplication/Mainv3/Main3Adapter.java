package com.example.gagandeep.myapplication.Mainv3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gagandeep.myapplication.BottomActivity;
import com.example.gagandeep.myapplication.Calculator.CalculatorActivity;
import com.example.gagandeep.myapplication.EmptyActivity.EmptyActivity;
import com.example.gagandeep.myapplication.HowtoActivity;
import com.example.gagandeep.myapplication.List.Earthquake.EarthquakeActivity;
import com.example.gagandeep.myapplication.List.List2Activity;
import com.example.gagandeep.myapplication.List.List3.List3Activity;
import com.example.gagandeep.myapplication.List.List4.List4Activity;
import com.example.gagandeep.myapplication.List.List5.List5Activity;
import com.example.gagandeep.myapplication.List.ListActivity;
import com.example.gagandeep.myapplication.MainActivityOld;
import com.example.gagandeep.myapplication.Mainv2Activity.MainActivity;
import com.example.gagandeep.myapplication.Media.MediaActivity;
import com.example.gagandeep.myapplication.Notification.NotificationActivity;
import com.example.gagandeep.myapplication.R;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler1.Recycler1Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler2.Recycler2Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler3.ScrollingActivity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler4.Recycler4Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler5Activity.Recycler5Activity;
import com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler6.Recycler6Activity;
import com.example.gagandeep.myapplication.TabbedActivity.Bottom2Activity;
import com.example.gagandeep.myapplication.TabbedActivity.Tabbed2Activity;
import com.example.gagandeep.myapplication.TabbedActivity.Tabbed3Activity;
import com.example.gagandeep.myapplication.TabbedActivity.TabbedActivity;

import java.util.List;

/**
 * Created by gagandeep on 9/11/17.
 */

public class Main3Adapter extends RecyclerView.Adapter<Main3Adapter.ViewHolder> {


    private List<Main3> main3s;
    private Context context;

    public Main3Adapter(List<Main3> main3s, Context context) {
        this.main3s = main3s;
        this.context = context;
    }

    @Override
    public Main3Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_5, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Main3Adapter.ViewHolder holder, final int position) {
        Main3 getMain3 = main3s.get(position);
        holder.head.setText(getMain3.getHead());
        holder.body.setText(getMain3.getBody());
        holder.resourceId.setImageResource(getMain3.getResourceId());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (position){

                    case 0:
                        context.startActivity(new Intent(context, CalculatorActivity.class));
                        break;
                    case 1:
                        context.startActivity(new Intent(context, MediaActivity.class));
                        break;
                    case 2:
                        context.startActivity(new Intent(context, ListActivity.class));
                        break;
                    case 3:
                        context.startActivity(new Intent(context, List2Activity.class));
                        break;
                    case 4:
                        context.startActivity(new Intent(context, List3Activity.class));
                        break;
                    case 5:
                        context.startActivity(new Intent(context, List4Activity.class));
                        break;
                    case 6:
                        context.startActivity(new Intent(context, List5Activity.class));
                        break;
                    case 7:
                        context.startActivity(new Intent(context, Recycler1Activity.class));
                        break;
                    case 8:
                        context.startActivity(new Intent(context, Recycler2Activity.class));
                        break;
                    case 9:
                        context.startActivity(new Intent(context, ScrollingActivity.class));
                        break;
                    case 10:
                        context.startActivity(new Intent(context, Recycler4Activity.class));
                        break;
                    case 11:
                        context.startActivity(new Intent(context, Recycler5Activity.class));
                        break;
                    case 12:
                        context.startActivity(new Intent(context, Recycler6Activity.class));
                        break;
                    case 13:
                        context.startActivity(new Intent(context, MainActivityOld.class));
                        break;
                    case 14:
                        context.startActivity(new Intent(context, MainActivity.class));
                        break;
                    case 15:
                        context.startActivity(new Intent(context, EmptyActivity.class));
                        break;
                    case 16:
                        context.startActivity(new Intent(context, TabbedActivity.class));
                        break;
                    case 17:
                        context.startActivity(new Intent(context, Tabbed2Activity.class));
                        break;
                    case 18:
                        context.startActivity(new Intent(context, BottomActivity.class));
                        break;
                    case 19:
                        context.startActivity(new Intent(context, Bottom2Activity.class));
                        break;
                    case 20:
                        context.startActivity(new Intent(context, Tabbed3Activity.class));
                        break;
                    case 21:
                        context.startActivity(new Intent(context, EarthquakeActivity.class));
                        break;
                    case 22:
                        context.startActivity(new Intent(context, HowtoActivity.class));
                        break;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return main3s.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView head, body;
        ImageView resourceId;
        CardView cardView;


        public ViewHolder(View itemView) {
            super(itemView);
            head = itemView.findViewById(R.id.head);
            body = itemView.findViewById(R.id.body);
            resourceId = itemView.findViewById(R.id.image1);
            cardView = itemView.findViewById(R.id.card);
        }
    }




}
