package dev.lucasvargas.PooJava.Gassociacao.Test;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LeituraConsole {

    static void main() {

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scn.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scn.nextInt();

        System.out.print("Digite o seu sexo (M/F): ");
        char sexo = scn.next().charAt(0);

        System.out.println("===== RESULTADO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);


    }
}
