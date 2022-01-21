package br.com.dio.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        // Adiciona séries
        System.out.println("Exibe as séries em ordem aleatória");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comédia",25));

        }};
        for(Serie serie: series) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Exibe as séries em ordem de inserção
        System.out.println("Exibe as séries em ordem de inserção");
        Set<Serie> series2 = new LinkedHashSet<>()
        {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark","drama",60));
            add(new Serie("that 70s show","comédia",25));

        }};
        for(Serie serie: series2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Exibe as séries em ordem natural
        System.out.println("Exibe as séries em ordem natural");
        Set<Serie> series3 = new TreeSet<>(series2);
        for(Serie serie: series3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Exibe as séries em ordem nome/genero/tempo de episódio
        System.out.println("Exibe as séries em ordem nome/genero/tempo");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        series4.addAll(series);
        for(Serie serie: series4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());




    }
}
