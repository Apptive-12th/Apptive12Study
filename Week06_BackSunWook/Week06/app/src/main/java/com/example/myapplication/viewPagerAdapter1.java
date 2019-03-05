package com.example.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class viewPagerAdapter1 extends FragmentPagerAdapter {

    fragment14 f1;
    fragment10 f2;
    fragment11 f3;
    fragment12 f4;
    fragment13 f5;

    public viewPagerAdapter1(FragmentManager fm) {
        super(fm);

        f1= new fragment14();
        f2= new fragment10();
        f3= new fragment11();
        f4= new fragment12();
        f5= new fragment13();
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
        }else if(i==4){
            return f5;
        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
