package com.example.login1;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<Modelo> lista;
    Activity activity;

    public Adaptador(ArrayList<Modelo> lista, Activity activity) {
        this.lista = lista;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View v = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup,false);
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        ViewHolder holder = new ViewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.titulo.setText(lista.get(i).getTitulo());
        viewHolder.descri.setText(lista.get(i).getDescri());
        Glide.with(activity).load(lista.get(i).getImagen()).error(R.drawable.robot).into(viewHolder.imagen);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView titulo;
        TextView descri;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.title2);
            descri = itemView.findViewById(R.id.descripcion);
            imagen = itemView.findViewById(R.id.imagen1);
        }
    }
}
