package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<>();

    public ListViewAdapter(){}


    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview,parent,false);
        }

        ImageView iconImageView1 = (ImageView) convertView.findViewById(R.id.icon1);
        ImageView iconImageView2 = (ImageView) convertView.findViewById(R.id.icon2);
        ImageView iconImageView3 = (ImageView) convertView.findViewById(R.id.icon3);
        TextView titleTextview1=(TextView) convertView.findViewById(R.id.text1);
        TextView titleTextview2=(TextView) convertView.findViewById(R.id.text2);
        TextView titleTextview3=(TextView) convertView.findViewById(R.id.text3);




        ListViewItem listViewItme = listViewItemList.get(position);

        iconImageView1.setImageDrawable(listViewItme.getIcon1());
        iconImageView2.setImageDrawable(listViewItme.getIcon2());
        iconImageView3.setImageDrawable(listViewItme.getIcon3());
        titleTextview1.setText(listViewItme.getTitle1());
        titleTextview2.setText(listViewItme.getTitle2());
        titleTextview3.setText(listViewItme.getTitle3());



        return convertView;
    }
    public void addItem(Drawable icon1, Drawable icon2, Drawable icon3, String title1, String title2, String title3){
        ListViewItem item = new ListViewItem();

        item.setIcon1(icon1);
        item.setIcon2(icon2);
        item.setIcon3(icon3);
        item.setTitle1(title1);
        item.setTitle2(title2);
        item.setTitle3(title3);


        listViewItemList.add(item);
    }
}
