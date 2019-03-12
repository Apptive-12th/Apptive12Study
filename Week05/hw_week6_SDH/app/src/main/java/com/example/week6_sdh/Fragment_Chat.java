package com.example.week6_sdh;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Chat extends Fragment {
    View v;
    private RecyclerView myrecyclerview2 ;
    private List<Contact> lstContact2;

    public Fragment_Chat() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.fragment_chat,container, false);
        myrecyclerview2 = (RecyclerView) v.findViewById(R.id.recy22);

        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact2);
        myrecyclerview2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview2.setAdapter(recyclerAdapter);
        return  v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact2 = new ArrayList<>();
        for(int i = 0; i <6; ++i) {
            lstContact2.add(new Contact("AAA", "123450", R.drawable.person));
            lstContact2.add(new Contact("BBB", "654321", R.drawable.person2));
            lstContact2.add(new Contact("CCC", "123450", R.drawable.person));
            lstContact2.add(new Contact("DDD", "654321", R.drawable.person2));
            lstContact2.add(new Contact("EEE", "123450", R.drawable.person));
            lstContact2.add(new Contact("FFF", "654321", R.drawable.person2));
            lstContact2.add(new Contact("AAA", "123450", R.drawable.person));
            lstContact2.add(new Contact("BBB", "654321", R.drawable.person2));
            lstContact2.add(new Contact("CCC", "123450", R.drawable.person));
            lstContact2.add(new Contact("DDD", "654321", R.drawable.person2));
            lstContact2.add(new Contact("EEE", "123450", R.drawable.person));
            lstContact2.add(new Contact("FFF", "654321", R.drawable.person2));
        }

    }
}
