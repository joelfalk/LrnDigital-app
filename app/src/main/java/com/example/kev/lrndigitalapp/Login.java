package com.example.kev.lrndigitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void overview(View view) {
        Intent intent = new Intent(this, Overview.class);
        startActivity(intent);
    }
    public void prov(View view) {
        Intent intent = new Intent(this, Prov.class);
        startActivity(intent);
    }
}
