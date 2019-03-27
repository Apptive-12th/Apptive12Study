package com.example.practice0322;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class fragment2 extends Fragment {
    DBHelper dbHelper;

    final static String dbName = "person.db";
    final static int dbVersion = 2;
    @Nullable
    @Override



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null, false);

        final EditText etName= (EditText)view.findViewById(R.id.name);
        final EditText etAge=(EditText)view.findViewById(R.id.age);

        dbHelper = new DBHelper(getContext(), dbName, null, dbVersion);



        Button insert = (Button)view.findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= etName.getText().toString();
                String age=etAge.getText().toString();
                dbHelper.insert(name,age);
            }
        });

        return view;
    }
}
