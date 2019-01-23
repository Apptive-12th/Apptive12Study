package com.example.ljmpr.anew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = new Intent(this.getIntent());
        String s = intent.getStringExtra("lastname");
        String ss = intent.getStringExtra("firstname");
        TextView textView = (TextView)findViewById(R.id.text_view_1);
        TextView textView1 = (TextView)findViewById(R.id.text_view_2);
        textView.setText(s);
        textView1.setText(ss);
    }
}
