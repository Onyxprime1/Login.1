package com.example.login1;

public class Modelo {
    String imagen;
    String titulo;


    public Modelo() {
    }

    public Modelo(String imagen, String titulo) {
        this.imagen = imagen;
        this.titulo = titulo;

    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
