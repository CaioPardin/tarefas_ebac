package br.com.cpardin;


public class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

}
