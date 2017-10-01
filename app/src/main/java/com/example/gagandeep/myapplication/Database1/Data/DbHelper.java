package com.example.gagandeep.myapplication.Database1.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gagandeep on 10/2/17.
 */

public class DbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "database1.db";
    public static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE " + Contract.Item.TABLE_NAME + " ("
                + Contract.Item._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Contract.Item.PET_NAME + " TEXT, "
                + Contract.Item.PET_BREED + " INTEGER, "
                + Contract.Item.PET_WEIGHT + " INTEGER);";
        sqLiteDatabase.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
