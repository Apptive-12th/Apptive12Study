package com.example.qht6.week05_assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qht6.week05_assignment.FriendList_Model;

import java.util.ArrayList;

public class FriendModel_Adapter extends BaseAdapter {


    ArrayList<FriendList_Model> personList = new ArrayList<FriendList_Model>();

    public FriendModel_Adapter() {

        for(int i =0 ; i < 3; i++){

            personList.add(new FriendList_Model(R.drawable.person, "앱티브","집가고 싶다"));
            personList.add(new FriendList_Model(R.drawable.person, "앱티브2","카레먹고 싶다"));
            personList.add(new FriendList_Model(R.drawable.person, "앱티브3","알바하기 싫다"));

        }

    }
    @Override
    public int getCount() {


        return personList.size();
    }// 몇개를 출력할 것인가

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

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_friend,null,false);

        TextView name = view.findViewById(R.id.ListViewName);
        TextView balloon = view.findViewById(R.id.ListViewBalloon);
        ImageView img = view.findViewById(R.id.LisViewImg);

        FriendList_Model person = personList.get(position);
        name.setText(person.getName());
        balloon.setText(person.getBalloon());
        img.setImageResource(person.getImageresource());

        return view;
    }// 어떤 모습으로 반환하는가 (position 몇번째 view/ convertview
}
