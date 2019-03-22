package com.example.myapplication;

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
        View view = inflater.inflate(R.layout.fragment1,null,false);

        ListViewAdapter adapter = new ListViewAdapter();
        ListView listView = (ListView)view.findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.webtoon1),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon2),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon3),"헬퍼","외모지상주의","목욕의신");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.webtoon4),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon5),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon6),"마음의소리","신암행어사","복학왕");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.webtoon7),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon8),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon9),"여신강림","놓지마 정신줄","대학일기");
        adapter.addItem(ContextCompat.getDrawable(getActivity(),R.drawable.webtoon10),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon11),ContextCompat.getDrawable(getActivity(),R.drawable.webtoon12),"기기괴괴","연애혁명","프리드로우");


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strText = (String) parent.getItemAtPosition(position);
            }
        });

        return view;
    }



}
