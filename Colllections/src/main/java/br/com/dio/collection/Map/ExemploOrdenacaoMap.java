package br.com.dio.collection.Map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        // Mostrar dicionário de livros em ordem aleatória
        System.out.println("Mostrar dicionário de livros em ordem aleatória");
        Map<String,Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo.", 256));
            put("Duhhig, Charles",new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro :livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


        // Mostrar dicionário de livros em ordem de inserção
        System.out.println("Mostrar dicionário de livros em ordem de inserção");
        Map<String,Livro> livros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo.", 256));
            put("Duhhig, Charles",new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro:livros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        // Mostrar dicionário de livros em ordem alfabética de autores
        System.out.println("Mostrar dicionário de livros em ordem alfabética de autores");
        Map<String,Livro> livros3 = new TreeMap<>(livros2);
        for(Map.Entry<String, Livro> livro:livros3.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        // Mostrar dicionário de livros em ordem alfabética de nome dos livros
        System.out.println("Mostrar dicionário de livros em ordem alfabética de nome dos livros");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros3.entrySet());
//        System.out.println(livros4);
        for(Map.Entry<String, Livro> livro:livros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


    }
}
