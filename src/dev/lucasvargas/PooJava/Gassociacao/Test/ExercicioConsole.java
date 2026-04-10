package dev.lucasvargas.PooJava.Gassociacao.Test;

import java.util.Scanner;

public class ExercicioConsole {

    static void main() {

        Scanner scn = new Scanner(System.in);

        System.out.println("O grande software da previsão do futuro");
        System.out.println("Digite a sua pergunta e eu responderei SIM ou NÃO");
        System.out.print("Faça a sua pergunta: ");
        String pergunta = scn.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            if (pergunta.charAt(2) == ' '){
                System.out.println("NÃO");
            }
        }


    }
}
