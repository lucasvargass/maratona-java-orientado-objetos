package dev.lucasvargas.PooJava.Test;

import dev.lucasvargas.PooJava.Dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {

    static void main() {

        Funcionario funcionario = new Funcionario();
        Scanner scn = new Scanner(System.in);

        System.out.print("Funcionario Digite o seu nome: ");
        funcionario.setNome(scn.next());

        System.out.print("Informe a sua idade: ");
        funcionario.setIdade(scn.nextInt());

        System.out.print("Qual e o seu salario: ");
        funcionario.setSalario(scn.nextDouble());

        System.out.print("Quantos dias voce trabalha no mes: ");
        funcionario.setdiasTrabalhados(scn.nextDouble());

        System.out.println("===== RESULTADO =====");
        funcionario.imprimeFuncionario();




    }
}
