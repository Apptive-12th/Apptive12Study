package com.example.webtoon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProList extends BaseAdapter {
    ArrayList<Pro> pros;

    public ProList(ArrayList<Pro> pros) {
        this.pros = pros;
    }

    @Override
    public int getCount() {
        return pros.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context c=parent.getContext();


        View view = LayoutInflater.from(c).inflate(R.layout.pro,null,false);

        ImageView iv=view.findViewById(R.id.iv);

        Pro pro=pros.get(position);
        iv.setImageResource(pro.getD());
//        iv.setImageDrawable(pro.getD());
        return view;
    }
//
//    public void addpro(Drawable d){
//        Pro p=new Pro();
//
//        p.setD(d);
//
//        pros.add(p);
//
//        Log.d("현재 수",pros.size()+"");
//
//    }
}
