package main.java.model;

public class Cliente {
    private int id;
    private String nomeCliente;
    private String endereco;

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nomeCliente;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
