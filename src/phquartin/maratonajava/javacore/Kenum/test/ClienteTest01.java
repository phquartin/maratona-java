package phquartin.maratonajava.javacore.Kenum.test;

import phquartin.maratonajava.javacore.Kenum.dominio.Cliente;
import phquartin.maratonajava.javacore.Kenum.dominio.TipoCliente;
import phquartin.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        System.out.println(cliente01);
        System.out.println(cliente01.getTipoPagamento().calcularDesconto(100));
        Cliente cliente02 = new Cliente("Joao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente02);
        System.out.println(cliente02.getTipoPagamento().calcularDesconto(100));
        System.out.println(TipoCliente.obterTipoCliente(1));
    }
}
