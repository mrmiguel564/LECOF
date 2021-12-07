package com.example.quintero;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.


public class IncripcionDeportiva extends AppCompatActivity {
    EditText etrut, ettelefono, etnombre, etapellidos, etfecha_nac, etprevision;
    Button btbuttonInscribir;
//    AwesomeValidation = awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incripcion_deportiva);

        etrut = findViewById(R.id.rut);
        ettelefono = findViewById(R.id.telefono);
        etnombre = findViewById(R.id.nombre);
        etapellidos = findViewById(R.id.apellidos);
        etfecha_nac = findViewById(R.id.fecha_nac);
        etprevision = findViewById(R.id.prevision);
        btbuttonInscribir = findViewById(R.id.buttonInscribir);

//        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
//        awesomeValidation.addValidation(this, R.id.nombre,RegexTemplate.NOT_EMPTY, R.string.invalid_name);
//        awesomeValidation.addValidation(this, R.id.apellidos,RegexTemplate.NOT_EMPTY, R.string.invalid_apellido);
//        awesomeValidation.addValidation(this, R.id.telefono,"[0-9]{9}", R.string.invalid_mobile);
//        awesomeValidation.addValidation(this, R.id.fecha_nac, "[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}", R.string.invalid_date);
//       awesomeValidation.addValidation(this, R.id.rut,"[0-9]{8}[-]{1}[0-9]{1}", R.string.invalid_rut);

//        btbuttonInscribir.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                if (awesomeValidation.validate()){
//                    Toast.makeText(getApplicationContext(),"El envío del formulario se realizó correctamente.", Toast.LENGTH_SHORT).show();
//                }else {
//                    Toast.makeText(getApplicationContext()
//                            , "Validación del formulario fallida, por favor intentalo nuevamente.",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}