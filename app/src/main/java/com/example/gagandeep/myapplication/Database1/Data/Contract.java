package com.example.gagandeep.myapplication.Database1.Data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by gagandeep on 10/2/17.
 */

public class Contract {
    public static final String CONTENT_AUTHORITY = "com.example.gagandeep.myapplication";
    public static final Uri BASE_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String ITEM_PATH = "Pets";

    public Contract() {
    }

    public static final class Item implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_URI, ITEM_PATH);
        public static final String _ID = BaseColumns._ID;
        public static final String TABLE_NAME = "Pets";
        public static final String PET_NAME = "name";
        public static final String PET_BREED = "breed";
        public static final String PET_WEIGHT = "weight";
    }
}
