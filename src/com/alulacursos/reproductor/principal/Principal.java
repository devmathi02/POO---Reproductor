package com.alulacursos.reproductor.principal;

import com.alulacursos.reproductor.modelos.Cancion;
import com.alulacursos.reproductor.modelos.MisFavoritos;
import com.alulacursos.reproductor.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Chop suey!");
        miCancion.setCantante("System of a Down");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe, Tech!");

        //mi cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adicione(miPodcast);
        misFavoritos.adicione(miCancion);
    }
}
