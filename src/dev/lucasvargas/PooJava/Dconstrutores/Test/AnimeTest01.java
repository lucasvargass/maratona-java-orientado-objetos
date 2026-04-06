package dev.lucasvargas.PooJava.Dconstrutores.Test;

import dev.lucasvargas.PooJava.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {

    static void main() {

        Anime anime = new Anime("GLOBO", "TV", 4, "AÇÃO");
        Anime anime02 = new Anime();
        // anime.init("GLOBO", "TV", 4, "AÇÃO");
        /*anime.setNome("GLOBO");
        anime.setTipo("TV");
        anime.setEpisodios(4);*/
        anime.imprime();
        anime02.imprime();
    }
}
