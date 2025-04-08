package phquartin.maratonajava.javacore.ZZIjbdc.service;

import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.repository.ProducerRepositoryRowSet;

import java.util.ArrayList;
import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameCachedRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameCachedRowSet(name);
    }
    public static void updateCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
