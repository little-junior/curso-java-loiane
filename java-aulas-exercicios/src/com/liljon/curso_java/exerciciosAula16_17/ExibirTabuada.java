package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class ExibirTabuada {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja exibir a tabuada:");
        int numEscolhido = scan.nextInt();

        System.out.println("Tabuada de " + numEscolhido);

        for (int i = 1; i<=10; i++){
            System.out.println(numEscolhido + " x " + i + " | " + numEscolhido * i);
        }

    }
}
