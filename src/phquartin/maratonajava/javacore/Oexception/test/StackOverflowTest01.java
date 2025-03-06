package phquartin.maratonajava.javacore.Oexception.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    private static void recursividade() {
        recursividade();
    }
}
