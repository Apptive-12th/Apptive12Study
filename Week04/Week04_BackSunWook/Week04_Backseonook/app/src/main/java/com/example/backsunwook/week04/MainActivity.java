package com.example.backsunwook.week04;

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

        viewpager = findViewById(R.id.viewpager);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());

        viewpager.setAdapter(viewPagerAdapter);

        TabLayout tabLayout =findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewpager);


    }
}
