package dev.lucasvargas.PooJava.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, String cargo, double salario) {
        super(nome, cargo ,salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
