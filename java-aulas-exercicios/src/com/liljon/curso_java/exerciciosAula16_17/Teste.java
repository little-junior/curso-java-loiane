package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================= LOJINHA DE CONVENIÊNCIA - CAIXA REGISTRADORA =================");

        double precoProduto;
        double somaProdutos = 0;
        double dinheiro;
        double troco;
        int i = 1;

        do{
            System.out.print("Produto " + i + " = R$ ");
            precoProduto = scan.nextDouble();
            System.out.print("Produto " + i + " = R$ ");
            somaProdutos += precoProduto;
            i++;
        }while(precoProduto != 0);

        System.out.println("Total = R$ " + somaProdutos);
        System.out.print("Dinheiro = R$ ");
        dinheiro = scan.nextDouble();

        troco = dinheiro - somaProdutos;
        System.out.println("Troco = R$ " + troco);
    }
}
