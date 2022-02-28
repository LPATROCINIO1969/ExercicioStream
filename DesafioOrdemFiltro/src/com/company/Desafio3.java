package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desafio3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String possivelSenha;
       // int tamanho;

        try {
                while (!(possivelSenha = br.readLine()).isBlank()){
//                    tamanho = possivelSenha.length();
//                    if ((tamanho >= 6) && (tamanho<=32)){
//                      if ((possivelSenha.matches("(.*)\s(.*)"))
//                              || (!possivelSenha.matches("(.*)\\d(.*)"))
//                              || (!possivelSenha.matches("(.*)[A-Z](.*)"))
//                              || (!possivelSenha.matches("(.*)[a-z](.*)"))){
//                        if (possivelSenha.matches("(.*)[á-ùÁ-Ùâ-ûÂ-ûã-ũÃ-ũüÜẽẼ](.*)")){
//                            System.out.println("Senha invalida.");
//                        } else System.out.println("Senha valida.");
//
//                    } else {
//                    if (possivelSenha.matches("^(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9])(?=.*[a-z]).{6,32}$")) {
                    if (possivelSenha.matches("^(?=.*[A-Z])(?=.*[0-9])(?=\\S+$)(?=.*[a-z]).{6,32}$")
                        && (!possivelSenha.matches("(.*)\\W(.*)"))){
                        System.out.println("Senha valida.");
                    }
                    else {
                        System.out.println("Senha invalida.");
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
