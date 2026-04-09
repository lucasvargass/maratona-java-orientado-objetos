package dev.lucasvargas.PooJava.Gassociacao.Test;

import dev.lucasvargas.PooJava.Gassociacao.dominio.Jogador;

public class JogadorTest01 {

    static void main() {

        Jogador jogador01 = new Jogador("Neymar");

        Jogador jogador02 = new Jogador("Vini jr");

        Jogador jogador03 = new Jogador("Rodrigo");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
