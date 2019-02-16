package com.example.myapplication66;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);

        KakaopagerAdapter adapter = new KakaopagerAdapter(getSupportFragmentManager());

        fragment1 fragment1 = new fragment1();
        adapter.addItem(fragment1);

        fragment2 fragment2 = new fragment2();
        adapter.addItem(fragment2);

        fragment3 fragment3 = new fragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);

    }
    class KakaopagerAdapter extends FragmentStatePagerAdapter {

        ArrayList<Fragment> items = new ArrayList<Fragment>();
        public KakaopagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public  void addItem(Fragment item){
            items.add(item);
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }
    }
}
