package com.example.listview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    ArrayList<Model> personList;

    public ListViewAdapter() {

        personList=new ArrayList<Model>();

        for(int i=0;i<3; i++){
        personList.add(new Model(R.drawable.boy,"앱티브 남자","아 신난다."));
        personList.add(new Model(R.drawable.girl,"앱티브 여자","재미난다."));
        personList.add(new Model(R.drawable.dog,"개","댕댕"));
        }
    }

    @Override
    public int getCount() {
        return personList.size();
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item,null,false);
        ImageView img = view.findViewById(R.id.listviewImg);
        TextView name = view.findViewById(R.id.listViewName);
        TextView balloon = view.findViewById(R.id.listViewBalloon);

        Model model = personList.get(position);
        img.setImageResource(model.getImg());
        name.setText(model.getName());
        balloon.setText(model.getBalloon());

        return view;
    }
}
