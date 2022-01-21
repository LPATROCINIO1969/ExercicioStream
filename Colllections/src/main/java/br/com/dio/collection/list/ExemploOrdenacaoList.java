package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon",18,"Preto"));
            add(new Gato("Simba",6,"Tigrado"));
            add(new Gato("Jon",12,"amarelo"));
        }};

        System.out.println("Exibe lista na ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Exibe lista em ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Exibe lista em ordem natural");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Exibe lista em ordem de idade");
//        Collections.sort(meusGatos,new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Exibe lista em ordem de Cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Exibe lista em ordem de Nome/Cor/Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);




    }


}
