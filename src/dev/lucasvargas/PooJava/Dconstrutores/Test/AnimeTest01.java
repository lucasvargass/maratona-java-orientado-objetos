package dev.lucasvargas.PooJava.Dconstrutores.Test;

import dev.lucasvargas.PooJava.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {

    static void main() {

        Anime anime = new Anime("Globo", "TV", 4, "Ação", "Produção IG");
        // anime.init("GLOBO", "TV", 4, "AÇÃO");
        /*anime.setNome("GLOBO");
        anime.setTipo("TV");
        anime.setEpisodios(4);*/
        anime.imprime();
    }
}
