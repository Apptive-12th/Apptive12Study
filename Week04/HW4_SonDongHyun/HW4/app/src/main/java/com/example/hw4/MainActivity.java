package com.example.hw4;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView camera,chat,status,call;
    ViewPager ViewPager;
    PagerViewAdapter PagerViewAdapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera = (TextView)findViewById(R.id.camera);
        chat = (TextView)findViewById(R.id.chat);
        status = (TextView)findViewById(R.id.status);
        call = (TextView)findViewById(R.id.call);
        ViewPager = (ViewPager)findViewById(R.id.fragment_container);
        PagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

//        listViewAdapter adapter = new listViewAdapter();
//        listView = findViewById(R.id.listView);
//        listView.setAdapter(adapter);                  여기부분 3줄주석을 풀면 앱이 작동이 안되고 터져버립니다


        ViewPager.setAdapter(PagerViewAdapter);


        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewPager.setCurrentItem(0);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewPager.setCurrentItem(1);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewPager.setCurrentItem(2);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewPager.setCurrentItem(3);
            }
        });



        ViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

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
        if(position == 0)
        {
            camera.setTextSize(22);
            camera.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.Light_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.Light_color));


            call.setTextSize(20);
            call.setTextColor(getColor(R.color.Light_color));

        }
        if(position == 1)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.Light_color));

            chat.setTextSize(22);
            chat.setTextColor(getColor(R.color.bright_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.Light_color));


            call.setTextSize(20);
            call.setTextColor(getColor(R.color.Light_color));

        }
        if(position == 2)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.Light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.Light_color));

            status.setTextSize(22);
            status.setTextColor(getColor(R.color.bright_color));


            call.setTextSize(20);
            call.setTextColor(getColor(R.color.Light_color));

        }
        if(position == 3)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.Light_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.Light_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.Light_color));


            call.setTextSize(22);
            call.setTextColor(getColor(R.color.bright_color));

        }
    }
}
