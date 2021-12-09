package com.example.quintero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.quintero.databinding.ActivityMainBinding;

public class TalleresDeportivos extends AppCompatActivity {

    private ActivityMainBinding binding;

    CardView cardFutbol;
    CardView cardVolleyball;
    CardView cardBasketball;
    CardView cardBoxeo;
    CardView cardRugby;
    CardView cardTenis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talleres_deportivos);

        cardFutbol = findViewById(R.id.cardFutbol);
        cardVolleyball = findViewById(R.id.cardVolleyball);
        cardBasketball = findViewById(R.id.cardBasketball);
        cardBoxeo = findViewById(R.id.cardBoxeo);
        cardRugby = findViewById(R.id.cardRugby);
        cardTenis = findViewById(R.id.cardTenis);

        cardFutbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 1");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });

        cardVolleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 2");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });

        cardBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 3");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });

        cardBoxeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 4");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });

        cardRugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 5");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });

        cardTenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 6");
                Intent miIntent = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent);
            }
        });
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}