package dev.lucasvargas.PooJava.Gassociacao.Test;

import dev.lucasvargas.PooJava.Gassociacao.dominio.Aluno;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Local;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Professor;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Seminario;

import java.util.Scanner;

public class AssociacaoTest01 {

    static void main() {

        Local local = new Local("Rua Julio Lima");

        Aluno aluno1 = new Aluno("Lucas", 20);
        Aluno aluno2 = new Aluno("Carina", 20);

        Professor professor = new Professor("Wagner", "Matematica");
        Aluno[] alunosParaSeminarios = {aluno1, aluno2};
        Seminario seminario = new Seminario("Matematica Financeira", alunosParaSeminarios, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprimir();
    }
}
