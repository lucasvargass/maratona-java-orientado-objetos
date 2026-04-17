package dev.lucasvargas.PooJava.Kenum.Test;

import dev.lucasvargas.PooJava.Kenum.dominio.Cliente;
import dev.lucasvargas.PooJava.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    static void main() {

        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Fernando", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Luiz", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);



    }
}
