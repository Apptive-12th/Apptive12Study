package com.example.ljmpr.fragment_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FriendsAdapter extends BaseAdapter {

    private ArrayList<FriendsModel> friendsList = new ArrayList<FriendsModel>();

    public FriendsAdapter() {

    }

    @Override
    public int getCount() {
        return friendsList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.friends_item,parent,false);
        }

        TextView name = convertView.findViewById(R.id.listVIewName);
        TextView balloon = convertView.findViewById(R.id.listViewBalloon);
        ImageView img_friends = convertView.findViewById(R.id.listVIewImg);

        FriendsModel friendsModel = friendsList.get(position);
        name.setText(friendsModel.getName());
        balloon.setText(friendsModel.getBalloon());
        img_friends.setImageResource(friendsModel.getImg_friends());

        return convertView;
    }

    public void addItem (int img_friends, String name, String balloon) {
        FriendsModel model = new FriendsModel();

        model.setImg_friends(img_friends);
        model.setName(name);
        model.setBalloon(balloon);

        friendsList.add(model);
    }
}
