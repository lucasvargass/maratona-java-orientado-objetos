package dev.lucasvargas.PooJava.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIADADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    /*{
        VELOCIADADE_LIMITE = 250;
    }*/

    /*public Carro() {
        VELOCIADADE_LIMITE = 250;
    }*/

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
