package com.example.inohz.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PeopleListAdapter extends BaseAdapter {
    ArrayList<PeopleListContent> peopleListContentArrayList = new ArrayList<>();

    public PeopleListAdapter() {
    }

    @Override
    public int getCount() {
        return peopleListContentArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return peopleListContentArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.items_people, parent, false);
        }

        ImageView peopleFace = convertView.findViewById(R.id.people_face);
        TextView peopleName = convertView.findViewById(R.id.people_name);
        TextView peopleState = convertView.findViewById(R.id.people_state);

        PeopleListContent peopleListContent = peopleListContentArrayList.get(position);

        peopleFace.setImageResource(peopleListContent.getFace());
        peopleName.setText(peopleListContent.getUserName());
        peopleState.setText(peopleListContent.getUserState());

        return convertView;
    }

    public void addItem(int peopleFace, String peopleName, String peopleState) {
        PeopleListContent addPersonBox = new PeopleListContent(peopleFace, peopleName, peopleState);
        peopleListContentArrayList.add(addPersonBox);
    }
}
