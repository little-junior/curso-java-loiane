package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int enesimo = scan.nextInt();

        int num0 = 1;
        int num1 = 0;

        for (int i = 0; i < enesimo; i++){
            System.out.println(num0);
            num0 = num0 + num1;
            num1 = num0 - num1;

        }

         */
        int num0 = 1;
        int num1 = 0;

        do {
            System.out.println(num0);
            num0 = num0 + num1;
            num1 = num0 - num1;

        } while (num1 < 500);
    }
}
