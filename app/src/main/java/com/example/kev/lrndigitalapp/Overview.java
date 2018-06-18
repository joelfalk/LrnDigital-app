package com.example.kev.lrndigitalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Overview extends AppCompatActivity {

    ImageView svenska, engelska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        svenska = findViewById(R.id.svenska);
        engelska = findViewById(R.id.engelska);
        engelska.setVisibility(View.INVISIBLE);
    }

    public void svenska (View view) {
        svenska.setVisibility(View.VISIBLE);
        engelska.setVisibility(View.INVISIBLE);
    }

    public void engelska(View view) {
        engelska.setVisibility(View.VISIBLE);
        svenska.setVisibility(View.INVISIBLE);
    }
}
