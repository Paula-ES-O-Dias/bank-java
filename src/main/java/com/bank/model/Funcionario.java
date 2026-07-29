package com.bank.model;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
    private Cargo cargo;
    private Long idAgencia;

    public Funcionario(){}

    public Funcionario (String name, LocalDate dataNascimento, String country, String cpf, String email, Cargo cargo, Long id_agencia){
        super(name, dataNascimento, country, cpf, email);
        this.cargo = cargo;
        this.idAgencia = idAgencia;
    }

    public Cargo getCargo(){
        return cargo;
    }

    public void setCargo (Cargo cargo) {
        this.cargo = cargo;
    }

    public Long setIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(Long idAgencia) {
        this.idAgencia = idAgencia;
    }
}


