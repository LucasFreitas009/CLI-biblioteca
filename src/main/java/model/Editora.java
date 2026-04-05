package main.java.model;

public class Editora {
    private int id;
    private String nomeEditora;
    private String endereco;

    public int getId() {
        return this.id;
    }

    public String nomeEditora() {
        return this.nomeEditora;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
