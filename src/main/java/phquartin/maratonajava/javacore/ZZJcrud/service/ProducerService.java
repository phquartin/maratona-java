package phquartin.maratonajava.javacore.ZZJcrud.service;

import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;
import phquartin.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
    public static void delete(int id){
        if (id <= 0) throw new IllegalArgumentException("Producer id must be greater than 0!");
        ProducerRepository.delete(id);
    }
    public static void create(Producer producer){
        if (producer == null) throw new IllegalArgumentException("Producer cannot be null!");
        if (producer.getName() == null || producer.getName().isBlank()) throw new IllegalArgumentException("Producer name cannot be null or blank!");
        ProducerRepository.create(producer);
    }

}
