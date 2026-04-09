package dev.lucasvargas.PooJava.Fmodificadorestatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização e executado quando a JVM carrega a classe.
    // 1 - Alocado o espaço em memoria pro objeto
    // 2 - Cada atributo de classe e criado e inicializado com valores dafault ou o quer for passado.
    // 3 - O bloco e inicializado e executa.
    // 4 - O contrutor e executado.

    static {
        System.out.println("Dentro do bloco de inicialização estático 01");
        episodios = new int [100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i + 1;
        }

    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 02");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 03");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático 01");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios : Anime.episodios)
        System.out.println(episodios + " ");

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
