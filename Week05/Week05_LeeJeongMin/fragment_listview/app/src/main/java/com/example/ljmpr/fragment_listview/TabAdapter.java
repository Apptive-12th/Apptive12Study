package com.example.ljmpr.fragment_listview;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> FragmentList = new ArrayList<>();
    private final List<String> FragmentTitleList = new ArrayList<>();

    public TabAdapter (FragmentManager fm) {
        super(fm);
    }

    public void addFragment (Fragment fragment, String title) {
        FragmentList.add(fragment);
        FragmentTitleList.add(title);
    }

    @Override
    public Fragment getItem (int position) {
        return FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return FragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle (int position) {
        return FragmentTitleList.get(position);
    }
}
