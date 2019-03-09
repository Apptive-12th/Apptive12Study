package com.example.webtoon;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProList extends BaseAdapter {
    ArrayList<Pro> pros=new ArrayList<>();

    @Override
    public int getCount() {
        return pros.size();
    }

    @Override
    public Object getItem(int position) {
        return pros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context c=ViewGroup.getContext();
        if(View==null){
            LayoutInflater li=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View=li.inflate(R.layout.pro,ViewGroup, false);
        }

        ImageView iv=View.findViewById(R.id.imageView);

        Pro pro=pros.get(position);

        iv.setImageDrawable(pro.getD());

        return View;
    }
    public void addpro(Drawable d){
        pros p=new Pro();

        ((Pro) p).setD();

        pros.add(p);

    }
}
