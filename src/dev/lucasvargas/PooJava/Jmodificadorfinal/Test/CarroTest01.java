package dev.lucasvargas.PooJava.Jmodificadorfinal.Test;

import dev.lucasvargas.PooJava.Jmodificadorfinal.dominio.Carro;
import dev.lucasvargas.PooJava.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    static void main() {

        Carro carro = new Carro();
        // System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.VELOCIADADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("LUCAS VARGAS");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("LUCAS VARGAS");
        ferrari.imprime();


    }
}
