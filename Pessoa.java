package br.com.cpardin;




public abstract class Pessoa {
    private String nome;


    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método getter para o nome
    public String getNome() {
        return nome;
    }
}
