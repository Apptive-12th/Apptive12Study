package com.example.webtoon;

import android.os.Build;
import android.provider.MediaStore;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import javax.xml.namespace.NamespaceContext;

public class MainActivity extends AppCompatActivity {
    TextView webtoon, best, play, my, setting;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;
    ArrayList<Pro> list = new ArrayList<Pro>();


    int[] IMAGES = {R.drawable.heart, R.drawable.world, R.drawable.cell, R.drawable.king, R.drawable.dream, R.drawable.hello,
            R.drawable.beautiful, R.drawable.onan, R.drawable.tomato, R.drawable.cartoon, R.drawable.coke, R.drawable.chat};

    String[] NAMES = {"마음의 소리", "소녀의 세계", "유미의 세포들", "복학왕", "꿈의 기업", "여신강림",
            "뷰티풀 군바리", "살인자o난감", "대학일기", "원주민 공포만화", "자판귀", "랜덤채팅의 그녀!"};

    String[] WEBTOONY = {"조석", "모랑지", "이동건", "기안84", "물음표",
            "에휴", "아아", "3인칭", "자까", "원주민", "하나", "둘"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new Pro(R.drawable.pro11));
        list.add(new Pro(R.drawable.pro22));
        list.add(new Pro(R.drawable.pro33));
        list.add(new Pro(R.drawable.pro33));
        list.add(new Pro(R.drawable.pro33));
        ProList flAdapter=new ProList(list);


        Log.d("헬로우",flAdapter.getCount()+"");
        ListView lv=this.findViewById(R.id.proro);
        lv.setAdapter(flAdapter);

        ListView listView=(ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(customAdapter);

        webtoon = (TextView)findViewById(R.id.webtoon);
        best = (TextView)findViewById(R.id.best);
        play = (TextView)findViewById(R.id.play);
        my = (TextView)findViewById(R.id.my);
        setting = (TextView)findViewById(R.id.setting);
        viewPager = (ViewPager)findViewById(R.id.fragment_container);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);

        webtoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(0);
            }
        });

        best.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(1);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(2);
            }
        });

        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(3);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(4);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

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

    private void onChangeTab(int position){

      if (position == 0)
      {
          webtoon.setTextSize(25);

          best.setTextSize(20);

          play.setTextSize(20);

          my.setTextSize(20);

          setting.setTextSize(20);
      }

        if (position == 1)
        {
            webtoon.setTextSize(20);

            best.setTextSize(25);

            play.setTextSize(20);

            my.setTextSize(20);

            setting.setTextSize(20);
        }

        if (position == 2)
        {
            webtoon.setTextSize(20);

            best.setTextSize(20);

            play.setTextSize(25);

            my.setTextSize(20);

            setting.setTextSize(20);
        }

        if (position == 3)
        {
            webtoon.setTextSize(20);

            best.setTextSize(20);

            play.setTextSize(20);

            my.setTextSize(25);

            setting.setTextSize(20);
        }

        if (position == 4)
        {
            webtoon.setTextSize(20);

            best.setTextSize(20);

            play.setTextSize(20);

            my.setTextSize(20);

            setting.setTextSize(25);
        }

    }



    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.fragment_webtoon,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
            TextView textView_name =(TextView)view.findViewById(R.id.textView_name);
            TextView textView_webtoony =(TextView)view.findViewById(R.id.textView3_webtoony);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_webtoony.setText(WEBTOONY[i]);


            return view;
        }
    }


}

