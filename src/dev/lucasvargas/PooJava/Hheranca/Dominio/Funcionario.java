package dev.lucasvargas.PooJava.Hheranca.Dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializaçãode funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicializaçãode funcionario 2 ");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do contrutor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
