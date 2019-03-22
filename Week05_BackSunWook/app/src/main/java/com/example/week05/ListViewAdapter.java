package com.example.week05;

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

        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.icon);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.text1);


        ListViewItem listViewItme = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItme.getIcon());
        titleTextView.setText(listViewItme.getTitle());


        return convertView;
    }
    public void addItem(Drawable icon, String title){
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);

        listViewItemList.add(item);
    }
}

