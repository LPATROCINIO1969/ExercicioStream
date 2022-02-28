package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Problema1 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();



        // Entrada de dados
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int quantidade = Integer.parseInt(st.nextToken());
            for (int index = 0; index < quantidade; index++) {
                lista.add(Integer.parseInt(br.readLine()));

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        // ordena a lista de pares em ordem crescente
        lista.stream()
                .filter(numero -> (numero%2==0))
                .sorted(Integer::compareTo)
                .forEach(System.out::println);


        // ordena a lista de impares em ordem decrescente
        //listaImpares.sort(Integer::compareTo);
        lista.stream()
                .filter(numero -> (numero%2!=0))
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
