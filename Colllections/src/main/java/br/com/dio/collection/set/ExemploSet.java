package br.com.dio.collection.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        // Inicializando um conjunto
        System.out.println("Inicializando um HashSet");
        Set<Double> notas = new HashSet<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);

        // Imprime as notas do conjunto
        System.out.println(notas);

        // confira se a nota 5.0 está no conjunto
        System.out.println("A nota 5.0 está no conjunto: " + notas.contains(5.0));

        // Exibir a menor nota
        System.out.println("A menor nota é: " + Collections.min(notas));

        // Exibir a maior nota
        System.out.println("A maior nota é: " + Collections.max(notas));

        // Exibir a soma dos elementos do conjunto
        Iterator<Double> it = notas.iterator();
        Double soma =0d;
        while(it.hasNext()){
            soma+= it.next();
        }
        System.out.println("A soma das notas é: " + soma);

        // Determina a média das notas
        System.out.println("A média das notas é:" + soma/notas.size());


        // Remove a nota zero
        System.out.println("Remove a nota zero");
        notas.remove(0.0);

        // Imprime as notas do conjunto
        System.out.println(notas);

        // Remove as notas menores que 7.0
        System.out.println("Remove elementos menores que 7.0");
        it = notas.iterator();
        Double elemento;
        while (it.hasNext()){
            elemento = it.next();
            if (elemento < 7.0) it.remove();
        }

        // Imprime as notas do conjunto
        System.out.println(notas);


        // Imprimimos as notas na sequencia em que foram inseridas
        System.out.println("Imprimimos as notas na sequencia em que foram inseridas");

        System.out.println("Inicializando um LinkedHashSet");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);


        // Imprimimos as notas na sequencia natural dos elementos
        System.out.println("Imprimimos as notas na sequencia natural dos elementos");

        System.out.println("Inicializando um TreeSet");
        Set<Double> notas3 = new TreeSet<>(notas2);
//        notas3.add(7.0);
//        notas3.add(8.5);
//        notas3.add(9.3);
//        notas3.add(5.0);
//        notas3.add(7.0);
//        notas3.add(0d);
//        notas3.add(3.6);

        System.out.println(notas3);

        // Apagando todo o conjunto
        System.out.println("Apagando todo o conjunto");
        notas.clear();
        System.out.println("O conjunto está vazio? " + notas.isEmpty());


    }
}
