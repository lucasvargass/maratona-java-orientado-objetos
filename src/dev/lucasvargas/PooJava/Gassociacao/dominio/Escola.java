package dev.lucasvargas.PooJava.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professors;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professors) {
        this.nome = nome;
        this.professors = professors;
    }

    public void imprime(){
        System.out.println("===== RESULTADO =====");
        System.out.println("Escola: " + this.nome);
        if (professors == null) return;
        for (Professor professor : professors){
            System.out.println("Professor: " + professor.getNome());
            System.out.println("Materia: " + professor.getMateria());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
