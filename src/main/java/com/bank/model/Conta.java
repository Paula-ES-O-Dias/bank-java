package com.bank.model;

import java.math.BigDecimal;

public abstract class Conta {
    private Long numero;
    private String cpf;
    private Long agencia;
    private BigDecimal saldo;

    public Conta () {

    }

    public Conta (
            Long numero,
            String cpf,
            Long agencia,
            BigDecimal saldo
    ) {
        this.numero = numero;
        this.cpf = cpf;
        this. agencia = agencia;
        this.saldo = saldo;
    }

    public Long getNumero () {
        return numero;
    }

    public void setNumero (Long numero) {
        this.numero = numero;
    }

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void debitar (BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }

    public void creditar (BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }
}


