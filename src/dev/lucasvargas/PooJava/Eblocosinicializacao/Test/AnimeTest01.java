package dev.lucasvargas.PooJava.Eblocosinicializacao.Test;

import dev.lucasvargas.PooJava.Eblocosinicializacao.Dominio.Anime;

public class AnimeTest01 {

    static void main() {

        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()){
            System.out.println(episodio + " ");
        }


    }
}
