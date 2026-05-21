package com.bank.study;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestePessoaEstudo {
    public static void main(String[] args) {
        PessoaEstudo pessoaEstudo = new PessoaEstudo ();
        pessoaEstudo.setName("Maria");
        pessoaEstudo.setAge(25);
        pessoaEstudo.setCountry("Brasil");

        PessoaEstudo pessoaEstudo2 = new PessoaEstudo("Joana", 30, "Argentina");
        System.out.println(pessoaEstudo2.getName());
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome");
        String name = scan.next();
        System.out.println("Digite a idade");
        int age = scan.nextInt();
        System.out.println("Digite o pais");
        String country = scan.next();

        PessoaEstudo pessoaEstudo3 = new PessoaEstudo(name, age, country);
        System.out.println("O nome da pessoa é " + pessoaEstudo3.getName());
        PessoaEstudo.lastName = "Silva";
    }

}
