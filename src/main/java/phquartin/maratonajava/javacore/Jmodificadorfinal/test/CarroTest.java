package phquartin.maratonajava.javacore.Jmodificadorfinal.test;

import phquartin.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.comprador);
        carro.comprador.setNome("Joao");
        System.out.println(carro.comprador);
    }
}
