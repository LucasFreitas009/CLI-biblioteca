package main.java.model;

public class Autor {
    private int id;
    private String nomeAutor;

    public int getId(){
        return this.id;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
