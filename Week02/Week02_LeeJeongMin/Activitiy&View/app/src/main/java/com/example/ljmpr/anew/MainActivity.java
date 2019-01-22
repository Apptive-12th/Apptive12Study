package com.example.ljmpr.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText)findViewById(R.id.edit_text_1);
        final EditText editText1 = (EditText)findViewById(R.id.edit_text_2);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("lastname",String.valueOf(editText.getText()));
                intent.putExtra("firstname",String.valueOf(editText1.getText()));
                startActivity(intent);
            }
        });
    }
}
