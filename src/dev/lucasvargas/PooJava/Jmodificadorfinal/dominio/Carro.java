package dev.lucasvargas.PooJava.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIADADE_LIMITE = 250;

    /*{
        VELOCIADADE_LIMITE = 250;
    }*/

    /*public Carro() {
        VELOCIADADE_LIMITE = 250;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
