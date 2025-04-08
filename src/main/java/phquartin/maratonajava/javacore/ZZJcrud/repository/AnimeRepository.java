package phquartin.maratonajava.javacore.ZZJcrud.repository;

import lombok.extern.log4j.Log4j2;
import phquartin.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime;
import phquartin.maratonajava.javacore.ZZJcrud.dominio.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {

    public static List<Anime> findByName(String name) {
        List<Anime> animes = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement("""
                     SELECT a.id, a.name, a.episodes, a.id_producer, p.name AS producer_name 
                     FROM animes a INNER JOIN producers p ON p.id = a.id_producer 
                     WHERE a.name LIKE ?
                     """)) {
            ps.setString(1, String.format("%%%s%%", name));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("id_producer"))
                        .name(rs.getString("producer_name"))
                        .build();
                Anime Anime = phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(Anime);
            }
        } catch (SQLException e) {
            log.error("Erro at finding animes by name {}! ", name);
            log.error(e.getMessage());
        }
        return animes;
    }

    public static Optional<Anime> findById(int id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = connection.prepareStatement("""
                     SELECT a.id, a.name, a.episodes, a.id_producer, p.name AS producer_name 
                     FROM animes a INNER JOIN producers p ON p.id = a.id_producer 
                     WHERE a.id = ?
                     """)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .id(rs.getInt("id_producer"))
                    .name(rs.getString("producer_name"))
                    .build();
            Anime Anime = phquartin.maratonajava.javacore.ZZJcrud.dominio.Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
            return Optional.of(Anime);
    }catch(SQLException e)
    {
        log.error("Erro at finding animes by id {}! ", id);
        log.error(e.getMessage());
    }
        return Optional.empty();
}

public static void delete(int id) {
    try (Connection connection = ConnectionFactory.getConnection();
         PreparedStatement ps = connection.prepareStatement("DELETE FROM animes WHERE id = ?")) {

        ps.setInt(1, id);
        ps.execute();
        log.info("Anime with id {} deleted!", id);
    } catch (SQLException e) {
        log.error("Erro at deleting Anime with id {}! ", id);
        log.error(e.getMessage());
    }
}

public static void create(Anime Anime) {
    try (Connection connection = ConnectionFactory.getConnection();
         PreparedStatement ps = connection.prepareStatement("INSERT INTO animes(name, episodes, id_producer) VALUES (?, ?, ?)")) {
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getProducer().getId());
        ps.execute();
        log.info("Anime {} created!", Anime.getName());
    } catch (SQLException e) {
        log.error("Erro at creating Anime {}!\n {} ", Anime.getName(), e.getMessage());
    }
}

public static void update(Anime Anime) {
    try (Connection connection = ConnectionFactory.getConnection();
         PreparedStatement ps = connection.prepareStatement("UPDATE animes SET name = ?, episodes = ? WHERE id = ?")) {
        ps.setString(1, Anime.getName());
        ps.setInt(2, Anime.getEpisodes());
        ps.setInt(3, Anime.getId());
        ps.execute();
        log.info("Anime {} updated!", Anime.getName());
    } catch (SQLException e) {
        log.error("Erro at updating Anime {}! ", Anime.getName());
    }
}

}
