package com.bank.model;

import java.time.LocalDate;

public class Cliente extends Pessoa{
    private int score;

    public Cliente(){}

    public Cliente (String name, LocalDate dataNascimento, String country, String cpf, String email, int score){
        super(name, dataNascimento, country, cpf, email);
        this.score = score;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

