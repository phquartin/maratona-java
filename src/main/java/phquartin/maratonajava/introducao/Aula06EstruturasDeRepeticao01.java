package phquartin.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("--------------------------------");

        do {
            count--;
            System.out.println(count);
        }while (count > 0);

        System.out.println("-------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "i");
        }
    }
}
