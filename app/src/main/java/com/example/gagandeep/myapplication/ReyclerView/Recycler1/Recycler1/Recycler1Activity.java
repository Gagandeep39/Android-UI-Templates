package com.example.gagandeep.myapplication.ReyclerView.Recycler1.Recycler1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gagandeep.myapplication.R;

import java.util.ArrayList;

public class Recycler1Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler1);

        click();
    }

    private void click() {

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        ArrayList<Item2> item2 = new ArrayList<>();
        item2.add(new Item2(getString(R.string.steps)+ "1", "Create a java class and its adapter like custom list view"));
        item2.add(new Item2(getString(R.string.steps)+ "2", "Declare all th required variables in first java class in private"));
        item2.add(new Item2(getString(R.string.steps)+ "3", "Create a constructor of that class to get vales so that they can be stored in declared variables"));
        item2.add(new Item2(getString(R.string.steps)+ "4", "Create functions in public to return these stored vales"));
        item2.add(new Item2(getString(R.string.steps)+ "5", "Go to Adapter class"));
        item2.add(new Item2(getString(R.string.steps)+ "6", "Extent with RecyclerView.Adapter<class_nameAdapter.ViewHolder>"));
        item2.add(new Item2(getString(R.string.steps)+ "7", "create a new class within class as public class ViewHolder extends RecyclerView.ViewHolder"));
        item2.add(new Item2(getString(R.string.steps)+ "8", "Right-click on class declaration and generate a method, three functions will be created, onCreate, onBind, count"));
        item2.add(new Item2(getString(R.string.steps)+ "10", "Declare the variables that are to be written inside viewHolder class"));
        item2.add(new Item2(getString(R.string.steps)+ "9", "Write the findView lines for the items present in each item inside the ViewHolder function after that super line"));
        item2.add(new Item2(getString(R.string.steps)+ "11", "Right-click on this declaration and generate a method, three functions will be created"));
        item2.add(new Item2(getString(R.string.steps)+ "12", "declare a List<name_of_class_whose_adapter_is_created> and Context in private and then create a constructor by right-clicking on the main clas"));
        item2.add(new Item2(getString(R.string.steps)+ "13", "Inside onCreate method write :View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_xml, parent, false);\n" +
                " return new ViewHolder(v);"));
        item2.add(new Item2(getString(R.string.steps)+ "14", "Inside onBind function, class_without_Adaptername objectName = List<>itemObjectName.get(position)"));
        item2.add(new Item2(getString(R.string.steps)+ "15", "holder.head.setText(objectName.getFunction())"));
        item2.add(new Item2(getString(R.string.steps)+ "16", "Inside getItemCount return list<>Object.size()"));
        item2.add(new Item2(getString(R.string.steps)+ "17", "In the original class make a normal array list"));
        item2.add(new Item2(getString(R.string.steps)+ "18", "recyclerView = findViewById(R.id.xml_item_layout)"));
        item2.add(new Item2(getString(R.string.steps)+ "19", "recyclerView.setLayoutManager(new LayoutManager(this))"));
        item2.add(new Item2(getString(R.string.steps)+ "20", "Declare RecyclerView and RecyclerView.Adapter objects"));
        item2.add(new Item2(getString(R.string.steps)+ "21", "adapter_object = new class_name_adapter(object_name, activity_name)"));
        item2.add(new Item2(getString(R.string.steps)+ "22", "recyclerView.setAdapter(adapter_object)"));
        item2.add(new Item2("", ""));

        adapter = new Item2Adapter(item2, Recycler1Activity.this);
        recyclerView.setAdapter(adapter);

    }
}
