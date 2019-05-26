package com.example.login1;

public class Modelo {
    String imagen;
    String titulo;
    String descri;

    public Modelo() {
    }

    public Modelo(String imagen, String titulo, String descri) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descri = descri;
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

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }
}
