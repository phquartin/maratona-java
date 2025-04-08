package phquartin.maratonajava.javacore.ZZJcrud.test;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZJcrud.controller.ProducerController;
@Log4j2
public class CrudTest01 {


    public static void main(String[] args) {
        while (true){
            try {
                ProducerController.buildMenu();
            }catch (Exception e){
                log.error("Erro: {}", e.getMessage());
            }
        }
    }

}
