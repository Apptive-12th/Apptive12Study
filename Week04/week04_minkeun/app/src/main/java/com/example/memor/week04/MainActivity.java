package com.example.memor.week04;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //TextView textView;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*textView = findViewById(R.id.textView);

        textView.setText("반갑습니다.");
*/
        viewPager = findViewById(R.id.Viewpager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);

        TabLayout mTab = (TabLayout) findViewById(R.id.Tab1);
        mTab.setupWithViewPager(viewPager);



    }
    /*@Override
    protected void onStop() {
        super.onStop();
        textView.setText("하이요");

    }*/

}
