package com.liljon.curso_java.aula10;

public class Variaveis {
    public static void main(String[] args) {
        //java convention = camel case
        //começa com minusculo e quando muda de palavra,
        //a letra fica maiuscula

        int idade = 18;
        String nome = "pedro";
        String nomeDoCachorro = "jose";
        float decimal = 2.023f;
        int inteiro = 61;
        float soma = inteiro + decimal;

        idade = 18 + 1;

        System.out.println("Idade de " + nome + " = " + idade);
        System.out.println("Soma de um inteiro com um decimal: " + inteiro + decimal);
    }
}
