package phquartin.maratonajava.javacore.ZZIjbdc.repository;

import phquartin.maratonajava.javacore.ZZIjbdc.conn.ConnectionFactory;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "select * from anime_store.producer where name like ?;";
        try(JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()){
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();
            while(jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;
    }
}
