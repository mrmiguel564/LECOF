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
    private EditText etrut, ettelefono, etnombre, etapellidos, etfecha_nac, etprevision;
    Button btbuttonInscribir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incripcion_deportiva);
        etrut       = (EditText)findViewById(R.id.etrut);
        ettelefono  = (EditText)findViewById(R.id.ettelefono);
        etapellidos = (EditText)findViewById(R.id.etapellidos);
        etnombre    = (EditText)findViewById(R.id.etnombre);
        etfecha_nac = (EditText)findViewById(R.id.etfecha_nac);
        etprevision = (EditText)findViewById(R.id.etprevision);
    }
    public void OnClick(View view){
        Toast.makeText(this, (CharSequence) etrut, Toast.LENGTH_SHORT).show();
        
    }

    private Boolean validateNombre(){
        String val = etnombre.getEditableText().toString();
        if (val.isEmpty()){
            etnombre.setError("Este campo no puede estar vacio.");
            return false;
        } else {
          etnombre.setError(null);
          return true;
        }
    }
    private Boolean validateRut(){
        String val = etrut.getEditableText().toString();
        if (val.isEmpty()){
            etrut.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etrut.setError(null);
            return true;
        }
    }
    private Boolean validateTelefono(){
        String val = ettelefono.getEditableText().toString();
        if (val.isEmpty()){
            ettelefono.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            ettelefono.setError(null);
            return true;
        }
    }
    private Boolean validateApellidos(){
        String val = etapellidos.getEditableText().toString();
        if (val.isEmpty()){
            etapellidos.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etapellidos.setError(null);
            return true;
        }
    }
    private Boolean validateFecha_nac(){
        String val = etfecha_nac.getEditableText().toString();
        if (val.isEmpty()){
            etfecha_nac.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etfecha_nac.setError(null);
            return true;
        }
    }
    public void registrerUser(View view){

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
