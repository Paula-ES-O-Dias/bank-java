package com.bank.study.condicoes;

import java.util.Scanner;

public class TesteCondicoes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = read.next();
        System.out.println("Digite sua idade:");
        int idade = read.nextInt();
        if (idade >= 21){
            System.out.println(nome + " É responsável pelos outros");
        }else if(idade >= 18) {
            System.out.println(nome + " É maior de idade");
        }else {
            System.out.println(nome + " É menor de idade");
        }
        System.out.println(idade >= 18 ? " É maior de idade" : " É menor de idade");
        switch(idade) {
            case 18 :
                System.out.println("Ele tem 18 anos");
                break;
            case 20 :
                System.out.println("Ele tem 20 anos");
                break;
            default :
                System.out.println("Qualquer outra idade");
        }
    }
}
