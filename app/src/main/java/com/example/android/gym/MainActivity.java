package com.example.android.gym;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnLogin(View view){
        Intent intent = new Intent(this, Dashboard.class);
        startActivity(intent);
    }
    public void OpenRegister(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}

