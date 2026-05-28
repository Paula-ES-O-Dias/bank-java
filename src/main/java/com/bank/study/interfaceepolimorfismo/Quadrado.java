package com.bank.study.interfaceepolimorfismo;

public class Quadrado implements Calculo {

    private final double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
