package phquartin.maratonajava.javacore.Csobrecargametodos.test;

import phquartin.maratonajava.javacore.Csobrecargametodos.dominio.Desenho;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho = new Desenho();
        desenho.init("Maratona Java", "TV", "Aventura",10);
        desenho.imprimir();
    }
}
