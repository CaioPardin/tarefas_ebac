package br.com.cpardin;

import java.util.*;

public class TarefaMod11 {


    public static void main (String args[]) {
        System.out.println("***NOMES***");

        String nome = "Karoline, Juvenal, Maju, Caio";
        System.out.println(nome);

        String [] valoresArray = nome.split(",");

        // lista de nomes ordenados em virgula
        System.out.println("nome ordenado: " + valoresArray[3]);
        System.out.println("nome ordenado: " + valoresArray[1]);
        System.out.println("nome ordenado: " + valoresArray[2]);


    }






}


