package com.liljon.curso_java.exerciciosAula16_17;

public class TaxaDeCrescimento {
    public static void main(String[] args) {
        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;

        while (paisA < paisB){
            paisA = paisA + (paisA * 0.03);
            paisB = paisB + (paisB * 0.015);

            anos++;
        }

        System.out.println("Pais A: " + paisA);
        System.out.println("Pais B: " + paisB);
        System.out.println("Números de anos necessário: " + anos);
    }
}
