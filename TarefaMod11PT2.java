package br.com.cpardin;

public class TarefaMod11PT2 {

    public static void main (String args[]) {
        System.out.println("***NOMES***");

        String nome = "Karoline, Juvenal, Maju, Caio";
        System.out.println(nome);
        String sexo = "Masc, Fem";
        System.out.println(sexo);

        String [] valoresArray = nome.split(",");
        String [] valoresArray1 = sexo.split(",");

        // lista de nomes ordenados em virgula

        System.out.println("nome ordenado: " + valoresArray[3] + " sexo: " + valoresArray1[0]);
        System.out.println("nome ordenado: " + valoresArray[1] + " sexo: " + valoresArray1[0]);
        System.out.println("nome ordenado: " + valoresArray[2] + " sexo: " + valoresArray1[1]);
        System.out.println("nome ordenado: " + valoresArray[0] + " sexo: " + valoresArray1[1]);



    }
}
