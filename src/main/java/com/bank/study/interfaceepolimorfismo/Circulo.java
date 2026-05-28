package com.bank.study.interfaceepolimorfismo;

public class Circulo implements Calculo {

    private final double raio;
    private final double pi = 3.14;

    public Circulo (double raio){
        this.raio = raio;
}

    @Override
    public double calcularArea() {
        return (raio*raio)*pi;
    }
}
