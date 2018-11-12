package com.example.phuree.nnnnn;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private static final String datbaseName = "todolist.sqlite";
    private static final int databaseVersion = 1;
    Context myContext;

    private static final String tableCreate = "CREATE TABLE todo_list(" +
            "id INTEGER PRIMARY KEY , " +
            "todo_text TEXT," +
            "adress TEXT,"+
            "Ban TEXT);";

    public DbHelper(Context context) {
        super(context, datbaseName, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableCreate);
        String inser = "INSERT INTO todo_list(todo_text) VALUES ('TODOTEXT 1');";
        String insert = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (1,'ศาลหลักเมือง','กรุงเทพ','บรรยาย1');";
        String insert2 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (2,'วัดพระแก้ว','กรุงเทพ','บรรยาย2');";
        String insert3 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (1,'ศาลหลักเมือง','กรุงเทพ','บรรยาย1');";
        String insert4 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (2,'วัดพระแก้ว','กรุงเทพ','บรรยาย2');";
        String insert5 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (1,'ศาลหลักเมือง','กรุงเทพ','บรรยาย1');";
        String insert6 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (2,'วัดพระแก้ว','กรุงเทพ','บรรยาย2');";
        String insert7 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (1,'ศาลหลักเมือง','กรุงเทพ','บรรยาย1');";
        String insert8 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (2,'วัดพระแก้ว','กรุงเทพ','บรรยาย2');";
        String insert9 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (1,'ศาลหลักเมือง','กรุงเทพ','บรรยาย1');";
        String insert10 = "INSERT INTO todo_list (id ,todo_text,adress,Ban) " +
                "VALUES (2,'วัดพระแก้ว','กรุงเทพ','บรรยาย2');";
        db.execSQL(insert);
        db.execSQL(insert2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
