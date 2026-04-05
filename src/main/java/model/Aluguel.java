package main.java.model;

import java.time.LocalDate;

public class Aluguel {
    private int id;
    private LocalDate dataAluguel;
    private int idCliente;
    private int idLivro;

    public int getId() {
        return this.id;
    }

    public LocalDate getDataAluguel() {
        return this.dataAluguel;
    }

    public int idCliente() {
        return this.idCliente;
    }

    public int idLivro() {
        return this.idLivro;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }
}
