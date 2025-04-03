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
            log.info((rowsAffected == 0) ? "Insert failed 0 rows affected" : "Inserted producer '{}' in database, rows affected: '{}'",producer.getName(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while inserting producer '{}'",producer.getName(), e);
        }
    }
    public static void delete(int id) {
        String sql = "DELETE FROM anime_store.producer WHERE (id = %d);".formatted(id);

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement())
        {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info((rowsAffected == 0) ? "Delete failed, 0 rows affected (maybe the id does not exist)" : "Deleted producer id '{}' from database, rows affected: '{}'",id, rowsAffected);

        } catch (SQLException e) {
            log.error("Error while deleting producer id '{}'",id, e);
        }
    }
}
