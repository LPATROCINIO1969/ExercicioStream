package br.com.dio.collection.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos desta lista de strings");
        // USANDO INTERFACE ATIVA
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        // USANDO FUNÇÃO LAMBDA
        numerosAleatorios.stream().forEach(s-> System.out.println(s));

        // USANDO REFERENCE METHOD
        numerosAleatorios.stream().forEach(System.out::println);

        // Pegue os primeiros 5 números da lista
        System.out.println("Pegue os primeiros 5 números da lista");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        // Transforme essa lista de Strings em uma lista de números inteiros
        System.out.println("Transforme essa lista de Strings em uma lista de números inteiros");
        List<Integer> listaInteiros =numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(listaInteiros);


        // Selecione os números pares e maiores que 2, e os coloque em uma lista
        System.out.println("Selecione os números pares e maiores que 2, e os coloque em uma lista");
//        List<Integer> numerosParesMaiores2 = listaInteiros.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return ((integer%2==0) && (integer>2));
//
//            }
//        }).collect(Collectors.toList());
//        System.out.println(numerosParesMaiores2);


        List<Integer> numerosParesMaiores2 = listaInteiros.stream().filter(numero->(numero %2 ==0) && (numero >2)).collect(Collectors.toList());
        System.out.println(numerosParesMaiores2);

        // Tirar a média de todos os números
        Double media = numerosAleatorios.stream().mapToDouble( Double::parseDouble).average().getAsDouble();
        System.out.println("Tirar a média de todos os números da lista: "+ media);


        // remover os números impares
        System.out.println("remover os números impares");
        listaInteiros.removeIf(numero->(numero%2!=0));
        System.out.println(listaInteiros);

    }
}
