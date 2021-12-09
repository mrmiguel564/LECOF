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
                Intent miIntent1 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent1);
            }
        });

        cardVolleyball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 2");
                Intent miIntent2 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent2);
            }
        });

        cardBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 3");
                Intent miIntent3 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent3);
            }
        });

        cardBoxeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 4");
                Intent miIntent4 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent4);
            }
        });

        cardRugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 5");
                Intent miIntent5 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent5);
            }
        });

        cardTenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Taller 6");
                Intent miIntent6 = new Intent(getApplicationContext(), FormularioTalleres.class);
                startActivity(miIntent6);
            }
        });
    }

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}