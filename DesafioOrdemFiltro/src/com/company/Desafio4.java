package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Desafio4 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static Map<String, List<String>> listaElementos= new HashMap<>();
    public static Map<Integer, String> vencedor = new HashMap<>();

    public static void main(String[] args) {
        int numeroTestes=0;
        String lance1, lance2;
        List<List<String>> listaTestes = new ArrayList<>();

        // Estabelece a relação entre o elemento dominante e os dominados
        listaElementos.put("tesoura",Arrays.asList("papel","lagarto"));
        listaElementos.put("papel",Arrays.asList("pedra","spock"));
        listaElementos.put("pedra",Arrays.asList("lagarto","tesoura"));
        listaElementos.put("lagarto",Arrays.asList("spock","papel"));
        listaElementos.put("spock",Arrays.asList("tesoura","pedra"));

        // Estabelece a relação dos vencedores
        vencedor.put(0,"empate");
        vencedor.put(2,"marcia");
        vencedor.put(1,"fernanda");

        // Efetua a leitura dos lances feitos em cada um dos testes
        try {
            st = new StringTokenizer(br.readLine());                // Efetua a leitura do primeiro numero
            numeroTestes = Integer.parseInt(st.nextToken());
            for (int cont = 0; cont < numeroTestes; cont++){
               st=new StringTokenizer(br.readLine());               // Efetua a leitura dos testes
               lance1= st.nextToken();
               lance2= st.nextToken();
               listaTestes.add(Arrays.asList(lance1,lance2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprime os resultados
        int index;
        for(int cont = 0; cont < numeroTestes; cont++){
            lance1=listaTestes.get(cont).get(0);
            lance2=listaTestes.get(cont).get(1);
            index = resultadoConfronto(lance1,lance2);
            System.out.println(vencedor.get(index));
        }

    }

    public static int resultadoConfronto(String lance1, String lance2){

        if (lance1.equalsIgnoreCase(lance2))
            return 0;
        else
            if (listaElementos.get(lance1).contains(lance2)){
                return 1;
            }
        return 2;

    }
}


