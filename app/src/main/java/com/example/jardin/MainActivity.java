package com.example.jardin;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Municipio municipio;
    ImageView fotoEmpleado;
    TextView prueba,prueba2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fotoEmpleado=findViewById(R.id.logotipo);
        prueba=findViewById(R.id.logotipo2);
        prueba2=findViewById(R.id.logotipo3);
        municipio =(Municipio)getIntent().getSerializableExtra("datosMunicipio");

        fotoEmpleado.setImageResource(municipio.getFotoMunicipio());
        prueba.setText(municipio.getNombreMunicipio());
        prueba2.setText(municipio.getDescripcionMunicipio());
    }
}




