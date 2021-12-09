package com.example.quintero;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class MostrarTalleres extends AppCompatActivity implements View.OnClickListener{

    TextView textView, textView2;

    RequestQueue requestQueue;
    private static final String URL1 = "http://192.168.1.92/titec1bd/dbquery.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_talleres);

        requestQueue = Volley.newRequestQueue(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button){
            String rut_responsable = textView.getText().toString().trim();
            String nombre_actividad = textView2.getText().toString().trim();

            obtenerInfo(rut_responsable, nombre_actividad);
        }
    }

    private void obtenerInfo(String rut_responsable, String nombre_actividad){
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                URL1,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MostrarTalleres.this, "Toast Correcto", Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("rut_responsable", rut_responsable);
                params.put("nombre_actividad", nombre_actividad);
                return params;
            }
        };
        requestQueue.add(stringRequest);
    }
}