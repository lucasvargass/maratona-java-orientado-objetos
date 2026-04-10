package dev.lucasvargas.PooJava.Gassociacao.Test;

import dev.lucasvargas.PooJava.Gassociacao.dominio.Escola;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    static void main() {

        Professor professor = new Professor("Roger", "Historia");
        Professor professor2 = new Professor("Marcos", "Ingles");
        Professor[] professors = {professor, professor2};
        Escola escola = new Escola("Externato Julio Lima", professors);
        escola.imprime();


    }
}
