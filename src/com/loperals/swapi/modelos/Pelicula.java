package com.loperals.swapi.modelos;

import com.google.gson.annotations.SerializedName;

public class Pelicula {
    @SerializedName("title")
    String titulo;

    @SerializedName("episode_id")
    int numeroEpisodio;

    @SerializedName("opening_crawl")
    String descripcion;

    @SerializedName("release_date")
    String fechaLanzamiento;

    public Pelicula(String titulo, int numeroEpisodio, String descripcion, String fechaLanzamiento) {
        this.titulo = titulo;
        this.numeroEpisodio = numeroEpisodio;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Pelicula(PeliculaAPI miPeliculaAPI) {
        this.titulo=miPeliculaAPI.title();
        this.numeroEpisodio=miPeliculaAPI.episode_id();
        this.descripcion=miPeliculaAPI.opening_crawl();
        this.fechaLanzamiento=miPeliculaAPI.release_date();

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

    @Override
    public String toString() {
        return "Nombre de la pelicula:"+ titulo +"\n" +
                "Numero de episodio: " + numeroEpisodio +"\n" +
                "Fecha de lanzamiento: "+ fechaLanzamiento+ "\n" +
                "Descripción: " + "\n" + descripcion;

    }
}
