package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Problema4 {
    public static void main(String[] args) {
        int numTestes=0;
        int numClientes=0;

        StringTokenizer st;
        List<Integer> testeClientes;
        List<Integer> testeClientesOrdenada;
        List<List<Integer>> listaTestes = new ArrayList<>();

        // Entrada de dados
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            st = new StringTokenizer(br.readLine());
            numTestes = Integer.parseInt(st.nextToken());                   // leitura do número de testes a ser efetuado

            for (int cont = 0; cont < numTestes; cont++){
                st = new StringTokenizer(br.readLine());                    // leitura do número de clientes por teste
                numClientes = Integer.parseInt(st.nextToken());

                // efetua a leitura de uma lista de inteiros referente ao número recebido pelos clientes quando chegam
                st = new StringTokenizer((br.readLine()));
                testeClientes = new ArrayList<>();
                for (int ordem=0; ordem < numClientes; ordem++){
                      testeClientes.add(Integer.parseInt(st.nextToken()));
                }

                // Armazena a lista de números de clientes referentes a um teste em uma lista de testes
                listaTestes.add(testeClientes);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Efetua a ordenação da lista e compara com a sua versão anterior para determinar quantos individuos mudaram de lugar
        // na lista
        Iterator<List<Integer>> itListaTestes = listaTestes.iterator();
        while(itListaTestes.hasNext()){
            testeClientes = itListaTestes.next();
            testeClientesOrdenada = testeClientes.stream().collect(Collectors.toList());
            testeClientesOrdenada.sort(Comparator.reverseOrder());
//            testeClientesOrdenada =testeClientes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(numeroClientesReordenados(testeClientes,testeClientesOrdenada));
        }


    }

    // Retorna o número de clientes que foram reordenados na listagem
    private static int numeroClientesReordenados(List<Integer> testeClientes, List<Integer> testeClientesOrdenados){
        int numNaoMovidos=0;
        int tamanho = testeClientes.size();

        for(int cont = 0; cont < tamanho; cont++){
            if (testeClientes.get(cont)==testeClientesOrdenados.get(cont)) numNaoMovidos++;
        }

        return numNaoMovidos;
    }

}
