package main.java.interfaces;

import java.util.List;


public class CLIInterface  {

    public void all(List<String> columns, List<String> rows) {

        System.out.println("============ clientes ============");
        
        //Melhorar depois
        System.out.println(columns.toString());
        System.out.println(rows.toString());
        
    }
}
