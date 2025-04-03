package phquartin.maratonajava.javacore.ZZIjbdc.repository;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZIjbdc.conn.ConnectionFactory;
import phquartin.maratonajava.javacore.ZZIjbdc.dominio.Producer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static void update(Producer producer) {
        String sql = "UPDATE anime_store.producer SET name = '%s' WHERE (id = %d);".formatted(producer.getName(), producer.getId());

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement())
        {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info((rowsAffected == 0) ? "Update failed, 0 rows affected (maybe the id does not exist)" : "Updated producer id '{}' in database, rows affected: '{}'",producer.getId(), rowsAffected);

        } catch (SQLException e) {
            log.error("Error while updating producer, id: '{}'",producer.getId(), e);
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        List<Producer> producers = new ArrayList<>();
        String sql = "SELECT id,name FROM anime_store.producer WHERE name LIKE '%%%s%%';".formatted(name);
        log.info("Finding all producers by name");

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql))
        {
            while (rs.next()) {
                int id = rs.getInt("id");
                String string = rs.getString("name");
                Producer producer = Producer.builder()
                        .id(id)
                        .name(string)
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while finding producer by name", e);
        }
        return producers;
    }

    public static void showProducerMetadata() {
        String sql = "SELECT id,name FROM anime_store.producer";
        log.info("Finding the Metadata from producers");

        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql))
        {
            ResultSetMetaData metaData = rs.getMetaData();
            rs.next();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table - {} : Column - {}", metaData.getTableName(i), metaData.getColumnName(i));
                log.info("Column size: {}",metaData.getColumnDisplaySize(i));
                log.info("Column type: {}",metaData.getColumnTypeName(i));
            }

        } catch (SQLException e) {
            log.error("Error while finding producer by name", e);
        }
    }
}
