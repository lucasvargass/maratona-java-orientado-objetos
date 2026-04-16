package dev.lucasvargas.PooJava.Hheranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cfp;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estatico pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicializaçãode pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicializaçãode pessoa 2 ");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cfp) {
        this(nome);
        this.cfp = cfp;
    }

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
