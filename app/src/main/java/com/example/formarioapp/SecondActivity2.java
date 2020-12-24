package com.example.formarioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.formarioapp.databinding.ActivitySecond2Binding;

public class SecondActivity2 extends AppCompatActivity {
private ActivitySecond2Binding view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = ActivitySecond2Binding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        Intent intent = getIntent();
        //Bundle bundle = intent.getExtras();
        Log.d("Prueba",intent.getStringExtra("name"));
        if (intent != null){
            view.textViewName.setText(intent.getStringExtra("name"));
            view.textViewLastName.setText(intent.getStringExtra("lastName"));
        }
    }
}