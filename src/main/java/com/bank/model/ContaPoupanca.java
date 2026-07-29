package com.bank.model;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{
    private BigDecimal rendimento;

    public ContaPoupanca () {

    }

    public ContaPoupanca (
            Long numero,
            String cpf,
            Long agencia,
            BigDecimal saldo,
            BigDecimal rendimento
    ) {
        super (numero, cpf, agencia, saldo);
        this.rendimento = rendimento;
    }

    public BigDecimal getRendimento () {
        return rendimento;
    }

    public void setRendimento (BigDecimal rendimento) {
        this.rendimento = rendimento;
    }

    public void render () {
        BigDecimal valorRendimento = getSaldo().multiply(this.rendimento);
        setSaldo (getSaldo(). add(valorRendimento));
        // TODO
    }
}
