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
    
    public static List<Cliente> selectClientes(Connection connection) {

        try {
            PreparedStatement prstmt = DAO.createQuery(connection, "SELECT * FROM cliente");
            ResultSet rs = prstmt.executeQuery();


            while(rs.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome_cliente"));
                cliente.setEndereco(rs.getString("endereco"));

                clientes.add(cliente);
            }
            
            prstmt.close();
            rs.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ClientesDAO.clientes;
    }
}
