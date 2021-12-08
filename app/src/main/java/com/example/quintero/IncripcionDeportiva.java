package com.example.quintero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import java.text.*;
import java.util.*;
import java.io.*;


public class IncripcionDeportiva extends AppCompatActivity {
    EditText etrut, ettelefono, etnombre, etapellidos, etfecha_nac, etprevision;
    Button btbuttonInscribir;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incripcion_deportiva);
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

        if (!validateTelefono() | !validateApellidos() | !validateRut() | !validateTelefono() | !validateNombre() | !validateFecha_nac()){
            return;
        }

        String rut = etrut.getEditableText().toString();
        String telefono = ettelefono.getEditableText().toString();
        String nombre = etnombre.getEditableText().toString();
        String apellidos = etapellidos.getEditableText().toString();
        String fecha_nac = etfecha_nac.getEditableText().toString();
        String prevision = etprevision.getEditableText().toString();
//        UserHelperClass helperClass = new UserHelperClass(etrut, ettelefono, etnombre, etapellidos, etfecha_nac, etprevision);
//        reference.child(rut).setValue(helperClass);

    }
}
