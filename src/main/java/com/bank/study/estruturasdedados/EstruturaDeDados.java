package com.bank.study.estruturasdedados;

public class EstruturaDeDados {
    public static void main(String[] args) {
        String[]nomes = new String[10];
        nomes[0] = "Maria";
        nomes[1] = "Ana";
        nomes[2] = "Beatriz";

        for(int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            System.out.println(nome);
        }

        System.out.println(nomes[1]);
        nomes[1] = null;
        nomes[2] = "Laura";
        for(int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            System.out.println(nome);
        }
    }
}
