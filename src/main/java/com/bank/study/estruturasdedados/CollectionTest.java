package com.bank.study.estruturasdedados;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.forEach (nome -> {
            System.out.println(nome);
        });
        Set<String> nomeSet = new HashSet<>();
        for (int i = 0; i < nomes.size(); i++) {
            nomeSet.add(nomes.get(i));
        }
        System.out.println("---");
        nomeSet.forEach ( nomeS -> {
            System.out.println(nomeS);
        });
    }
}
