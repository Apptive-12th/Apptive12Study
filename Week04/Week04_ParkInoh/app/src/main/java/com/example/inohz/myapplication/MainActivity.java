package com.example.inohz.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mainViewPager;
    private static ImageButton top_button_search, top_button_add_people, top_button_settings;
    private static ImageButton tab_button_people, tab_button_chat, tab_button_sharp, tab_button_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewPager = findViewById(R.id.viewPager_main);
        ViewPagerAdapter mainViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mainViewPager.setAdapter(mainViewPagerAdapter);
        mainViewPager.setCurrentItem(0);

        //하단 탭 4개 버튼들
        tab_button_people = (ImageButton) findViewById(R.id.image_button_people);
        tab_button_chat = (ImageButton) findViewById(R.id.image_button_chat);
        tab_button_sharp = (ImageButton) findViewById(R.id.image_button_sharp);
        tab_button_more = (ImageButton) findViewById(R.id.image_button_more);

        //기능 미구현 버튼들
        top_button_search = (ImageButton) findViewById(R.id.image_button_search);
        top_button_add_people = (ImageButton) findViewById(R.id.image_button_add_people);
        top_button_settings = (ImageButton) findViewById(R.id.image_button_settings);

        tab_button_people.setOnClickListener(this);
        tab_button_chat.setOnClickListener(this);
        tab_button_sharp.setOnClickListener(this);
        tab_button_more.setOnClickListener(this);

        /*기능 미구현 리스너
        top_button_search.setOnClickListener(this);
        top_button_add_people.setOnClickListener(this);
        top_button_settings.setOnClickListener(this);
        */
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_button_people:
                mainViewPager.setCurrentItem(0);
                break;
            case R.id.image_button_chat:
                mainViewPager.setCurrentItem(1);
                break;
            case R.id.image_button_sharp:
                mainViewPager.setCurrentItem(2);
                break;
            case R.id.image_button_more:
                mainViewPager.setCurrentItem(3);
                break;
        }
    }
}
