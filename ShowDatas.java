package com.example.phuree.nnnnn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowDatas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_datas);

        Todo_list Show = (Todo_list) getIntent().getSerializableExtra("key");
        TextView tv1 = (TextView) findViewById(R.id.textView2);
        tv1.setText((CharSequence) Show.getTodoText());
    }
}
