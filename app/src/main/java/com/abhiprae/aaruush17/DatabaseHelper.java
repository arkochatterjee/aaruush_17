package com.abhiprae.aaruush17;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import Model.User;

/**
 * Created by sarthak on 11/9/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "aaruush";

    // Table Names
    private static final String TABLE_USER= "user";

    // Common column names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_BALANCE = "balance";
    private static final String KEY_ASSET = "asset";

    // Table Create Statements
    // Contacts table create statement
    private static final String CREATE_TABLE_USER = "CREATE TABLE "
            + TABLE_USER + "("+ KEY_ID +" INTEGER,"+  KEY_NAME + " TEXT," + KEY_EMAIL
            +" TEXT," + KEY_PHONE + " TEXT,"
            + KEY_PASSWORD + " TEXT," + KEY_BALANCE + " INTEGER,"+
            KEY_ASSET+ " INTEGER " +")";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_USER);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        onCreate(db);
    }
    //creating user

    public void createUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, user.getId());
        values.put(KEY_NAME, user.getName());
        values.put(KEY_EMAIL, user.getEmail());
        values.put(KEY_PHONE, user.getPhone());
        values.put(KEY_PASSWORD, user.getPassword());
        values.put(KEY_BALANCE, user.getBalance());
        values.put(KEY_ASSET, user.getAsset());
        // insert row
        db.insert(TABLE_USER, null, values);
    }

    /*
 * getting users
 * */
    public ArrayList<User> getUser() {
        ArrayList<User> users = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_USER;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                User td = new User();
                td.setId((c.getInt(c.getColumnIndex(KEY_ID))));
                td.setName(c.getString((c.getColumnIndex(KEY_NAME))));
                td.setEmail((c.getString(c.getColumnIndex(KEY_EMAIL))));
                td.setPhone((c.getString(c.getColumnIndex(KEY_PHONE))));
                td.setPassword((c.getString(c.getColumnIndex(KEY_PASSWORD))));
                td.setBalance((c.getDouble(c.getColumnIndex(KEY_BALANCE))));
                td.setAsset((c.getDouble(c.getColumnIndex(KEY_ASSET))));
                // adding to todo list
                users.add(td);
            } while (c.moveToNext());
        }
        return users;
    }

    /*
     * Deleting a user
     */

    public void deleteContact() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+TABLE_USER);
    }

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}