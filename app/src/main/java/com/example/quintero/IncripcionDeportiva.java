package com.example.quintero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;
import java.text.*;
import java.util.*;
import java.io.*;


public class IncripcionDeportiva extends AppCompatActivity {

    EditText etrut, ettelefono, etnombre, etapellidos, etfecha_nac, etprevision;
    TextView vrut, vtelefono, vnombre, vapellidos, vfecha_nac, vprevision;
    Button btbuttonInscribir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incripcion_deportiva);

        etrut  = (EditText) findViewById(R.id.rut);
        etnombre  = (EditText) findViewById(R.id.nombre);
        vnombre = (TextView)  findViewById(R.id.tnombre);
        ettelefono = (EditText) findViewById(R.id.telefono);
        etapellidos = (EditText) findViewById(R.id.apellidos);
        etfecha_nac = (EditText) findViewById(R.id.fecha_nac);
        etprevision = (EditText) findViewById(R.id.prevision);
        btbuttonInscribir = (Button) findViewById(R.id.buttonInscribir);

        btbuttonInscribir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String Nombre = null;
                    Nombre = etnombre.getText().toString();
                    vnombre.setText(Nombre);
            }
        });
    }
}
