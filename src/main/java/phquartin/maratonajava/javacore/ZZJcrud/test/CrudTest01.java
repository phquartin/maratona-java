package phquartin.maratonajava.javacore.ZZJcrud.test;

import phquartin.maratonajava.javacore.ZZJcrud.controller.ProducerController;

public class CrudTest01 {


    public static void main(String[] args) {
        while (true){
            try {
                ProducerController.buildMenu();
            }catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

}
