package com.example.phuree.nnnnn;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class TodoLIstDAO {
    private SQLiteDatabase database;
    private DbHelper dbHelper;

    public TodoLIstDAO(Context context){
        dbHelper = new DbHelper(context);
    }
    public void open(){
        database =dbHelper.getWritableDatabase();
    }
    public void close(){
        dbHelper.close();
    }
    public ArrayList<Todo_list> getAllTodoList(){
        ArrayList<Todo_list> todoList = new ArrayList<Todo_list>();
        Cursor cursor = database.rawQuery("SELECT * FROM todo_list;",null);
        cursor.moveToFirst();
        Todo_list todoList1;
        Todo_list todoList2;
        while(!cursor.isAfterLast()){
            todoList1 = new Todo_list();
            todoList2 = new Todo_list();
            todoList1.setId(cursor.getInt(0));
            todoList1.setTodoText(cursor.getString(1));
            todoList.add(todoList1);
            cursor.moveToNext();

        }
        cursor.close();
        return todoList;

    }
}

