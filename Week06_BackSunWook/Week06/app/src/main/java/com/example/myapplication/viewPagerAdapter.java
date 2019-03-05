package com.example.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

    fragment1 f1;
    fragment2 f2;
    fragment3 f3;
    fragment4 f4;
    fragment5 f5;
    fragment6 f6;
    fragment7 f7;
    fragment8 f8;
    fragment9 f9;


    public viewPagerAdapter(FragmentManager fm) {
        super(fm);

        f1=new fragment1();
        f2=new fragment2();
        f3=new fragment3();
        f4=new fragment4();
        f5=new fragment5();
        f6=new fragment6();
        f7=new fragment7();
        f8=new fragment8();
        f9=new fragment9();
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
        }else if(i==5){
            return f6;
        }else if(i==6){
            return f7;
        }else if(i==7){
            return f8;
        }else if(i==8){
            return f9;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 9;
    }

}


