package dev.lucasvargas.PooJava.Test;

import dev.lucasvargas.PooJava.Dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest01 {

    static void main() {

        Scanner scn = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o seu nome: ");
        pessoa.setNome(scn.next());

        System.out.print("Digite a sua idade: ");
        pessoa.setIdade(scn.nextInt());

        System.out.println("===== RESULTADO =====");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());



    }
}
