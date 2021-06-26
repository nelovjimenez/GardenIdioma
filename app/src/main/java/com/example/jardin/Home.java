package com.example.jardin;

/*import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.Locale;*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Locale;

public class Home extends AppCompatActivity {

    ArrayList<Municipio> listaDeMunicipio = new ArrayList<>();

    RecyclerView listadoGrafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearLista();
        ListaAdaptador adaptador= new ListaAdaptador(listaDeMunicipio);
        listadoGrafico.setAdapter(adaptador);
    }

    //ENCARGADA DE CAMBIAR LA CONFIGURACION DE IDIOMA DEL TELEFONO
    public void cambiarIdioma(String lenguaje){

        Locale idioma=new Locale(lenguaje);
        Locale.setDefault(idioma);



    Configuration configuraciontelefono=getResources().getConfiguration();
    configuraciontelefono.locale=idioma;
    getBaseContext().getResources().updateConfiguration(configuraciontelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    //METODO ENCARGADO DE PINTAR EL MENU DE OPCIONES

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //METODO PARA CONTROLAR LA ACCION (LO QUE QUIERO HACER CON CADA ELEMENTO DEL MENU)

    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id){

            case(R.id.opcion1):
                Intent intent1=new Intent(Home.this,Acercade.class);
                startActivity(intent1);
                break;

            case(R.id.opcion2):
                cambiarIdioma("en");
                Intent intent2=new Intent(Home.this,Home.class);
                startActivity(intent2);
                break;

            case(R.id.opcion3):
                cambiarIdioma("es");
                Intent intent3=new Intent(Home.this,Home.class);
                startActivity(intent3);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    private void crearLista(){

        listaDeMunicipio.add(new Municipio("Municipio De Jardin",R.drawable.avatar1, getString(R.string.descripcion1)));
        listaDeMunicipio.add(new Municipio("Gastronomia",R.drawable.avatar2,getString(R.string.descripcion2)));
        listaDeMunicipio.add(new Municipio("Actividades",R.drawable.avatar3,getString(R.string.descripcion3)));
        listaDeMunicipio.add(new Municipio("Hoteles",R.drawable.avatar4,getString(R.string.descripcion4)));
        listaDeMunicipio.add(new Municipio("Paisajes",R.drawable.avatar5,getString(R.string
                .descripcion5)));
    }

}