package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    private static PreparedStatement prstmt;
    private static ResultSet resultSet;
    private static ResultSetMetaData metaData;

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

    public static List<String> getColumn(ResultSet rs) {
        
        List<String> nameColumns = new ArrayList<>();

        try {
            DAO.metaData = rs.getMetaData();
            int totalColumn = DAO.metaData.getColumnCount();

            for(int i = 1; i <= totalColumn; i++) {
                nameColumns.add(DAO.metaData.getColumnName(i));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao tentar consultar metadados.");
        }

        return nameColumns; 
    }
}
