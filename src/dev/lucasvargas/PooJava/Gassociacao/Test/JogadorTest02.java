package dev.lucasvargas.PooJava.Gassociacao.Test;

import dev.lucasvargas.PooJava.Gassociacao.dominio.Jogador;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Time;

public class JogadorTest02 {

    static void main() {

        Jogador jogador01 = new Jogador("Neymar Jr");
        Time time01 = new Time("Santos");
        jogador01.setTime(time01);
        jogador01.imprime();

        Jogador jogador02 = new Jogador("Vini Jr");
        Time time02 = new Time("Real Madrid");
        jogador02.setTime(time02);
        jogador02.imprime();

        Jogador jogador03 = new Jogador("Raphinha");
        Time time03 = new Time("Barcelona");
        jogador03.setTime(time03);
        jogador03.imprime();

        System.out.println("=====================");


    }
}
