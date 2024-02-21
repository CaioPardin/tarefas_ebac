package br.com.cpardin;

public class tarefaMod9 {

    public static void main(String args []) {

        // primitivo
        int idade = 10;
        System.out.println(idade);

        long cpf = 123456789;
        System.out.println(cpf);


        // conversão wappers

        int idade1 = Integer.valueOf(idade);
        System.out.println(idade1);

        long cpf1 = Long.valueOf(cpf);
        System.out.println(cpf1);

    }
}
