package com.example.kev.lrndigitalapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Overview extends AppCompatActivity {

    private ImageView svenska, engelska;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Button sv = findViewById(R.id.swedishBtn);
        //Button eng = findViewById(R.id.englishBtn);
        setContentView(R.layout.activity_overview);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        svenska = findViewById(R.id.svenska);
        engelska = findViewById(R.id.engelska);
        engelska.setVisibility(View.INVISIBLE);

    }
    public void svenska (View view) {
        svenska.setVisibility(View.VISIBLE);
        engelska.setVisibility(View.GONE);
    }
    public void engelska(View view) {
        engelska.setVisibility(View.VISIBLE);
        svenska.setVisibility(View.GONE);
    }
}
