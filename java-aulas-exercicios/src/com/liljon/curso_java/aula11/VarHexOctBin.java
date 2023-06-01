package com.liljon.curso_java.aula11;

public class VarHexOctBin {
    public static void main(String[] args) {
        int hexVal = 0x000A;
        int decVal = 1_0;
        int octVal = 011;
        int binVal = 0b1100110101010;

        System.out.print("" + "\t" + (hexVal == decVal));
    }
}
