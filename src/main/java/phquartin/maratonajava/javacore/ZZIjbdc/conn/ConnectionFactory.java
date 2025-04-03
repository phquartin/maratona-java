package phquartin.maratonajava.javacore.ZZIjbdc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established: " + connection);
        } catch (SQLException e) {
            System.out.println("Erro na conexao com a DB!!!"+ e.getMessage());
        }
        return null;
    }
}
