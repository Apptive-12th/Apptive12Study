package com.example.inohz.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ViewPagerFragment_01 extends Fragment {
    public ViewPagerFragment_01() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_01, container, false);

        ListView peopleListContentList = (ListView) layout.findViewById(R.id.fragment_01_recycler_view_people);

        PeopleListAdapter peopleListAdapter = new PeopleListAdapter();

        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "상단바 글자색 바꾸는 방법 알아내야 한다.", "상태메세지 1");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사용자 프로필 헤더로 만들어서 위에 붙여야 한다.", "");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "프래그먼트가 바뀔 때 우상단 버튼 배열, 갯수 달라져야 한다.", "상태메세지 2");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "또한 좌상단 '친구', '채팅', '더보기' 로 바뀌어야 한다.", "상태 3");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "카드뷰 경계가 보이지 않게 흰색으로 바꿔야 한다.", "");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "하단 탭 #검색 버튼 디자인이 없으므로 만들어야 한다.", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "채팅 탭 리스트뷰 구현해야 한다.", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "채팅방 인원수에 따라 아이콘 달라지게 표현해야 한다.", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");
        peopleListAdapter.addItem(R.drawable.baseline_person_black_18dp_2x, "사람", "상태메세지");

        peopleListContentList.setAdapter(peopleListAdapter);

        return layout;
    }
}
