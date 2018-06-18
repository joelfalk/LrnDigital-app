package com.example.kev.lrndigitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void openProv(View view) {
        //När någon klickar på provknappen kommer fönstret att ändras
        //Intent intent = new Intent(this, Prov.class);
    }
}
