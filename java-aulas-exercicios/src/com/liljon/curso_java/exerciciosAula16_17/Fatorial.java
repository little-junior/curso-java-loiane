package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja receber o fatorial: ");
        int num = scan.nextInt();

        int cont = 1;

        for (int i = 2; i <= num; i++){
            cont *= i;
        }

        System.out.println(num + "!" + " = " + cont);
    }
}
