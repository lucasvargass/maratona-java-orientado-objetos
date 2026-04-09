package dev.lucasvargas.PooJava.Fmodificadorestatico.Test;

import dev.lucasvargas.PooJava.Fmodificadorestatico.Dominio.Carro;

public class CarroTest01 {

    static void main() {

        Carro.setVelociadeLimite(250);

        Carro carro1 = new Carro("FIAT", 150);
        carro1.imprime();

        Carro carro2 = new Carro("BMW", 280);
        carro2.imprime();

        Carro carro3 = new Carro("Audi", 290);
        carro3.imprime();

        System.out.println("=====================");


    }
}
