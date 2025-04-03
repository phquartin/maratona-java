package phquartin.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        for (String s : texto.split(",")) {
            System.out.println(s.trim());
        }

    }
}
