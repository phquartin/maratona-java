package phquartin.maratonajava.javacore.ZZIjbdc.service;

import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.repository.ProducerRepository;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }
    public static void delete(int id) {
        if(id <=0 ){
            throw new IllegalArgumentException("Id must be greater than zero");
        }
        ProducerRepository.delete(id);
    }
}
