/**package com.example.jardin;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {
    ArrayList<municipio> listadeDatos;

    public ListaAdaptador(ArrayList<municipio> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaDelItemLista= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista,parent,false);

        return  new viewHolder( vistaDelItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {

        holder.actualizarDatos(listadeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreMunicipio;
        ImageView fotoMunicipio;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreMunicipio=itemView.findViewById(R.id.nombrePerfil);
            fotoMunicipio=itemView.findViewById(R.id.fotoPerfil);

        }

        public void actualizarDatos(municipio municipio) {
            nombreMunicipio.setText(municipio.getNombreMunicipio());
            fotoMunicipio.setImageResource(municipio.getFotoMunicipio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("datosMunicipio",municipio);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}*/
package com.example.jardin;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {

    ArrayList<Municipio> listadeDatos;

    public ListaAdaptador(ArrayList<Municipio> listadeDatos) {
        this.listadeDatos = listadeDatos;
    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaDelItemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista,parent,false);

        return new viewHolder(vistaDelItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listadeDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listadeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreMunicipio;

        ImageView fotoMunicipio;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreMunicipio=itemView.findViewById(R.id.nombrePerfil);
            fotoMunicipio=itemView.findViewById(R.id.fotoPerfil);

        }

        public void actualizarDatos(Municipio municipio) {
            nombreMunicipio.setText(municipio.getNombreMunicipio());
            fotoMunicipio.setImageResource(municipio.getFotoMunicipio());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("datosMunicipio",municipio);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}
