package com.belajar1.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tVUsername, tVPassword;
    private String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setData();
    }
    public void initView(){
        tVUsername = findViewById(R.id.txt_username);
        tVPassword = findViewById(R.id.txt_password);
    }

    public void setData(){
        Intent intent = getIntent();
        username = intent.getStringExtra("username");
        password = intent.getStringExtra("password");

        tVUsername.setText(username);
        tVPassword.setText(password);

    }
}