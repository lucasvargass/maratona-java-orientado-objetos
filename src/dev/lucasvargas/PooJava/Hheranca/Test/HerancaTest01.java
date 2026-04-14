package dev.lucasvargas.PooJava.Hheranca.Test;

import dev.lucasvargas.PooJava.Hheranca.Dominio.Endereco;
import dev.lucasvargas.PooJava.Hheranca.Dominio.Funcionario;
import dev.lucasvargas.PooJava.Hheranca.Dominio.Pessoa;

import java.util.Scanner;

public class HerancaTest01 {

    static void main() {

        Scanner scn = new Scanner(System.in);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Itapage");
        endereco.setCep("24722-180");

        Pessoa pessoa = new Pessoa("LUCAS");
        pessoa.setCfp("999.999.999-200");
        pessoa.setEndereco(endereco);

        System.out.println("===== PESSOA =====");
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("João");
        funcionario.setCfp("111.222.333-44");
        funcionario.setSalario(1600);
        funcionario.setEndereco(endereco);

        System.out.println("===== FUNCIONARIO =====");
        funcionario.imprime();
        funcionario.relatorioPagamento();


    }
}
