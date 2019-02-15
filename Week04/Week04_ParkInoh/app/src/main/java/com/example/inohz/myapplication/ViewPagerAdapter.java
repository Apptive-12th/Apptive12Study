package com.example.inohz.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.TextView;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ViewPagerFragment_01();
            case 1:
                return new ViewPagerFragment_02();
            case 2:
                return new ViewPagerFragment_03();
            case 3:
                return new ViewPagerFragment_04();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
