package com.example.practice0322;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    String sql;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        sql = "CREATE TABLE test ( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " name TEXT, age TEXT);";
        db.execSQL(sql);

        db.execSQL("INSERT INTO TEST VALUES(NULL, 'KIDSBEAR', '22');");
        db.execSQL("INSERT INTO TEST VALUES(NULL, 'KIDS', '12');");
        db.execSQL("INSERT INTO TEST VALUES(NULL, '키즈베어', '30');");
        db.execSQL("INSERT INTO TEST VALUES(NULL, '홍길동', '66');");
        db.execSQL("INSERT INTO TEST VALUES(NULL, '철수', '24');");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //버전이 업그레이드 됐을 경우 작업할 내용을 작성합니다.
    }

    public void insert(String name, String age ){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("INSERT INTO test VALUES(null,'"+name+"','"+ age +"')");
        db.close();
    }


}