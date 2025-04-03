package phquartin.maratonajava.javacore.ZZIjbdc.repository;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZIjbdc.conn.ConnectionFactory;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO anime_store.producer (name) VALUES ('%s');".formatted(producer.getName());

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement())
        {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer database, rows affected: '{}'", rowsAffected);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
