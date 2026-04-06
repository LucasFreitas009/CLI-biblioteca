//import java.sql.Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import main.java.connections.Connect;
import main.java.dao.ClientesDAO;
import main.java.model.Cliente;

//import main.java.connections.Connect;

public class Teste {
    public static void main(String[] args) {

        try (
            Connection connection = Connect.connect();
        ) {
            List<Cliente> clientes = ClientesDAO.selectClientes(connection);

            for(int i = 0; i < clientes.size(); i ++) {
                System.out.println("id: " + clientes.get(i).getId());
                System.out.println("nome do cliente: " + clientes.get(i).getNome());
                System.out.println("endereço: " + clientes.get(i).getEndereco());
                System.out.println("-".repeat(15));

            }

        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
