package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class BaseExpoente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base:");
        int base = scan.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = scan.nextInt();

        int resultado = 1;

        for (int i = 0; i < expoente ; i++){
            resultado = resultado * base;
        }

        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
