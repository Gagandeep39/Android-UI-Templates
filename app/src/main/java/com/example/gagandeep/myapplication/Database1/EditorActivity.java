package com.example.gagandeep.myapplication.Database1;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.gagandeep.myapplication.Database1.Data.Contract;
import com.example.gagandeep.myapplication.R;

public class EditorActivity extends AppCompatActivity {
    EditText editTextName, editTextBreed, editTextWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        finding();
        FloatingActionButton button = findViewById(R.id.FAB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertPet();
                finish();
            }
        });


    }

    private void finding() {
        editTextName = findViewById(R.id.editTextName);
        editTextBreed = findViewById(R.id.editTextBreed);
        editTextWeight = findViewById(R.id.editTextWeight);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.database_insert_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.done: {
                insertPet();
                finish();
            }
        }
        return true;
    }

    private void insertPet() {
        String name = editTextName.getText().toString().trim();
        String breed = editTextBreed.getText().toString().trim();
        String weight = editTextWeight.getText().toString().trim();
        int w = Integer.parseInt(weight);
        ContentValues values = new ContentValues();
        values.put(Contract.Item.PET_NAME, name);
        values.put(Contract.Item.PET_BREED, breed);
        values.put(Contract.Item.PET_WEIGHT, weight);

        Uri newUri = getContentResolver().insert(Contract.Item.CONTENT_URI, values);
    }
}
