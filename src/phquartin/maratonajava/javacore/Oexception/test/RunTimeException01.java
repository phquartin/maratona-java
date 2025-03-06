package phquartin.maratonajava.javacore.Oexception.test;

public class RunTimeException01 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 0));
    }
    private static int divisao (int a, int b) throws IllegalArgumentException {
        if (b == 0) throw new IllegalArgumentException("Argumento invalido, nao pode ser 0");
        return a / b;
    }
}
