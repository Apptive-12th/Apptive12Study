package com.example.qht6.week04_last;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment3 extends Fragment {

    public fragment3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_three,null, false);

        return view;

    }

    public static fragment3 newInstance(){

        Bundle lee = new Bundle();

        fragment3 JoonHee = new fragment3();
        JoonHee.setArguments(lee);

        return JoonHee;
    }

}