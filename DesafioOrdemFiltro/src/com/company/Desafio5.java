package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Desafio5 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;


    public static void main(String[] args) {

        String linha="";

        while (true){
            try {
                if ((linha = br.readLine()).isBlank()) break;
                linha = efetuaSubstituicao(linha);
                System.out.println(linha);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    private static String efetuaSubstituicao(String linha){

        while (linha.contains("_")){
                linha=linha.replaceFirst("_", "<i>");
                linha = linha.replaceFirst("_", "</i>");

        }

        while (linha.contains("*")){
            linha=linha.replaceFirst("\\*", "<b>");
            linha=linha.replaceFirst("\\*", "</b>");
        }

        return linha;
    }

}
