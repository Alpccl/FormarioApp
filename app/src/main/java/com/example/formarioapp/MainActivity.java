package com.example.formarioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.formarioapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        view.edtxEMail.setText("mail@mail.com");
        view.edtxPassword.setText("123456");
        view.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = view.edtxName.getText().toString();
                String lastName = view.edtxLastName.getText().toString();

                Toast.makeText(MainActivity.this, "Hola "+name+" "+ lastName, Toast.LENGTH_SHORT).show();
                passsecond(name, lastName);
            }
        });
    }
    private void passsecond(String name, String lastName){
        Intent passsecond = new Intent(MainActivity.this, SecondActivity2.class);
        //Bundle bundle = new Bundle();
        Log.d("prueba1", " "+ name + " " + lastName);
        //bundle.putString("name", name);
        //bundle.putString("Lastname", lastName);
        passsecond.putExtra("name", name);
        passsecond.putExtra("lastName", lastName);
        startActivity(passsecond);
    }

}