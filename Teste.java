//import java.sql.Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import main.java.connections.Connect;
import main.java.dao.ClientesDAO;
import main.java.interfaces.CLIInterface;

public class Teste {
    public static void main(String[] args) {
        
        try (
            Connection connection = Connect.connect();
        ) {
            ClientesDAO.selectClientes(connection);
            List<String> columns = ClientesDAO.getColumns();
            
            CLIInterface cliInterface = new CLIInterface();
            
            cliInterface.all(columns, ClientesDAO.getRows());

        } catch (SQLException e) {
            System.out.println("Error");
        }
    }
}
