package br.com.dio.collection.Map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        //    Criando um dicionário que relaciona modelo e consumo
        System.out.println("Criando um dicionário que relaciona modelo e consumo");
        Map<String, Double>  carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares);

        // substitua o consumo do gol por 15.2 km/L
        System.out.println("Substitua o consumo do gol por 15.2 km/L");
        carrosPopulares.replace("gol",15.2);
        System.out.println(carrosPopulares);


        // confira se o modelo tucson está no dicionário
        System.out.println("Confira se o modelo tucson está no dicionário - " + carrosPopulares.containsKey("tucson"));


        // Exibir o consumo do uno
        System.out.println("O consumo do uno é: " + carrosPopulares.get("uno"));


        // Exibir os modelos
        System.out.println("Exibir os modelos");
        System.out.println(carrosPopulares.keySet());

        // Exibir os consumos
        System.out.println("Exibir os consumos");
        System.out.println(carrosPopulares.values());

        // Exibir o modelo mais economico e seu consumo
        System.out.println("Exibir o modelo mais economico e seu consumo");
        Double valorMaisEficiente = Collections.max(carrosPopulares.values());
        String modeloMaisEficiente="";
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for(Map.Entry<String,Double> entry:entries){
            if (entry.getValue()==valorMaisEficiente) {
                modeloMaisEficiente=entry.getKey();
                System.out.println("O mdelo mais eficiente é " + modeloMaisEficiente + " que faz " + valorMaisEficiente + " km/L");
            }

        }

        // Exibir o modelo menos economico e seu consumo
        System.out.println("Exibir o modelo menos economico e seu consumo");
        Double valorMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente="";
        for(Map.Entry<String,Double> entry:entries){
            if (entry.getValue()==valorMenosEficiente) {
                modeloMenosEficiente=entry.getKey();
                System.out.println("O mdelo menos eficiente é " + modeloMenosEficiente + " que faz " + valorMenosEficiente + " km/L");
            }

        }

        // Exibir a soma dos consumos
        System.out.println("Exibir a soma dos consumos");
        Iterator<Double> it = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (it.hasNext()){
            soma += it.next();
        }
        System.out.println("Soma de consumos dos carros populares: " + soma);

        // Exibir a média dos consumos
        System.out.println("A média dos consumos é " + soma/carrosPopulares.size());

        // Remova os modelos com consumo igual a 15.6 km/L.
        System.out.println("Remova os modelos com consumo igual a 15.6 km/L");
        System.out.println(carrosPopulares);
        Iterator<Double> it2 = carrosPopulares.values().iterator();
        while (it2.hasNext()){
            if (it2.next().equals(15.6)) it2.remove();
        }
        System.out.println(carrosPopulares);

        // Exibir os carros na ordem em que foram informados
        System.out.println("Exibir os carros na ordem em que foram informados");
        Map<String, Double>  carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(carrosPopulares2);

    // Exibir os carros ordenados pelo modelo
        System.out.println("Exibir os carros ordenados pelo modelo");
        Map<String, Double>  carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        // Apagar o dicionário de carros
        System.out.println("Apagar o dicionário de carros");
        carrosPopulares3.clear();
        System.out.println("A lista de carros está vazia: " + carrosPopulares3.isEmpty());

        // Exibir o 3o. modelo adicionado
//        System.out.println("Exibir o 3o. modelo adicionado");
//        Map<String, Double>  carrosPopulares2 = new LinkedHashMap<>(){{
//            put("gol",14.4);
//            put("uno",15.6);
//            put("mobi",16.1);
//            put("hb20",14.5);
//            put("kwid",15.6);
//        }};
//        System.out.println(carrosPopulares2.);


    }

}
