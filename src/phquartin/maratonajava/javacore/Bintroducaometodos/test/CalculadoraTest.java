package phquartin.maratonajava.javacore.Bintroducaometodos.test;

import phquartin.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(new double[]{1, 2, 3}));
        System.out.println(calc.subtracao(new int[]{1, 2, 3}));
        System.out.println(calc.multiplicacao(1, 2, 3, 10, 2));
    }
}
