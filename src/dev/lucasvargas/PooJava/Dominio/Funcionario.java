package dev.lucasvargas.PooJava.Dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private double diasTrabalhados;

    public void imprimeFuncionario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salario: " + "R$" + this.salario);
        System.out.println("Dias Trabalhados: " + this.diasTrabalhados);
        System.out.println("Voce ganha esse valor por dia: " + "R$" + getdiasTrabalhados());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getdiasTrabalhados() {

        int resultado = (int) (salario / diasTrabalhados);
        return resultado;
    }

    public void setdiasTrabalhados(double diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
}
