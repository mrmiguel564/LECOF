package com.example.quintero;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.quintero.ui.main.SectionsPagerAdapter;
import com.example.quintero.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    CardView cardTalleres;
    CardView cardNoticias;
    CardView cardClimatico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardClimatico = findViewById(R.id.cardClimatico);
        cardNoticias = findViewById(R.id.cardNoticias);
        cardTalleres = findViewById(R.id.cardTalleres);

        cardClimatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Climatico");
                Intent miIntent = new Intent(getApplicationContext(), Reporte_Clima.class);
                startActivity(miIntent);
            }
        });

        cardNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Noticias");
                //Intent miIntent2 = new Intent(getApplicationContext(), IncripcionDeportiva.class);
               // startActivity(miIntent2);
            }
        });

        cardTalleres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Clickeo en Talleres");
                Intent miIntent3 = new Intent(getApplicationContext(), TalleresDeportivos.class);
                startActivity(miIntent3);
            }
        });
    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}