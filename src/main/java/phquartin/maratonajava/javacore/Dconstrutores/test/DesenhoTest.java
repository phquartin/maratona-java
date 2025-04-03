package phquartin.maratonajava.javacore.Dconstrutores.test;

import phquartin.maratonajava.javacore.Dconstrutores.dominio.Desenho;

public class DesenhoTest {
    public static void main(String[] args) {
        Desenho desenho = new Desenho("Maratona Java", "TV", "Aventura",10);
        Desenho desenho2 = new Desenho("Maratona Java", "TV", "Aventura",10, "Robert Richards");
        desenho.imprimir();
        desenho2.imprimir();
    }
}
