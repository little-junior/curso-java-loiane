package com.liljon.curso_java.exerciciosAula16_17;

import java.util.Scanner;

public class usuarioeSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        boolean iguais = true;

        while (iguais){
            System.out.println("Digite o usuário");
            usuario = scan.next();

            System.out.println("Digite a senha");
            senha = scan.next();

            if (usuario.equals(senha)){
                System.out.println("Usuário e senhas iguais. Digite novamente");
            } else {
                System.out.println("Acesso permitido.");
                iguais = false;
            }
        }
    }
}
