package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class DAO {
    private static PreparedStatement prstmt;
    private static ResultSet resultSet;

    public static PreparedStatement createQuery(Connection connection, String query) {
        
        try {
            DAO.prstmt = connection.prepareStatement(query);
            
        } catch (SQLException e) {
            System.err.println("Erro ao criar objeto PreparedStatement.");
        }

        return DAO.prstmt;
    }

    public static ResultSet getResult(PreparedStatement prstmt) {

        try {
            DAO.resultSet = prstmt.executeQuery();
            
        } catch (SQLTimeoutException e) {
            System.err.println("Tempo esgotado.");
        
        } catch (SQLException e) {
            System.err.println("Erro ao tentar executar query.");    
        }

        return DAO.resultSet;
    }
}
