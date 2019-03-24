package com.example.friend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SQLiteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new SQLiteHelper(getApplicationContext(), "apptive.db", null, 1);
        helper.insert("김현지",24,"정치외교학과");
        helper.insert("정다원",25,"약학과");
        helper.insert("김동근",26,"컴퓨터공학과");
        helper.insert("뽀로로",21,"경영학과");
        helper.insert("이루피",22,"조경학과");
        helper.insert("이고잉",27,"기계공학과");
        helper.insert("마우스",23,"고고학과");
        helper.insert("남여리",26,"공공정책학부");
        helper.insert("키보드",24,"무역학부");
        helper.getResult();
    }
}
