package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class MaiorNum {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        double num;
        double maior = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o número");
            num = scan.nextDouble();

            if (num > maior){
                maior = num;
            }
        }

        System.out.println("O maior número inserido foi: " + maior);
    }

}
