package com.loperals.swapi.modelos;

public class Pelicula {
    String titulo;
    int numeroEpisodio;
    String descripcion;
    String fechaLanzamiento;

    public Pelicula(String titulo, int numeroEpisodio, String descripcion, String fechaLanzamiento) {
        this.titulo = titulo;
        this.numeroEpisodio = numeroEpisodio;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }
}
