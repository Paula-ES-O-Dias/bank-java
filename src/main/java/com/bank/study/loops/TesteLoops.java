package com.bank.study.loops;

import java.util.ArrayList;
import java.util.List;

public class TesteLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Mateus");
        for (int i = 0; i < nomes.size(); i++) {

            String nome = nomes.get(i);
            System.out.println(nome);
        }

       for(String nome: nomes) {
           System.out.println(nome);
       }
       nomes.forEach(nome -> {
           System.out.println(nome);
       });

       int contador = 6;
        while (contador < 6) {
            System.out.println(contador);
            contador++;
        }

        do{
            System.out.println(contador);
            System.out.println("dowhile");
        }while(contador < 6);
    }

}
