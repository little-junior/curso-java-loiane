package com.liljon.curso_java.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura");
        float altura = scan.nextFloat();
        scan.nextLine();

        System.out.println("Digite a cidade e o país que voce mora");
        String cidadePais = scan.nextLine();

        System.out.println("Seu nome é " + nome +
                ", possui " + idade + " anos, tem " +
                altura + " de altura e mora em " + cidadePais
        );
    }
}
