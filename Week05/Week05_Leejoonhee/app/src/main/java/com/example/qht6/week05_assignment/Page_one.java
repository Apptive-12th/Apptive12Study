package com.example.qht6.week05_assignment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Page_one extends Fragment {


    public Page_one() {
    }
    ListView  listview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1_friend,null,false);
        FriendModel_Adapter adapter = new FriendModel_Adapter();
        listview = view.findViewById(R.id.testid);
        listview.setAdapter(adapter);
        return view;

    }

    public static Page_one newInstance(){

        Bundle lee = new Bundle();

        Page_one JoonHee = new Page_one();
        JoonHee.setArguments(lee);

        return JoonHee;
    }
}
