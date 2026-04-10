package dev.lucasvargas.PooJava.Gassociacao.Test;

import dev.lucasvargas.PooJava.Gassociacao.dominio.Jogador;
import dev.lucasvargas.PooJava.Gassociacao.dominio.Time;

public class JogadorTest03 {

    static void main() {

        // Associação bidirecional

        Jogador jogador = new Jogador("Neymar Jr");
        Jogador jogador02 = new Jogador("Gabigol");
        Time time = new Time("Santos");
        Jogador[] jogadores = {jogador, jogador02};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("===== JOGADORES =====");
        jogador.imprime();
        System.out.println("===== TIME =====");
        time.imprime();


    }
}
