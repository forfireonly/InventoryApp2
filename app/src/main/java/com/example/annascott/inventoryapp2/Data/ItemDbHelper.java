package com.example.annascott.inventoryapp2.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Database helper for Pets app. Manages database creation and version management.
 */
public class ItemDbHelper extends SQLiteOpenHelper {

    // Create a variable for database file name
    private static final String DATABASE_NAME = "inventory.db";

    // Create a variable for database version
    private static final int DATABASE_VERSION = 1;

    // Init the constructor
    public ItemDbHelper(Context context) {
        // Insert the database credential
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Overrid onCreate method
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a string variable for SQL statement
        // that create a new table in SQLite
        String SQL_CREATE_INVENTORY_TABLE = "CREATE TABLE "
                + ItemContract.ItemEntry.TABLE_NAME + " ("
                + ItemContract.ItemEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ItemContract.ItemEntry.COLUMN_ITEM_NAME + " TEXT NOT NULL, "
                + ItemContract.ItemEntry.COLUMN_ITEM_PRICE + "  TEXT NOT NULL, "
                + ItemContract.ItemEntry.COLUMN_ITEM_QUANTITY + " INTEGER NOT NULL DEFAULT 0, "
                + ItemContract.ItemEntry.COLUMN_ITEM_SUPPLIER +  " TEXT NOT NULL, "
                + ItemContract.ItemEntry.COLUMN_SUPPLIER_PHONE_NUMBER + " TEXT NOT NULL);";

        // Use execSQL to execute the SQL statement
        db.execSQL(SQL_CREATE_INVENTORY_TABLE);
    }
    // Overrid the onUpgrade method
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        /* Do the upgrade next (but skip for now)
        if (oldVersion < 2) {
        }
        */
    }
}
