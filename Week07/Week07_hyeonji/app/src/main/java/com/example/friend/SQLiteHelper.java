package com.example.friend;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SQLiteHelper extends SQLiteOpenHelper {

    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE list (name TEXT, age INTEGER, major INTERGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String name, int age, int major) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO list VALUES('"+name+"','"+age+"','"+major+"');");

    }

    public void getResult() {

        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT * FROM list", null);
        while (cursor.moveToNext()) {
            String name = cursor.getString(0);
            int age = cursor.getInt(1);
            int major = cursor.getInt(2);

            Log.e("친구", "이름:" + name + "나이:" + age + "전공:" + major);
            Log.e("친구", "이름:" + name + "나이:" + age + "전공:" + major);
            Log.e("친구", "이름:" + name + "나이:" + age + "전공:" + major);
        }


    }
}
