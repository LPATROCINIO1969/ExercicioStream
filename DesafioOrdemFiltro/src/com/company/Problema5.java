package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Problema5 {
    public static void main(String[] args) {
        String nome;
        int numero;
        List<Participante> circulo;
        List<List<Participante>> circulos = new ArrayList<>();
        Participante participante;
        int numeroParticipantes = 0;
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true) {
                // cria uma lista circular
                st = new StringTokenizer(br.readLine());        //Entra com o número de participantes
                numeroParticipantes = Integer.parseInt(st.nextToken());
                if (numeroParticipantes==0) break;
                circulo = new ListaCircular();
                for(int cont=0; cont < numeroParticipantes; cont++) {
                    st = new StringTokenizer(br.readLine());        //Lẽ o nome e o número do participante
                    nome = st.nextToken();
                    numero = Integer.parseInt(st.nextToken());
                    participante = new Participante(nome, numero);
                    circulo.add(participante);
                }

                // Adiciona o circulo ao grupo de circulos
                circulos.add(circulo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Define um CONSUMER
        Function<ListaCircular,Participante> vencedor = lista -> lista.encontraVencedor();


        // Imprime os vencedores de cada circulo
        for( List lista:circulos){
            System.out.println(vencedor.apply((ListaCircular)lista));
        }

    }
}

// Cria uma classe lista circular
class ListaCircular extends ArrayList<Participante>{
    public static final byte HORARIO = -1;
    public static final byte ANTIHORARIO = 1;

    private Participante buscaNode(int posicaoInicial, int passos, int direcao) {
        int passosExecutados=1;
        int posicao = posicaoInicial;

        while (passosExecutados < passos) {
            posicao = posicao + direcao;
            if (posicao < 0) {
                posicao = this.size() - 1;
            } else if (posicao >= this.size()) {
                posicao = 0;
            }
            passosExecutados++;
        }
        return this.get(posicao);
    }

    public Participante encontraVencedor(){
        int direcao;
        int numero;
        int posicaoInicial=0;
        Participante nodeParaRemover;



        // Estabelece a posicao inicial
        Participante nodeAtual = this.get(posicaoInicial);
        numero = nodeAtual.getNumero();
        if (numero%2==0) posicaoInicial = this.size() -1;
        else posicaoInicial = 1;
        if (numero%2==0){
            direcao = HORARIO;

        } else {
            direcao = ANTIHORARIO;
        }


        // busca o node que será removido
        while (this.size()>1){

            nodeAtual = buscaNode(posicaoInicial, numero, direcao);
            numero = nodeAtual.getNumero();
            posicaoInicial= this.indexOf(nodeAtual);
            if (numero%2==0){
                direcao = HORARIO;
                if ((posicaoInicial == 0) || (posicaoInicial>=(this.size()-1))) posicaoInicial = this.size()-2;
                else posicaoInicial--;
            } else {
                direcao = ANTIHORARIO;
                if (posicaoInicial >= (this.size()-1)) posicaoInicial =0;

            }
//            if(posicaoInicial==(this.size()-1)) posicaoInicial = this.size()-2;
            this.remove(nodeAtual);
        }
        return this.get(0);
    }

}


// cria uma classe para representar cada participante da gincana
class Participante {
    private String nome;
    private int numero;


    public Participante(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        return "Vencedor(a): " + this.getNome();
    }
}
