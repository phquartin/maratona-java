package phquartin.maratonajava.javacore.ZZJcrud.test;

import phquartin.maratonajava.javacore.ZZJcrud.controller.AnimeController;
import phquartin.maratonajava.javacore.ZZJcrud.controller.ProducerController;

import java.util.Scanner;

public class CrudTest02 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Type the number of the option you want to execute:");
            System.out.println("0 - Exit");
            System.out.println("1 - Producer");
            System.out.println("2 - Anime");
            System.out.print("Enter your option: ");
            int op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    ProducerController.buildMenu();
                    break;
                case 2:
                    AnimeController.buildMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
