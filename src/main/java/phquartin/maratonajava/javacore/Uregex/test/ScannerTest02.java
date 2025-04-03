package phquartin.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                System.out.println(valor);
            }else if (scanner.hasNextBoolean()) {
                boolean valor = scanner.nextBoolean();
                System.out.println(valor);
            }
            System.out.println(scanner.next());
        }
    }
}
