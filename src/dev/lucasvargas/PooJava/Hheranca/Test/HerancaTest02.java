package dev.lucasvargas.PooJava.Hheranca.Test;

import dev.lucasvargas.PooJava.Hheranca.Dominio.Funcionario;

// 0 - Bloco de inicialização da superclass e executado quando a JVM carrega a classe pai.
// 1 - Bloco de inicialização da superclass e executado quando a JVM carrega a classe filha.
// 2 - Alocado espaço de memoria pro objeto da superclass
// 3 - Cada atributo da superclasse e criado e inicializado com valores dafault ou o quer for passado da classe pai.
// 4 - O bloco e inicializado da superclass e executado na ordem em que aparece
// 5 - O contrutor e executado da superclass
// 6 - Alocado espaço de memoria pro objeto da subclass
// 7 - Cada atributo da superclasse e criado e inicializado com valores dafault ou o quer for passado da classe filha.
// 8 - O bloco e inicializado da subclass e executado na ordem em que aparece
// 9 - O contrutor e executado da subclass

public class HerancaTest02 {
    static void main() {

        Funcionario funcionario = new Funcionario("LUCAS");


    }
}
