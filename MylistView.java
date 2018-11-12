package com.example.phuree.nnnnn;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MylistView extends BaseAdapter {
    private static Activity activity;
    private static LayoutInflater inflater;
    ArrayList<Todo_list> myTodoList;

    public MylistView(Activity activity, ArrayList<Todo_list> myTodoList) {
        this.myTodoList = myTodoList;
        this.activity = activity;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myTodoList.size();
    }

    @Override
    public Todo_list getItem(int position) {
        return myTodoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myTodoList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= convertView;
        v = inflater.inflate(R.layout.my_list_layout,null);
        TextView textView = (TextView)v.findViewById(R.id.listview_text);
        Todo_list todoList = myTodoList.get(position);
        textView.setText(todoList.getTodoText());


        return v;
    }
}

