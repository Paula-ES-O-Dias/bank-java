package com.bank.study.estruturasdedados;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String[]produtos = new String [10];
        Scanner read = new Scanner(System.in);
        int contador = 0;

        while(true) {
            System.out.println("Digite 1 para inserir um produto");
            System.out.println("Digite 2 para remover um produto");
            System.out.println("Digite 3 para atualizar um produto");
            System.out.println("Digite 4 para encontrar um produto");
            System.out.println("Digite 5 para listar todos os produtos");
            System.out.println("Digite 0 para encerrar o programa");
            int menu = read.nextInt();
            if(menu == 0) {
                System.out.println("programa encerrado");
                break;
            } else if(menu == 1) {
                System.out.println("Insira um produto:");
                String produto = read.next();
                produtos[contador] = produto;
                contador++;

            } else if(menu == 5) {
                System.out.println("Listar todos os produtos");
                for (int i = 0; i < produtos.length; i++) {
                    if (produtos [i] != null) {
                        System.out.println("Produto: " + produtos[i]);
                    }
                }
            } else if (menu == 4) {
                System.out.println("Encontrar um produto");
                String produto = read.next();
                boolean encontrado = false;
                for (int i = 0; i < produtos.length; i++) {
                  if (produto.equals(produtos[i])) {
                      encontrado = true;
                      System.out.println("Produto existe na lista");
                      break;
                    }
                }
                if (!encontrado) {
                    System.out.println("produto não encontrado");
                }

            } else if (menu == 3) {
                System.out.println("Qual produto a ser atualizado?");
                String produto = read.next();
                boolean encontrado = false;
                for (int i = 0; i < produtos.length; i++) {
                    if (produto.equals(produtos[i])) {
                        encontrado = true;
                        System.out.println("Produto existe");
                        System.out.println("Digite qual o nome do produto");
                        String novoproduto = read.next();
                        produtos[i] = novoproduto;
                    }

                }
                if (!encontrado) {
                    System.out.println("produto não encontrado");
                }

            } else if (menu == 2) {
                System.out.println("Remover um produto");
                String produto = read.next();
                boolean encontrado = false;
                for (int i = 0; i < produtos.length; i++) {
                    if (produto.equals(produtos[i])) {
                        encontrado = true;
                        System.out.println("Produto existe na lista");
                        produtos[i] = null;
                    }
                }
                if (!encontrado) {
                    System.out.println("produto não encontrado");
                }
            }
        }
    }
}
