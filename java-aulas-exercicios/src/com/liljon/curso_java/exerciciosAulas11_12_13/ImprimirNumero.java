package com.liljon.curso_java.exerciciosAulas11_12_13;

import java.util.Scanner;

public class ImprimirNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("O número informado foi " + num);
    }
}
