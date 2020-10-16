package com.company.exercicio04e05e06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>();
        List<Integer> listaDeIdades = new ArrayList();

        // Hashmap para organizar os dados em key-value pairs
        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(15, "Joao");
        integerStringHashMap.put(21, "Leandro");
        integerStringHashMap.put(17, "Paulo");
        integerStringHashMap.put(18, "Jessica");

        Pessoa p1 = new Pessoa(15, "Joao");
        Pessoa p2 = new Pessoa(21, "Leandro");
        Pessoa p3 = new Pessoa(17, "Paulo");
        Pessoa p4 = new Pessoa(18, "Jessica");

        pessoaList.add(p1);
        pessoaList.add(p2);
        pessoaList.add(p3);
        pessoaList.add(p4);

        // Cria um arraylist com todas as idades
        for (Pessoa pessoa : pessoaList) {
            listaDeIdades.add(pessoa.getIdade());
        }
        // Arranja a lista de idades
        Collections.sort(listaDeIdades);
        // Reverte a lista de idades para a maior idade ficar no index 0
        Collections.reverse(listaDeIdades);

        // Devolve a maior idade
        System.out.println("A pessoa com maior idade na lista tem " + listaDeIdades.get(0) + " anos e se chama " + integerStringHashMap.get(listaDeIdades.get(0)));

        // Idades na lista
        System.out.println("Idades das pessoas presentes na lista : " + listaDeIdades);

        for (int i = 0 ; i < listaDeIdades.size() ; i++) {
            if (listaDeIdades.get(i) < 18) {
                listaDeIdades.remove(i);
            }
        }

        // Devolve a lista com idades maiores a 18 anos
        System.out.println("Idades maiores que 18 anos : " + listaDeIdades);

        if (integerStringHashMap.containsValue("Jessica")){
            System.out.println("O objeto Jessica existe na lista e a mesma possui " + integerStringHashMap.get("Jessica"));
        } else {
            System.out.println("Nao existe Jessica na lista.");
        }



    }
}
