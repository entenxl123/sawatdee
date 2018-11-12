package com.example.phuree.nnnnn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2 * 1000);
                    startActivity(new Intent(MainActivity.this, ShowAll.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        t.start();


    }
}