package br.com.cpardin;


public class programa {
    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica("Cristiano", "123.456.789-01");
        PessoaJuridica juridica = new PessoaJuridica("Rafael", "12.345.678/0001-23");

        System.out.println("Dados da Pessoa Física:");
        System.out.println("Nome: " + fisica.getNome());
        System.out.println("CPF: " + fisica.getCpf());

        System.out.println("\nDados da Pessoa Jurídica:");
        System.out.println("Nome: " + juridica.getNome());
        System.out.println("CNPJ: " + juridica.getCnpj());
    }
}