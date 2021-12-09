package com.example.quintero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FormularioTalleres extends AppCompatActivity {
    private EditText etrut;
    private EditText ettelefono;
    private EditText etnombre;
    private EditText etapellidos;
    private EditText etfecha_ano;
    private EditText etfecha_dia;
    private EditText etfecha_mes;
    private EditText etcorreo;
    private EditText etprevision;
    private EditText etdir_calle;
    private EditText etdir_num;
    private EditText etdir_loc;
    private EditText etdir_pobla;
    private String etfecha_nac;

    Button btformulario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_talleres);
        etrut       = (EditText)findViewById(R.id.formRut);
        ettelefono  = (EditText)findViewById(R.id.formNumeroContacto);
        etapellidos = (EditText)findViewById(R.id.formApellido);
        etnombre    = (EditText)findViewById(R.id.formNombre);
        etfecha_ano = (EditText)findViewById(R.id.formFechaNactimientoAño);
        etfecha_dia = (EditText)findViewById(R.id.formFechaNactimientoDia);
        etfecha_mes = (EditText)findViewById(R.id.formFechaNactimientoMes);
        etcorreo = (EditText)findViewById(R.id.formCorreo);
        etdir_calle = (EditText)findViewById(R.id.formCalle);
        etdir_num = (EditText)findViewById(R.id.formNumero);
        etdir_loc = (EditText)findViewById(R.id.formLocalidad);
        etdir_pobla = (EditText)findViewById(R.id.formPoblacion);
        etprevision = (EditText)findViewById(R.id.formPrevision);
        btformulario = (Button) findViewById(R.id.botonFormulario);

        btformulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String Rut = null;
                String Nombre = null;
                String Apellidos = null;
                String Telefono = null;
                String Prevision = null;
                String Calle = null;
                String Numero = null;
                String Localidad = null;
                String Poblacion = null;
                String Correo = null;

                Rut = etrut.getText().toString();
                Nombre = etnombre.getText().toString();
                Apellidos = etapellidos.getText().toString();
                Telefono = ettelefono.getText().toString();
                Calle = etdir_calle.getText().toString();
                Numero = etdir_num.getText().toString();
                Localidad = etdir_loc.getText().toString();
                Poblacion = etdir_pobla.getText().toString();
                Correo = etcorreo.getText().toString();
                Prevision = etprevision.getText().toString();
                //vnombre.setText(Nombre);*/
                insertar();
            }
        });

    }

    private void insertar() {
        /*String Rut = null;
        String Nombre = null;
        String Apellidos = null;
        String Telefono = null;
        String Prevision = null;
        String Calle = null;
        String Numero = null;
        String Localidad = null;
        String Poblacion = null;
        String Correo = null;*/

        String Rut = etrut.getText().toString().trim();
        String Nombre = etnombre.getText().toString().trim();
        String Apellidos = etapellidos.getText().toString().trim();
        String Telefono = ettelefono.getText().toString().trim();
        String Calle = etdir_calle.getText().toString().trim();
        String Numero = etdir_num.getText().toString().trim();
        String Localidad = etdir_loc.getText().toString().trim();
        String Poblacion = etdir_pobla.getText().toString().trim();
        String Correo = etcorreo.getText().toString().trim();
        String Prevision = etprevision.getText().toString().trim();

        /*String finalRut = Rut;
        String finalNombre = Nombre;
        String finalApellidos = Apellidos;
        String finalTelefono = Telefono;
        String finalPrevision = Prevision;*/

        StringRequest request = new StringRequest(Request.Method.POST, "http://192.168.1.92/titec1bd/dbquery.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.equalsIgnoreCase("Datos Insertados Correctamentes")) {
                    Toast.makeText(FormularioTalleres.this, "Datos Ingresados", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(FormularioTalleres.this, response, Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(FormularioTalleres.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("rut", Rut);
                params.put("nombres", Nombre);
                params.put("apellidos", Apellidos);
                params.put("numero_contacto", Telefono);
                params.put("prevision", Prevision);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(FormularioTalleres.this);
        requestQueue.add(request);
    }

    /*public void OnClick(View view){
        Toast.makeText(this, (CharSequence) etrut, Toast.LENGTH_SHORT).show();

    }*/
 /*
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
    private Boolean validateFecha_ano(){
        String val = etcorreo.getEditableText().toString();
        if (val.isEmpty()){
            etfecha_ano.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etfecha_ano.setError(null);
            return true;
        }
    }
    private Boolean validateFecha_dia(){
        String val = etfecha_dia.getEditableText().toString();
        if (val.isEmpty()){
            etfecha_dia.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etfecha_dia.setError(null);
            return true;
        }
    }
    private Boolean validateFecha_mes(){
        String val = etfecha_mes.getEditableText().toString();
        if (val.isEmpty()){
            etfecha_mes.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etfecha_mes.setError(null);
            return true;
        }
    }
    private Boolean validateCorreo(){
        String val = etcorreo.getEditableText().toString();
        if (val.isEmpty()){
            etcorreo.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etcorreo.setError(null);
            return true;
        }
    }
    private Boolean validateCalle(){
        String val = etdir_calle.getEditableText().toString();
        if (val.isEmpty()){
            etdir_calle.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etdir_calle.setError(null);
            return true;
        }
    }
    private Boolean validateNum(){
        String val = etdir_num.getEditableText().toString();
        if (val.isEmpty()){
            etdir_num.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etdir_num.setError(null);
            return true;
        }
    }
    private Boolean validateLoc(){
        String val = etdir_loc.getEditableText().toString();
        if (val.isEmpty()){
            etdir_loc.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etdir_loc.setError(null);
            return true;
        }
    }
    private Boolean validateFecha_nac(){
        String val = etdir_pobla.getEditableText().toString();
        if (val.isEmpty()){
            etdir_pobla.setError("Este campo no puede estar vacio.");
            return false;
        } else {
            etdir_pobla.setError(null);
            return true;
        }
    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
/*    public void registrerUser(View view) throws ParseException {
        etrut       = (EditText)findViewById(R.id.formRut);
        ettelefono  = (EditText)findViewById(R.id.formNumeroContacto);
        etapellidos = (EditText)findViewById(R.id.formApellido);
        etnombre    = (EditText)findViewById(R.id.formNombre);
        etfecha_ano = (EditText)findViewById(R.id.formFechaNactimientoAño);
        etfecha_dia = (EditText)findViewById(R.id.formFechaNactimientoDia);
        etfecha_mes = (EditText)findViewById(R.id.formFechaNactimientoMes);
        etfecha_nac = (EditText) etfecha_dia + "/" + etfecha_mes + "/" + etfecha_ano;
        Date nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(etfecha_nac);
        etcorreo = (EditText)findViewById(R.id.formCorreo);
        etdir_calle = (EditText)findViewById(R.id.formCalle);
        etdir_num = (EditText)findViewById(R.id.formNumero);
        etdir_loc = (EditText)findViewById(R.id.formLocalidad);
        etdir_pobla = (EditText)findViewById(R.id.formPoblacion);
        etprevision = (EditText)findViewById(R.id.formPrevision);
        btformulario = (Button) findViewById(R.id.botonFormulario);

        btformulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                insertar();
            }
        });

    }*/


}