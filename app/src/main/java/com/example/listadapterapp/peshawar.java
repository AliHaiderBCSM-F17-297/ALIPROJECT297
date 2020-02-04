package com.example.listadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class peshawar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peshawar);
    }
    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
