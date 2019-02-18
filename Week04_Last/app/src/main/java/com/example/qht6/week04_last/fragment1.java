package com.example.qht6.week04_last;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment {

    public fragment1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_one,null, false);

        return view;

    }

    public static fragment1 newInstance(){

        Bundle lee = new Bundle();

        fragment1 JoonHee = new fragment1();
        JoonHee.setArguments(lee);

        return JoonHee;
    }
}
