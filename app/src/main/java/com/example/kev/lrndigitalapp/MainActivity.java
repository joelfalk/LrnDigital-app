package com.example.kev.lrndigitalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText UsernameEt, PasswordEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = findViewById(R.id.username);
        PasswordEt = findViewById(R.id.password);
    }

    public void confirm(View view) {

        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);
        if(true){
            Log.d("Result","False");
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }else{
            Log.d("Result","False");
        }
    }


}
