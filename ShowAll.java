package com.example.phuree.nnnnn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowAll extends AppCompatActivity {
    ListView todoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

        todoList = (ListView)findViewById(R.id.LiteView);

        TodoLIstDAO todoLIstDAO = new TodoLIstDAO(getApplicationContext());
        todoLIstDAO.open();
        ArrayList<Todo_list> mylist = todoLIstDAO.getAllTodoList();

        //ArrayAdapter<T> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mylist);
        final MylistView adapter = new MylistView(this,mylist);
        todoList.setAdapter(adapter);
        todoLIstDAO.close();

        todoList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),String.valueOf(adapter.getItemId(position)),Toast.LENGTH_SHORT).show();
                Intent itn = new Intent(getApplicationContext(),ShowDatas.class);
                itn.putExtra("key",adapter.getItem(position));
                startActivity(itn);
            }
        });
    }
}


