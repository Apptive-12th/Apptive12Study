package com.example.hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//알트 인서트 implement method
public class listViewAdapter extends BaseAdapter {
    ArrayList<profilemodel> personList = new ArrayList<profilemodel>();          //array list 추가로 메모리할당 가능 걍 배열이라 생각하면됨
                                                                                   // <int>면 숫자 <string>이면 문자 <profilemodel> 왼쪽 java 에 이미지 정보를 담고있음

    public listViewAdapter(){
        for (int i=0;i<4;i++){
            personList.add(new profilemodel(R.drawable.person, "앱티브","배고프다"));
            personList.add(new profilemodel(R.drawable.person2, "앱티브2","배고파"));
            personList.add(new profilemodel(R.drawable.person, "앱티브","안녕하세요"));
        }
    }



    @Override  // 어댑터에서 몇개를 출력할건지
    public int getCount() {
        return personList.size();   // 여기서 갯수
    }

    @Override
    public Object getItem(int position) { return null;}

    @Override
    public long getItemId(int position) {return 0;}



    @Override  // 한개의 이름말풍선 덩어리 만듦
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_item,null , false);

        TextView name = view.findViewById(R.id.listViewName);
        TextView ballon = view.findViewById(R.id.listViewBalloon);
        ImageView img = view.findViewById(R.id.listViewImg);

        profilemodel person = personList.get(position);              // 앞에서 저장했던 person값들을 가져옴
        name.setText(person.getName());
        ballon.setText(person.getBalloon());
        img.setImageResource(person.getImgResource());

        //textView.setText("앱티브");   //여기서 이름을 바꿔줌
        return view;  //여기를 view를 반환해야함
    }
}
