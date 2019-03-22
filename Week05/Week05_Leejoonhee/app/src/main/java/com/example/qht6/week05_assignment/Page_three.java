package com.example.qht6.week05_assignment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Page_three extends Fragment {

    ListView  listview;

    public Page_three() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment3_option,null,false);
        OptionModel_Adapter adapter = new OptionModel_Adapter();
        listview = view.findViewById(R.id.option);
        listview.setAdapter(adapter);
        return view;

    }

    public static Page_three newInstance(){

        Bundle lee = new Bundle();

        Page_three JoonHee = new Page_three();
        JoonHee.setArguments(lee);

        return JoonHee;
    }
}
