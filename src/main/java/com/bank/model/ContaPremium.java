package com.bank.model;

import java.math.BigDecimal;

public class ContaPremium extends Conta{
    private BigDecimal anuidade;
    private Long pontos;

    public ContaPremium () {

    }

    public ContaPremium (
            Long numero,
            String cpf,
            Long agencia,
            BigDecimal saldo,
            BigDecimal anuidade,
            Long pontos
    ) {
        super (numero, cpf, agencia, saldo);
        this.anuidade = anuidade;
        this.pontos = pontos;
    }

    public BigDecimal getAnuidade () {
        return anuidade;
    }

    public void setAnuidade (BigDecimal anuidade) {
        this.anuidade = anuidade;
    }

    public Long getPontos() {
        return pontos;
    }

    public void setPontos(Long pontos) {
        this.pontos = pontos;
    }

    public void calcularPontos (BigDecimal valor) {
        BigDecimal valorPontos = valor.divide(new BigDecimal(5));
        this.pontos += valorPontos.longValue();
        //Long valorPontosLong = valorPontos.longValue();
        //this.pontos = this.pontos + valorPontosLong;

    }

}


