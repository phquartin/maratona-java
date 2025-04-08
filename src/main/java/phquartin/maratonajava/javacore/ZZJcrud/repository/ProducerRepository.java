package phquartin.maratonajava.javacore.ZZJcrud.repository;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static List<Producer> findByName(String name){
        List<Producer> producers = new ArrayList<>();
        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM producers WHERE name LIKE ?");){
            ps.setString(1, String.format("%%%s%%", name));
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Producer producer = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        }catch (SQLException e){
            log.error("Erro at finding producers by name {}! ", name);
            log.error(e.getMessage());
        }
        return producers;
    }

    public static void delete(int id){
        try(Connection connection = ConnectionFactory.getConnection();
        PreparedStatement ps = connection.prepareStatement("DELETE FROM producers WHERE id = ?")) {

            ps.setInt(1, id);
            ps.execute();
            log.info("Producer with id {} deleted!", id);
        }catch (SQLException e){
            log.error("Erro at deleting producer with id {}! ", id);
            log.error(e.getMessage());
        }
    }

    public static void create(Producer producer){
        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement ps = connection.prepareStatement("INSERT INTO producers(name) VALUES (?)")){
            ps.setString(1, producer.getName());
            ps.execute();
            log.info("Producer {} created!", producer.getName());
        }catch (SQLException e){
            log.error("Erro at creating producer {}! ", producer.getName());
        }
    }

    public static void update(Producer producer){
        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement ps = connection.prepareStatement("UPDATE producers SET name = ? WHERE id = ?")){
            ps.setString(1, producer.getName());
            ps.setInt(2, producer.getId());
            ps.execute();
            log.info("Producer {} updated!", producer.getName());
        }catch (SQLException e){
            log.error("Erro at updating producer {}! ", producer.getName());
        }
    }

}
