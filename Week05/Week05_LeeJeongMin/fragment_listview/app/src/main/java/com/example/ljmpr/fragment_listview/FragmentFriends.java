package com.example.ljmpr.fragment_listview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentFriends extends Fragment {

    TextView textView;

    public FragmentFriends() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.fragment_friends,container,false);

        ListView friendsList = (ListView)layout.findViewById(R.id.friendsList);
        FriendsAdapter friendsAdapter = new FriendsAdapter();

        for (int i = 0; i<3; i++) {
            friendsAdapter.addItem(R.drawable.person,"이름1","한마디");
            friendsAdapter.addItem(R.drawable.person,"이름2","두마디");
            friendsAdapter.addItem(R.drawable.group,"그룹1","세마디");
        }

        friendsList.setAdapter(friendsAdapter);

        return layout;
    }
}
