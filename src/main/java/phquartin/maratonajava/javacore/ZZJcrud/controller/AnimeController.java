package phquartin.maratonajava.javacore.ZZJcrud.controller;

import phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime;
import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;
import phquartin.maratonajava.javacore.ZZJcrud.service.AnimeService;
import phquartin.maratonajava.javacore.ZZJcrud.service.ProducerService;

import java.util.List;
import java.util.Scanner;

public class AnimeController {
    private static final Scanner sc = new Scanner(System.in);

    public static void buildMenu(){
        System.out.println("Type the number of the option you want to execute:");
        System.out.println("0 - Exit");
        System.out.println("1 - Find by name");
        System.out.println("2 - Delete");
        System.out.println("3 - Create");
        System.out.println("4 - Update");
        System.out.print("Enter your option: ");
        int op = Integer.parseInt(sc.nextLine());
        switch (op){
            case 1:
                System.out.println("Enter the name of the Anime you want to find or empty to all: ");
                List<Anime> byName = AnimeService.findByName(sc.nextLine());
                if (byName.isEmpty()){
                    System.out.println("No Anime found!");
                    break;
                }
                byName.forEach(System.out::println);
                break;
            case 2:
                System.out.print("Enter the id of the Anime you want to delete: ");
                int id = Integer.parseInt(sc.nextLine());
                ProducerService.delete(id);
                break;
            case 3:
                System.out.print("Enter the name of the Anime you want to create: ");
                String name = sc.nextLine();
                System.out.print("Enter the number of episodes of the Anime: ");
                int episodes = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the id of the producer of the Anime or 0 to create a new producer: ");
                int producerId = Integer.parseInt(sc.nextLine());
                if (producerId == 0){
                    System.out.println("Enter the name of the new producer: ");
                    String pName = sc.nextLine();
                    Producer producer = Producer.builder()
                            .name(pName)
                            .build();
                    ProducerService.create(producer);
                    List<Producer> Producers = ProducerService.findByName(pName);
                    producerId = Producers.getFirst().getId();
                }
                Anime Anime = phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime.builder()
                        .name(name)
                        .episodes(episodes)
                        .producer(Producer.builder().id(producerId).build())
                        .build();
                AnimeService.create(Anime);
                break;
            case 4:
                System.out.print("Enter the id of the Anime you want to update: ");
                int idUpdate = Integer.parseInt(sc.nextLine());
                System.out.print("Enter the new name of the Anime: ");
                String newName = sc.nextLine();
                System.out.print("Enter the new number of episodes of the Anime: ");
                int newEpisodes = Integer.parseInt(sc.nextLine());
                Anime producerUpdate = phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime.builder()
                        .id(idUpdate)
                        .name(newName)
                        .episodes(newEpisodes)
                        .build();
                AnimeService.update(producerUpdate);
                break;
            case 5:
                break;
            case 0: System.exit(0);
            default: throw new IllegalArgumentException("Not a valid option");
        }
    }



}
