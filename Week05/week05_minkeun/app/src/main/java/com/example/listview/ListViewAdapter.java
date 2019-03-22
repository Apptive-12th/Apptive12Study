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
        personList.add(new Model(R.drawable.boy,"남자","야호1"));
        personList.add(new Model(R.drawable.girl,"여자","야호2"));
        personList.add(new Model(R.drawable.dog,"개","야호3"));
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

        ImageView img2 = view.findViewById(R.id.listviewImg2);
        TextView name2 = view.findViewById(R.id.listViewName2);
        TextView balloon2 = view.findViewById(R.id.listViewBalloon2);

        ImageView img3 = view.findViewById(R.id.listviewImg3);
        TextView name3 = view.findViewById(R.id.listViewName3);
        TextView balloon3 = view.findViewById(R.id.listViewBalloon3);

        Model model = personList.get(position);
        img.setImageResource(model.getImg());
        name.setText(model.getName());
        balloon.setText(model.getBalloon());

        Model model2 = personList.get(position);
        img2.setImageResource(model2.getImg());
        name2.setText(model2.getName());
        balloon2.setText(model2.getBalloon());

        Model model3 = personList.get(position);
        img3.setImageResource(model3.getImg());
        name3.setText(model3.getName());
        balloon3.setText(model3.getBalloon());

        return view;
    }
}
