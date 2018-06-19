package com.example.kev.lrndigitalapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Prov extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prov);
    }

    public void rightAnswer(View button){


        button.setBackgroundColor(0xba669900);

    }
    public void wrongAnswer(View button){


        button.setBackgroundColor(0xbaff4444);

    }
}
