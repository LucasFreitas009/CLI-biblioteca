package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.model.Cliente;

public class ClientesDAO {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<String> column = new ArrayList<>();
    
    public static List<Cliente> selectClientes(Connection connection) {

        PreparedStatement prstmt = DAO.createQuery(connection, "SELECT * FROM cliente");
        ResultSet rs = DAO.getResult(prstmt);
        
        try{
            while(rs.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setEndereco(rs.getString("endereco"));

                ClientesDAO.clientes.add(cliente);
            }

            setColumns(rs);

            prstmt.close();
            rs.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ClientesDAO.clientes;
    }

    public static void setColumns(ResultSet rs) {
        if(ClientesDAO.column.isEmpty()) {
            ClientesDAO.column = DAO.getColumn(rs);
        } else {
            System.out.println("oi");
        }
    }

    public static List<String> getColumns() {
        return ClientesDAO.column;
    }
}