package com.example.phuree.nnnnn;
import java.io.Serializable;

public class Todo_list implements Serializable {
    private int id;
    private String todoText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }
}
