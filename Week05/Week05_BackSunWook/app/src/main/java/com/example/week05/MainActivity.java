package com.example.week05;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.man);
        tabLayout.getTabAt(1).setIcon(R.drawable.balloon);
        tabLayout.getTabAt(2).setIcon(R.drawable.shayp);
        tabLayout.getTabAt(3).setIcon(R.drawable.jum);




    }
}
