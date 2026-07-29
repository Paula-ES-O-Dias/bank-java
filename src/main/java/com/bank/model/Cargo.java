package com.bank.model;

public enum Cargo {
    DIRETOR(1000, 3000), GERENTE(1200, 3500), CAIXA(500, 1000), TERCEIRO(800, 1500);
    private double salarioMinimo;
    private double salarioMaximo;

    Cargo (double salarioMinimo, double salarioMaximo){
        this.salarioMinimo = salarioMinimo;
        this.salarioMaximo = salarioMaximo;
    }

    public double getSalarioMinimo () {
        return salarioMinimo;
    }

    public double getSalarioMaximo () {
        return salarioMaximo;
    }
}
