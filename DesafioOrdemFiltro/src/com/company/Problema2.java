package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problema2 {
    public static void main(String[] args) {
        List<Set> listas = new ArrayList<>();
        Set<String> listaCompra;
        int quantidade = 0;
        String teste;

        Iterator it;

        // Entrada de dados
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            quantidade = Integer.parseInt(st.nextToken());
            for (int cont = 0; cont < quantidade; cont++) {
                listaCompra = new TreeSet<>();
                listas.add(listaCompra);
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    teste = st.nextToken().toLowerCase();
                    listaCompra.add(teste);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // imprime listas
        listas.stream().forEach(s->System.out.println(textoOrdenado(s)));


    }

    private static String textoOrdenado(Set listaCompra){
        String resultant="";
        Iterator it;
        
        resultant="";
        it = listaCompra.iterator();
        while(it.hasNext())  resultant += it.next() + " ";
        
        resultant = resultant.trim();
        return resultant;
    }
}  
