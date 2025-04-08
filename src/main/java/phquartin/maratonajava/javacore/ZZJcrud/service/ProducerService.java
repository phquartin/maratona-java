package phquartin.maratonajava.javacore.ZZJcrud.service;

import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;
import phquartin.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
    public static void delete(int id){
        ProducerRepository.delete(id);
    }

}
