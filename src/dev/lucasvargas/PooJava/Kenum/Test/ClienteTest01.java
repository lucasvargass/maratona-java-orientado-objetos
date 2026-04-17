package dev.lucasvargas.PooJava.Kenum.Test;

import dev.lucasvargas.PooJava.Kenum.dominio.Cliente;
import dev.lucasvargas.PooJava.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    static void main() {

        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);



    }
}
