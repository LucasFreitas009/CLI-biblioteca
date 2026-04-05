package main.java.connections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connect {
    private static Connection connection;
    
    public static Connection connect() {
        Properties properties = new Properties(); 
        
        try {
            //Leitura do arquivo properties
            FileInputStream fileProperties = new FileInputStream("data.properties");
            properties.load(fileProperties);

            // Conexão com o banco de dados
            Connect.connection = DriverManager.getConnection(
                properties.getProperty("db.url"),
                properties.getProperty("db.user"),
                properties.getProperty("db.password")
            );

            System.out.println("Conexão realizada!");
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao tentar instânciar objeto fileProperties.");

        } catch (IOException e) {
            System.err.println("Erro ao tentar ler arquivo properties.");
        
        } catch (SQLException e) {
            System.err.println("Erro ao tentar realizar conexão com o banco de dados.");
        }

        return connection;
    }
}
