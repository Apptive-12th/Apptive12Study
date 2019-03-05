package com.example.listview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.Viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        TabLayout mTab = (TabLayout) findViewById(R.id.Tab1);
        mTab.setupWithViewPager(viewPager);

        /*ListView listView = findViewById(R.id.listView);
        ListViewAdapter adapter = new ListViewAdapter();
        listView.setAdapter(adapter);*/
    }


}
