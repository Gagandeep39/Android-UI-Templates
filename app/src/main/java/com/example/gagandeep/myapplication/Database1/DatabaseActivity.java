package com.example.gagandeep.myapplication.Database1;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gagandeep.myapplication.Database1.Data.Contract;
import com.example.gagandeep.myapplication.Database1.Data.DbHelper;
import com.example.gagandeep.myapplication.R;

public class DatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DatabaseActivity.this, EditorActivity.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.database_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.insert:
                insertPet();
                displayPet();
                break;
            default:
                Toast.makeText(this, "In Progress", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    private void displayPet() {
        DbHelper helper = new DbHelper(this);
        String projection[] = {Contract.Item._ID, Contract.Item.PET_NAME, Contract.Item.PET_BREED, Contract.Item.PET_WEIGHT};
        SQLiteDatabase database = helper.getReadableDatabase();
        Cursor cursor = getContentResolver().query(Contract.Item.CONTENT_URI, projection, null, null, null);
        TextView textView = findViewById(R.id.text);
        textView.setText("Lol");
        try {
            int idColumnIndex = cursor.getColumnIndex(Contract.Item._ID);
            int nameColumnIndex = cursor.getColumnIndex(Contract.Item.PET_NAME);
            int breedColumnIndex = cursor.getColumnIndex(Contract.Item.PET_BREED);
            int weightColumnIndex = cursor.getColumnIndex(Contract.Item.PET_WEIGHT);
            while (cursor.moveToNext()) {
                int currentId = cursor.getInt(idColumnIndex);
                String currentName = cursor.getString(nameColumnIndex);
                String currentBreed = cursor.getString(breedColumnIndex);
                int currentWeight = cursor.getInt(weightColumnIndex);
                textView.append("\nNumber : " + currentId
                        + "\nName : " + currentName
                        + "\nBreed : " + currentBreed
                        + "\nWeight : " + currentWeight
                        + "\n");
            }


        } finally {
            cursor.close();

        }
    }

    private void insertPet() {
        DbHelper helper = new DbHelper(this);
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Contract.Item.PET_NAME, "Tommy");
        values.put(Contract.Item.PET_BREED, "Pomeranian");
        values.put(Contract.Item.PET_WEIGHT, 20);
        Uri newUri = getContentResolver().insert(Contract.Item.CONTENT_URI, values);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        displayPet();
    }
}
