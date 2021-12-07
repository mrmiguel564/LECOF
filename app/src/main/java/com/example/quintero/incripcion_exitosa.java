package com.example.quintero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class incripcion_exitosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incripcion_exitosa);
    }

    public void onClick(View view) {
        Intent miIntent1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(miIntent1);
    }
}