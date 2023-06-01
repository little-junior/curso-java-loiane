package com.liljon.curso_java.exerciciosAulas11_12_13;

import java.util.Scanner;

public class FarenheitPCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit");
        double fahrenheit = scan.nextDouble();

        double celsius = (5 * (fahrenheit-32) / 9);

        System.out.println(fahrenheit + " ºF em ºC é " + celsius);
    }
}
