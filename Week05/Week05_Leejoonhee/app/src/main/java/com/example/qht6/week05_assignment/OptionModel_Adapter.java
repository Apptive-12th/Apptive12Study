package com.example.qht6.week05_assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qht6.week05_assignment.FriendList_Model;

import java.util.ArrayList;

public class OptionModel_Adapter extends BaseAdapter {


    ArrayList<OptionList_Model> personList = new ArrayList<OptionList_Model>();

    public OptionModel_Adapter() {

            personList.add(new OptionList_Model(R.drawable.gift, "선물하기"));
            personList.add(new OptionList_Model(R.drawable.shopping_cart,"쇼핑하기"));
            personList.add(new OptionList_Model(R.drawable.smiling_emoticon_square_face,"이모티콘"));

    }
    @Override
    public int getCount() {


        return 3;
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

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_option,null,false);

        ImageView name = view.findViewById(R.id.ListViewName);
        TextView balloon = view.findViewById(R.id.ListViewBalloon);

        OptionList_Model person = personList.get(position);
        name.setImageResource(person.getTitle());
        balloon.setText(person.getContents());

        return view;
    }// 어떤 모습으로 반환하는가 (position 몇번째 view/ convertview
}
