package com.apptive12th.listview_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] IMAGES = {R.drawable.person0,R.drawable.person1,R.drawable.person2,R.drawable.person3,R.drawable.person4,R.drawable.person5,R.drawable.person7,R.drawable.person9};

    String[] NAMES = {"♡다원♡","DaWon","다워니","","","","",""};

    String[] DESCRIPTION = {"개강 싫다","봄봄","존맛탱★","","","","",""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView=(ListView)findViewById(R.id.imlistView);

        CustomAdapter customAdapter=new CustomAdapter();

        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.listview_item,null);

            ImageView imageView=(ImageView)view.findViewById(R.id.profile);
            TextView textView_name=(TextView)view.findViewById(R.id.name);
            TextView textView_ballon=(TextView)view.findViewById(R.id.ballon);

            imageView.setImageResource(IMAGES[position]);
            textView_name.setText(NAMES[position]);
            textView_ballon.setText(DESCRIPTION[position]);

            return view;
        }
    }
}
