package com.example.ljmpr.fragment_listview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int position) {
        if(position == 0) {
            return new FragmentFriends();
        }
        else if(position ==1) {
            return new FragmentChatting();
        }
        else if(position ==2) {
            return new FragmentPlus();
        }
        else if(position ==3) {
            return new FragmentMore();
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

