package com.liljon.curso_java.exerciciosAulas11_12_13;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o R$ por hora");
        double recebeHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas");
        int horas = scan.nextInt();

        double salarioBruto = recebeHora * horas;

        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - (impostoDeRenda + inss + sindicato);

        System.out.println();
        System.out.println("Seu extrato:");
        System.out.println("===========================");
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto do Imposto de Renda: R$ " + impostoDeRenda);
        System.out.println("Desconto do INSS: R$ " + inss);
        System.out.println("Desconto do sindicato: R$ " + sindicato);
        System.out.println();
        System.out.println("Salário liquido: R$ " + salarioLiquido);
        



    }
}
