package phquartin.maratonajava.javacore.ZZIjbdc.test;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .id(2)
                .name("Normal House")
                .build();
        //ProducerService.save(producer);
        //ProducerService.delete(7);
        //ProducerService.update(producer);
        List<Producer> all = ProducerService.findAll();
        log.info("Found all producers: {}", all);
    }
}
