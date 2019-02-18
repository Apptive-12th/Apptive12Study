package com.example.qht6.week04_last;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewpager = findViewById(R.id.vIewpAger);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        TabLayout mtab = (TabLayout)findViewById(R.id.tabs);
        mtab.setupWithViewPager(viewpager);

        viewpager.setAdapter(viewPagerAdapter);

    }
}
