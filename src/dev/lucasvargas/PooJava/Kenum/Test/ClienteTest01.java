package dev.lucasvargas.PooJava.Kenum.Test;

import dev.lucasvargas.PooJava.Kenum.dominio.Cliente;
import dev.lucasvargas.PooJava.Kenum.dominio.TipoCliente;
import dev.lucasvargas.PooJava.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    static void main() {

        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("João", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));



    }
}
