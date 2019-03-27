package com.example.practice0322;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class fragment1 extends Fragment {


    ListView list;
    DBHelper dbHelper;
    SQLiteDatabase db;
    String sql;
    Cursor cursor;

    final static String dbName = "person.db";
    final static int dbVersion = 2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null, false);

        list = (ListView)view.findViewById(R.id.list);
        dbHelper = new DBHelper(getContext(), dbName, null, dbVersion);

        selectDB();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                cursor.moveToPosition(position);
                String str = cursor.getString(cursor.getColumnIndex("name"));
                Toast.makeText(getActivity().getApplicationContext(), str, Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }

    private void selectDB(){

        db = dbHelper.getWritableDatabase();
        sql = "SELECT * FROM test;";
        cursor = db.rawQuery(sql, null);
        if(cursor.getCount() > 0 ){

            getActivity().startManagingCursor(cursor);
            DBAdapter dbAdapter = new DBAdapter(getActivity(), cursor);
            list.setAdapter(dbAdapter);


        }

    }

}