package com.example.kev.lrndigitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/* heeeeej KEVIN*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchWindow (View view) {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }
}
