package br.com.dio.collection.Map.exercicioProposto03;

import java.util.*;
import java.util.function.Function;

public class ExercicioProposto03 {
    public static void main(String[] args) {

        System.out.println("Exibe a lista de contatos em ordem aleatoria");
        Map<Integer,Contato> agenda = new HashMap<>(){{
            put(1,new Contato("Simba",5555));
            put(4,new Contato("Cami",1111));
            put(3,new Contato("Jon",2222));
            put(6,new Contato("Alana",6666));
        }};
        System.out.println(agenda);

        System.out.println("Exibe a lista de contatos em ordem de inserção");
        Map<Integer,Contato> agenda1 = new LinkedHashMap<>(){{
            put(1,new Contato("Simba",5555));
            put(4,new Contato("Cami",1111));
            put(3,new Contato("Jon",2222));
            put(6,new Contato("Alana",6666));
        }};
        System.out.println(agenda1);

        System.out.println("Exibe a lista de contatos em ordem natural (chave)");
        Map<Integer,Contato> agenda2 = new TreeMap<>(agenda1);
        for (Map.Entry<Integer, Contato> registro: agenda2.entrySet()){
            System.out.println(registro.getKey() + " - " + registro.getValue().getNome() + " - " + registro.getValue().getNumero());
        }


        System.out.println("Exibe a lista de contatos por número de telefone");
        Set<Map.Entry<Integer, Contato> > agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(),o2.getValue().getNumero());
            }
        });
        agenda3.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> registro: agenda3){
            System.out.println(registro.getKey() + " - " + registro.getValue().getNome() + " - " + registro.getValue().getNumero());
        }

        System.out.println("Exibe a lista de contatos ordenada pelo nome do contato");
        // USANDO CLASSE ANÔNIMA
//        Set<Map.Entry<Integer, Contato> > agenda4 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
//                return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
//            }
//        });

        // USANDO INTERFACE FUNCIONAL
//        Set<Map.Entry<Integer, Contato> > agenda4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
//            @Override
//            public String apply(Map.Entry<Integer, Contato> contato) {
//                return contato.getValue().getNome();
//            }
//        }));

        // USANDO FUNÇÃO LAMBDA
        Set<Map.Entry<Integer, Contato> > agenda4 = new TreeSet<>(Comparator.comparing(contato ->contato.getValue().getNome()));

        agenda4.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> registro2: agenda4){
            System.out.println(registro2.getKey() + " - " + registro2.getValue().getNome() + " - " + registro2.getValue().getNumero());
        }


    }
}
