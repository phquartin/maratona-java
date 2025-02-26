package phquartin.maratonajava.javacore.Fmodificadorestatico.test;

import phquartin.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 320);
        Carro c3 = new Carro("Toyota", 240);
        System.out.println(Carro.getVelocidadeLimite());
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
