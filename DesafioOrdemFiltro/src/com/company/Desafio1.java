package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Desafio1 {

    public static void main(String[] args) {
        int numeroTestes;
        List<String> listaPalavras;
        List<List<String>> listaTestes = new ArrayList<>();
        OrdenaPalavra ordenador = new OrdenaPalavra();


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numeroTestes = Integer.parseInt(st.nextToken());

            // recebe as listas de palavras
            for (int cont = 0; cont < numeroTestes; cont++){
                st = new StringTokenizer(br.readLine());
                listaPalavras = new ArrayList<>();
                // adiciona palavras lidas no console para uma estrtura tipo lista
                while (st.hasMoreTokens()){
                     listaPalavras.add(st.nextToken());
                }
                // ordena lista de palavras do teste
                listaPalavras.sort(ordenador);
                listaTestes.add(listaPalavras);
            }

            // Imprimindo listas de palavras
            listaTestes.stream().forEach(lista ->{lista.stream()
                                                 .forEach(palavra->System.out.print(palavra + " "));
                                                  System.out.println();});

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class OrdenaPalavra implements Comparator<String> {


    @Override
    public int compare(String palavra1, String palavra2) {
        if (palavra2.length() > palavra1.length())
            return 1;
        else if(palavra2.length() < palavra1.length())
            return -1;
        else
            return palavra1.compareTo(palavra2);
    }
}
