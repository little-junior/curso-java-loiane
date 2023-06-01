package com.liljon.curso_java.exerciciosAulas11_12_13;

import java.util.Scanner;

public class MetrosPCentrimetros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("CONVERSOR DE MEDIDAS");
        System.out.println("====================");
        System.out.println("METROS PARA CENTIMETROS");

        System.out.print("DIGITE A MEDIDA EM METROS: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;

        System.out.println("MEDIDA CONVERTIDA:");
        System.out.println(centimetros + " METROS");


    }
}
