package com.bank.model;

import java.time.LocalDate;

public abstract class Pessoa {
    private String name;
    private LocalDate dataNascimento;
    private String country;
    private String cpf;
    private String email;

    public Pessoa (){}

    public Pessoa (
            String name,
            LocalDate dataNascimento,
            String country,
            String cpf,
            String email
    ) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.country = country;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCountry() {
        return country;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCountry (String country) {
        this.country = country;
    }
}


