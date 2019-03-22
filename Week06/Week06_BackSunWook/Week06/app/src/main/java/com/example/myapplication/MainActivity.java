package com.example.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ViewPager viewPager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager1= findViewById(R.id.viewpager1);
        viewPagerAdapter1 viewPagerAdapter1=new viewPagerAdapter1(getSupportFragmentManager());

        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(viewPagerAdapter);
        viewPager1.setAdapter(viewPagerAdapter1);

        TabLayout tabLayout1= findViewById(R.id.tab2);
        tabLayout1.setupWithViewPager(viewPager1);

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);



        tabLayout.getTabAt(0).setText("월");
        tabLayout.getTabAt(1).setText("화");
        tabLayout.getTabAt(2).setText("수");
        tabLayout.getTabAt(3).setText("목");
        tabLayout.getTabAt(4).setText("금");
        tabLayout.getTabAt(5).setText("토");
        tabLayout.getTabAt(6).setText("일");
        tabLayout.getTabAt(7).setText("신작");
        tabLayout.getTabAt(8).setText("완결");

        tabLayout1.getTabAt(0).setText("웹툰");
        tabLayout1.getTabAt(1).setText("베스트   도전");
        tabLayout1.getTabAt(2).setText("PLAY");
        tabLayout1.getTabAt(3).setText("MY");
        tabLayout1.getTabAt(4).setText("설정");
    }
}
