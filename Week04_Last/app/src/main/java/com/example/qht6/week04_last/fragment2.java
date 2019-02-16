package com.example.qht6.week04_last;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment2 extends Fragment {

    public fragment2() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_two,null, false);

        return view;

    }

    public static fragment2 newInstance(){

        Bundle lee = new Bundle();

        fragment2 JoonHee = new fragment2();
        JoonHee.setArguments(lee);

        return JoonHee;
    }
}