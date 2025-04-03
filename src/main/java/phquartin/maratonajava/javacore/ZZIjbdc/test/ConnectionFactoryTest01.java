package phquartin.maratonajava.javacore.ZZIjbdc.test;

import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.service.ProducerService;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .id(2)
                .name("Normal House")
                .build();
        //ProducerService.save(producer);
        //ProducerService.delete(7);
        ProducerService.update(producer);
    }
}
