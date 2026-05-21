package com.bank.study;

public class PessoaEstudo {
    private String name;
    private int age;
    private String country;
    public static String lastName;
    public static final String CPF = "002.144.188-54";

    public PessoaEstudo() {

    }
    public PessoaEstudo(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country=country;
    }
}


