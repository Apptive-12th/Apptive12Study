package com.example.week05;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1,null,false);

        ListViewAdapter adapter = new ListViewAdapter();
        ListView listView = (ListView)view.findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man1),"백선욱");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man2),"친구1");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man3),"친구2");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man4),"엄마");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man5),"아빠");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man6),"동생");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man7),"친구3");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man8),"친구4");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man9),"친구5");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man10),"친구6");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man11),"친구7");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man3),"친구8");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man5),"친구9");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.man1),"친구10");




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strText = (String) parent.getItemAtPosition(position);
            }
        });

        return view;
    }
}
