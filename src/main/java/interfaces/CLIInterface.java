package main.java.interfaces;

import java.util.List;

import main.java.model.Cliente;

public class CLIInterface  {

    public void all(List<String> columns, List<Cliente> clientes) {
        System.out.println("============ clientes ============");
        
        for(int i = 0; i < clientes.size(); i++) {

            System.out.printf("""
                _____________________________________
                |    %s      |   %s     |    %s     |
                |____________|__________|___________|       
                |    %d      |    %s    |    %s     | 
                |____________|__________|___________|\n
                """, columns.get(0),
                    columns.get(1),
                    columns.get(2),
                    clientes.get(i).getId(),
                    clientes.get(i).getNome(),
                    clientes.get(i).getEndereco()
                );
        }
    }
}
