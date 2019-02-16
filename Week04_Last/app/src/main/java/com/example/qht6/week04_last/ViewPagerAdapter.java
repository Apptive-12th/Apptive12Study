package com.example.qht6.week04_last;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class ViewPagerAdapter extends FragmentPagerAdapter {

    fragment1 fragment1;
    fragment2 fragment2;
    fragment3 fragment3;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return fragment1.newInstance();
            case 1:
                return fragment2.newInstance();
            case 2:
                return fragment3.newInstance();
                default:
                    return null;
        }
            }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "친구";
            case 1:
                return "채팅방";
                case 2:
            return "더보기";

            default:
                return null;
        }
    }
}
