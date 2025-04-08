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

}
