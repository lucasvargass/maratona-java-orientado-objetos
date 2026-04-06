package dev.lucasvargas.PooJava.Csobrecargametodos.Test;

import dev.lucasvargas.PooJava.Csobrecargametodos.Dominio.Anime;

public class AnimeTest01 {

    static void main() {

        Anime anime = new Anime();
        anime.init("GLOBO", "TV", 4, "AÇÃO");
        /*anime.setNome("GLOBO");
        anime.setTipo("TV");
        anime.setEpisodios(4);*/
        anime.imprime();
    }
}
