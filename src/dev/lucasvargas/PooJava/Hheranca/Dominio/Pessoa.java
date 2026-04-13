package dev.lucasvargas.PooJava.Hheranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cfp;
    protected Endereco endereco;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cfp);
        System.out.println("Endereço: " + endereco.getRua() + " Cep: " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
