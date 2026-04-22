package dev.lucasvargas.PooJava.Lclassesabstratas.Test;

import dev.lucasvargas.PooJava.Lclassesabstratas.dominio.Desenvolvedor;
import dev.lucasvargas.PooJava.Lclassesabstratas.dominio.Funcionario;
import dev.lucasvargas.PooJava.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    static void main() {

        Gerente gerente = new Gerente("FERNANDO", "GERENTE", 6000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("LUCAS", "Desenvolvedor", 12000);
        System.out.println(desenvolvedor);


    }
}
