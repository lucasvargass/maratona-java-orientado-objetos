package dev.lucasvargas.PooJava.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        calcularBonus();
    }

    public abstract void calcularBonus();
}
