package phquartin.maratonajava.javacore.ZZIjbdc.test;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .name("NHK")
                .build();
        Producer producer2 = Producer.builder()
                .id(1)
                .name("MADHOUSE")
                .build();
        ProducerService.save(producer);
        //ProducerService.delete(9);
        ProducerService.update(producer2);
//        List<Producer> all = ProducerService.findAll();
//        log.info("Found all producers: {}", all);
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Found producers: {}", producers);
//        ProducerService.showProducerMetaData();
        List<Producer> madHouse = ProducerService.findAll();
        log.info(madHouse);
    }
}
