package com.example.ljmpr.viewpagertablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new FragmentOne();
        }
        else if(position==1) {
            return new FragmentTwo();
        }
        else if(position==2) {
            return new FragmentThree();
        }
        else if(position==3) {
            return new FragmentFour();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
