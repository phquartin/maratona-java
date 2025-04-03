package phquartin.maratonajava.javacore.ZZIjbdc.service;

import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }
    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }
    private static void requireValidId(Integer id) {
        if(id == null || id <= 0 ){
            throw new IllegalArgumentException("Id must be greater than zero");
        }
    }
}
