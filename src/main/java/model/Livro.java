package main.java.model;

import java.time.LocalDate;

public class Livro {
    private int id;
    private String titulo;
    private LocalDate ano;
    private String descricao;

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public LocalDate getAno() {
        return this.ano;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
