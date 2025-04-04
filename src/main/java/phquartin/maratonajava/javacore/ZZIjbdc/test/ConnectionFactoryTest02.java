package phquartin.maratonajava.javacore.ZZIjbdc.test;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;
import phquartin.maratonajava.javacore.ZZIjbdc.service.ProducerServiceRowSet;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        List<Producer> mad = ProducerServiceRowSet.findByNameJdbcRowSet("Mad");
        log.info(mad);
    }
}
