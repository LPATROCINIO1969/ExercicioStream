package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Desafio2 {
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha1, linha2;

        // Efetua a leitura das palavras no console e armazena em uma lista
        while (!(linha1 = br.readLine()).isEmpty()) {
            linha2 = br.readLine();

            // Efetua a comparação das palavras e imprime o tamanho da maior substring
            System.out.println(tamanhoMaiorSubstring(linha1, linha2));

        }
        out.close();
    }
    // Método que compara as substrings e retorna o tamanho da maior delas.
    public static int tamanhoMaiorSubstring(String palavra1, String palavra2){
        int tamanho;
        int tamMenor;

        String maior, menor, texto;

        // determina qual das palavras é menor
        if (palavra1.length()>= palavra2.length()){
            maior = palavra1;
            menor = palavra2;
        } else {
            maior = palavra2;
            menor = palavra1;
        }
        tamMenor = menor.length();

        // faz uma busca da menor string dentro da maior string
        tamanho = tamMenor;
        while (tamanho >= 1) {
            for (int inicio = 0; inicio < (tamMenor - tamanho + 1); inicio++) {
                texto = menor.substring(inicio, inicio + tamanho);
                if (maior.contains(texto))
                    return tamanho;
            }
            tamanho--;
        }
        return 0;
    }

}
