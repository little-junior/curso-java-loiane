package com.liljon.curso_java.exerciciosAulas11_12_13;

import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as quatro notas do bimestre");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas inseridas é: " + media);
    }
}
