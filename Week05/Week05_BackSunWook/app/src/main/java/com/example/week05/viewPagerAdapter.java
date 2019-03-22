package com.example.week05;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

    fragment1 f1;
    fragment2 f2;
    fragment3 f3;
    fragment4 f4;


    public viewPagerAdapter(FragmentManager fm) {
        super(fm);

        f1=new fragment1();
        f2=new fragment2();
        f3=new fragment3();
        f4=new fragment4();
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return f1;

        }else if(i==1){
            return f2;
        }else if(i==2){
            return f3;
        }else if(i==3){
            return f4;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

}

