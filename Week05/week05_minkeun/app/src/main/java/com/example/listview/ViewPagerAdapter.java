package com.example.listview;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
//public Fragment getItem(~~):에는 프래그먼트를 반환을해줍니다.

public class ViewPagerAdapter extends FragmentPagerAdapter {

    fragment1 fragment1;
    fragment2 fragment2;
    fragment3 fragment3;
    fragment4 fragment4;
    fragment5 fragment5;
    /*
    // ViewPager에 들어갈 Fragment들을 담을 리스트
    private ArrayList<Fragment> fragments = new ArrayList<>();*/

    // 필수 생성자
    ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        fragment1 = new fragment1();
        fragment2 = new fragment2();
        fragment3 = new fragment3();
        fragment4 = new fragment4();
        fragment5 = new fragment5();
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return fragment1;
        } else if (i == 1) {
            return fragment2;
        } else if (i == 2) {
            return fragment3;
        } else if (i == 3) {
            return fragment4;
        } else if (i == 4) {
            return fragment5;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 :
                return "탭1" ;
            case 1 :
                return "탭2" ;
            case 2 :
                return "탭3" ;
            case 3 :
                return "탭4" ;
            case 4 :
                return "탭5" ;
            default:
                return null;
        }
    }

    /*// List에 Fragment를 담을 함수
    void addItem(Fragment fragment) {
        fragments.add(fragment);
    }*/

}

