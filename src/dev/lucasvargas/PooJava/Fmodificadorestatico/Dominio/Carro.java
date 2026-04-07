package dev.lucasvargas.PooJava.Fmodificadorestatico.Dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    // Modificador static
    private static double velociadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("===== RESULTADO =====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velociadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelociadeLimite() {
        return velociadeLimite;
    }

    public void setVelociadeLimite(double velociadeLimite) {
        Carro.velociadeLimite = velociadeLimite;
    }
}
