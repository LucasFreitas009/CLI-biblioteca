package main.java.interfaces;

import java.util.List;

import main.java.model.Cliente;

public class CLIInterface  {

    public void all(List<String> columns, List<Cliente> clientes) {

        System.out.println("============ clientes ============");
        
        for(int i = 0; i < clientes.size(); i++) {
            int linhaColumnID = columns.get(0).length();
            int linhaColumnNOME = columns.get(1).length();
            int linhaColumnENDE = columns.get(2).length();

            
            String linhaID1 = Integer.toString(clientes.get(i).getId());
            int linhaID = linhaID1.length();
            int linhaNOME = clientes.get(i).getNome().length();
            int linhaENDE = clientes.get(i).getEndereco().length();

            int linha = 3;

            System.out.printf("""
                %s%s%s
                | %s%s | %s%s | %s%s |
                |%s%s%s|
                | %d%s | %s%s | %s%s |
                %s%s%s
                """, 
                "-".repeat(linha + linhaColumnID + linhaID + 1),
                "-".repeat(linha + linhaColumnNOME + linhaNOME),
                "-".repeat(linha + linhaColumnENDE + linhaENDE),
                columns.get(0),
                " ".repeat(linhaID),
                columns.get(1),
                " ".repeat(linhaNOME),
                columns.get(2),
                " ".repeat(linhaENDE),
                "-".repeat(linha + linhaColumnID + linhaID),
                "-".repeat(linha + linhaColumnNOME + linhaNOME),
                "-".repeat(linha + linhaColumnENDE + linhaENDE - 1),
                clientes.get(i).getId(),
                " ".repeat(linhaColumnID),
                clientes.get(i).getNome(),
                " ".repeat(linhaColumnNOME),
                clientes.get(i).getEndereco(),
                " ".repeat(linhaColumnENDE),
                "-".repeat(linha + linhaColumnID + linhaID),
                "-".repeat(linha + linhaColumnNOME + linhaNOME),
                "-".repeat(linha + linhaColumnENDE + linhaENDE + 1)
            );
        }
    }
}
