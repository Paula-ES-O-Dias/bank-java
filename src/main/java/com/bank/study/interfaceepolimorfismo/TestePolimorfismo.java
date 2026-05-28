package com.bank.study.interfaceepolimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado (3);

        System.out.println(quadrado.calcularArea());

        Calculo[] calculo = new Calculo [4];
        calculo [0] = new Quadrado(3);
        calculo [1] = new Retangulo (3, 4);
        calculo [2] = new Circulo (2);
        calculo [3] = new Triangulo (3,4);

        for (int i = 0; i < calculo.length; i++) {
            System.out.println(calculo[i].calcularArea());
        }

    }
}
