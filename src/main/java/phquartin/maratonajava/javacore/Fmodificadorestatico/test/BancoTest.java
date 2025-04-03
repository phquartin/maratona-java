package phquartin.maratonajava.javacore.Fmodificadorestatico.test;

import phquartin.maratonajava.javacore.Fmodificadorestatico.dominio.Banco;

public class BancoTest {
    public static void main(String[] args) {
        Banco conta1 = new Banco("Jorge", "12345678900");
        double juros = Banco.getJuros();
        System.out.println(conta1.getId());
        Banco conta2 = new Banco("Joao", "99911199902");
        System.out.println(conta2.getId());
    }
}
