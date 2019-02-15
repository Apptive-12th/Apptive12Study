package com.apptive12th.katok;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView friends,chat,news,more;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        friends = (TextView)findViewById(R.id.friends);
        chat= (TextView)findViewById(R.id.chat);
        news = (TextView)findViewById(R.id.news);
        more = (TextView)findViewById(R.id.more);
        viewPager = (ViewPager)findViewById(R.id.fragment_container);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);

        friends.setOnClickListener(new View.OnClickListener() {
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

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(3);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @TargetApi(Build.VERSION_CODES.M)
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {

                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }



        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {

        if (position == 0)
        {
            friends.setTextSize(25);
            friends.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.light_color));

            more.setTextSize(20);
            more.setTextColor(getColor(R.color.light_color));

        }

        if (position == 1)
        {
            friends.setTextSize(20);
            friends.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.bright_color));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.light_color));

            more.setTextSize(20);
            more.setTextColor(getColor(R.color.light_color));

        }

        if (position == 2)
        {
            friends.setTextSize(20);
            friends.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            news.setTextSize(25);
            news.setTextColor(getColor(R.color.bright_color));

            more.setTextSize(20);
            more.setTextColor(getColor(R.color.light_color));

        }

        if (position == 3)
        {
            friends.setTextSize(20);
            friends.setTextColor(getColor(R.color.light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));

            news.setTextSize(20);
            news.setTextColor(getColor(R.color.light_color));

            more.setTextSize(25);
            more.setTextColor(getColor(R.color.bright_color));

        }
    }


}
