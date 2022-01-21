package br.com.dio.collection.Map.exercicioProposto03;

import java.util.Comparator;
import java.util.Map;

public class ComparatorOrdemNome implements Comparator<Map.Entry<Integer,Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
