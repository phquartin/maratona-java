package phquartin.maratonajava.javacore.ZZIjbdc.test;

import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.repository.ProducerRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .name("Studio Deen")
                .build();
        ProducerRepository.save(producer);
    }
}
