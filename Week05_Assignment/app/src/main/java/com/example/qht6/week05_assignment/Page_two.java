package com.example.qht6.week05_assignment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Page_two extends Fragment {

    ListView  listview;

    public Page_two() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2_chatting,null,false);
        FriendModel_Adapter adapter = new FriendModel_Adapter();
        listview = view.findViewById(R.id.chatting);
        listview.setAdapter(adapter);
        return view;

    }

    public static Page_two newInstance(){

        Bundle lee = new Bundle();

        Page_two JoonHee = new Page_two();
        JoonHee.setArguments(lee);

        return JoonHee;
    }
}
