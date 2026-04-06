package dev.lucasvargas.PooJava.Dconstrutores.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // sobrecarga de construtores
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public void imprime(){
        System.out.println("===== RESULTADO =====");
        System.out.println("TIPO: " + this.tipo);
        System.out.println("EP: " + this.episodios);
        System.out.println("NOME: " + this.nome);
        System.out.println("GENERO: " + this.genero);
        System.out.println("ESTUDIO: " + this.estudio);
        System.out.println("=====================");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
