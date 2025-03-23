package phquartin.maratonajava.javacore.Ycollections.test;

import phquartin.maratonajava.javacore.Ycollections.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("123455", "iPhone");
        Smartphone smartphone2 = new Smartphone("123455", "iPhone");
        System.out.println(smartphone.getSerial().equals(smartphone2.getSerial()));
    }
}
