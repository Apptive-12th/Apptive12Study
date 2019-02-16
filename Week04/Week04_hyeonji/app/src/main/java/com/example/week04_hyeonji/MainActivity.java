package com.example.week04_hyeonji;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView friend,chat,news,game,etc;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friend = (TextView) findViewById(R.id.friend);
        chat = (TextView)findViewById(R.id.chat);
        news = (TextView)findViewById(R.id.news);
        game = (TextView)findViewById(R.id.game);
        etc = (TextView)findViewById(R.id.etc);
        viewPager = (ViewPager)findViewById(R.id.fragment_container);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);

        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(0);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(1);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(2);
            }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(3);
            }
        });

        etc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(4);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                onChangeTab(i);

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int i) {

        if (i == 0)
        {
            friend.setTextSize(25);
            friend.setTextColor(getColor(R.color.white));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.kakaotext));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.kakaotext));

            game.setTextSize(20);
            game.setTextColor(getColor(R.color.kakaotext));

            etc.setTextSize(20);
            etc.setTextColor(getColor(R.color.kakaotext));
        }
        if (i == 1)
        {
            friend.setTextSize(20);
            friend.setTextColor(getColor(R.color.kakaotext));

            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.white));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.kakaotext));

            game.setTextSize(20);
            game.setTextColor(getColor(R.color.kakaotext));

            etc.setTextSize(20);
            etc.setTextColor(getColor(R.color.kakaotext));
        }
        if (i == 2)
        {
            friend.setTextSize(20);
            friend.setTextColor(getColor(R.color.kakaotext));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.kakaotext));

            news.setTextSize(25);
            news.setTextColor(getColor(R.color.white));

            game.setTextSize(20);
            game.setTextColor(getColor(R.color.kakaotext));

            etc.setTextSize(20);
            etc.setTextColor(getColor(R.color.kakaotext));
        }
        if (i == 3)
        {
            friend.setTextSize(20);
            friend.setTextColor(getColor(R.color.kakaotext));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.kakaotext));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.kakaotext));

            game.setTextSize(25);
            game.setTextColor(getColor(R.color.white));

            etc.setTextSize(20);
            etc.setTextColor(getColor(R.color.kakaotext));
        }
        if (i == 4)
        {
            friend.setTextSize(20);
            friend.setTextColor(getColor(R.color.kakaotext));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.kakaotext));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.kakaotext));

            game.setTextSize(20);
            game.setTextColor(getColor(R.color.kakaotext));

            etc.setTextSize(25);
            etc.setTextColor(getColor(R.color.white));
        }
        }

    }


