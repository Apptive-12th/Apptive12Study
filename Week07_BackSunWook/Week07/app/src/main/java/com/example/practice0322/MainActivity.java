package com.example.practice0322;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    DBHelper dbHelper;

    final static String dbName = "person.db";
    final static int dbVersion = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this, dbName, null, dbVersion);

        viewPager=findViewById(R.id.viewpager);
        viewPagerAdapter viewPagerAdapter= new viewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);

        /*for(int i=0;i<3;i++) {
            String name = "man";
            String age = "27";
            dbHelper.insert(name, age);
        }*/
        //앱이 실행할때마다 친구를 3명씩 추가하는 코드여서 일부러 주석처리를 해놓았습니다.

        TabLayout tabLayout= findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.man);
        tabLayout.getTabAt(1).setIcon(R.drawable.balloon);
        tabLayout.getTabAt(2).setIcon(R.drawable.shayp);
        tabLayout.getTabAt(3).setIcon(R.drawable.jum);







    }
}
