package com.example.week04_hyeonji;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {

    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        Fragment fragment = null;

        switch (i) {

            case 0:
                fragment = new Fragment_Friend();
                break;
            case 1:
                fragment = new Fragment_Chat();
                break;
            case 2:
                fragment = new Fragment_News();
                break;
            case 3:
                fragment = new Fragment_Game();
                break;
            case 4:
                fragment = new Fragment_Etc();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
}
