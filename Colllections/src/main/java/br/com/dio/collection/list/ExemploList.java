package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno faça [7, 8.5, 9.3, 5, 7, 0, 3.6]

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5.0 - posição:" + notas.indexOf(5d));
        System.out.println("Adicionando o número 8 na posição 4.");
        notas.add(4,8d);

        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pela nota 6.0.");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Imprimir os números na ordem em que foram informados");
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println("Exiba o terceiro elemento adicionado: " + notas.get(2));

        System.out.println("Exiba a menor nota da lista: " + Collections.min(notas));

        System.out.println("Exiba a maior nota da lista: " + Collections.max(notas));


        Iterator<Double> it = notas.iterator();
        Double soma = 0d;
        while (it.hasNext()){
            soma += it.next();
        }
        System.out.println("Exiba a soma de notas da lista: " + soma);
        System.out.println("Exiba a média de notas da lista: " + soma/notas.size());
        System.out.println("Remova a nota zero.");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0.");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        it = notas.iterator();
        Double elemento;
        while (it.hasNext()){
            elemento = it.next();
            if (elemento < 7) it.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println("Verifica se a lista está vazia: " + notas.isEmpty());


    }

}
