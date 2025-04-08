package phquartin.maratonajava.javacore.ZZJcrud.controller;

import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;
import phquartin.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.List;
import java.util.Scanner;

public class ProducerController {
    private static final Scanner sc = new Scanner(System.in);

    public static void buildMenu(){
        System.out.println("Type the number of the option you want to execute:");
        System.out.println("0 - Exit");
        System.out.println("1 - Find by name");
        System.out.println("2 - Delete");
        System.out.println("3 - Create");
        System.out.print("Enter your option: ");
        int op = Integer.parseInt(sc.nextLine());
        switch (op){
            case 1:
                System.out.println("Enter the name of the producer you want to find or empty to all: ");
                List<Producer> byName = ProducerService.findByName(sc.nextLine());
                if (byName.isEmpty()){
                    System.out.println("No producer found!");
                    break;
                }
                byName.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Enter the id of the producer you want to delete: ");
                int id = Integer.parseInt(sc.nextLine());
                ProducerService.delete(id);
                break;
            case 3:
                System.out.print("Enter the name of the producer you want to create: ");
                String name = sc.nextLine();
                Producer producer = Producer.builder().name(name).build();
                ProducerService.create(producer);
                break;
            case 0: System.exit(0);
            default: throw new IllegalArgumentException("Not a valid option");
        }
    }



}
